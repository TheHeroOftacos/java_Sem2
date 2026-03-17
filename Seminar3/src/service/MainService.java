package service;

import java.util.ArrayList;
import java.util.Arrays;

import model.Course;
import model.Grade;
import model.Professor;
import model.Student;
import modelenum.Profdegree;

public class MainService {

	private static ArrayList<Student> allstudents = new ArrayList<Student>();
	private static ArrayList<Professor> allprofessors = new ArrayList<Professor>();
	private static ArrayList<Course> allcourses = new ArrayList<Course>();
	private static ArrayList<Grade> allgrades = new ArrayList<Grade>();

	public static void main(String[] args) {
		//datu tips 	nosaukums   =new konstruktors();
		Student   		stud1   	= new Student();
		Student   		stud2   	= new Student("Rendijs", "Berzins-Kalnins", "010101-12345");
		Student   		stud3   	= new Student("123456", "Ber2ins", null);
		allstudents.addAll(Arrays.asList(stud1, stud2, stud3));
		System.out.println(allstudents);

		Professor 		prof1   	= new Professor();
		Professor 		prof2   	= new Professor("Maris", "Berzins", "010101-12345", Profdegree.phd);
		Professor 		prof3   	= new Professor("123s56", "Kalnins", null, Profdegree.other);
		allprofessors.addAll(Arrays.asList(prof1, prof2, prof3));

		System.out.println(allprofessors);

		Course 		course1   	= new Course("Mathematics", (byte) 3, prof1);
		Course 		course2   	= new Course("Physics", (byte) 14, prof2);
		Course 		course3   	= new Course("Chemistry chem", (byte) 31, prof3);
		allcourses.addAll(Arrays.asList(course1, course2, course3));
		System.out.println(allcourses);

		Grade 		grade1   	= new Grade(8, stud1, course1);
		Grade 		grade2   	= new Grade(9, stud2, course2);
		Grade 		grade3   	= new Grade(7, stud3, course3);
		allgrades.addAll(Arrays.asList(grade1, grade2, grade3));
		System.out.println(allgrades);

	}


	//CRUD C - create R - retrieve U - update D - delete
	//C - create student
	public void createStudent(String inputName, String inputSurname, String inputPersonCode) throws Exception {
		//TODO parbaudit ienakosos parametrus
		for(Student tempS : allstudents){
			if(tempS.getPersonCode().equals(inputPersonCode)){
				throw new Exception("Tads students jau eksiste");
			}
		}
		Student newStudent = new Student(inputName, inputSurname, inputPersonCode);
		allstudents.add(newStudent);
	}

	//R - retrieve student
	public static Student getStudentById(long id) throws Exception {
		if(id < 0){
			throw new Exception("Id nevar but mazaks par 0");
		}
		for(Student tempS : allstudents){
			if(tempS.getStudId() == id){
				return tempS;
			}
		}
		throw new Exception("Students ar id " + id + " netika atrasts");
	}
	//U - update student
	public static Student updateById(int id, String inputName, String inputSurname) throws Exception {
		Student studentForUpdating = getStudentById(id);

		//todo pabaudit unputname un inputsurname
		if(!studentForUpdating.getName().equals(inputName)){
			studentForUpdating.setName(inputName);
		}
		if(!studentForUpdating.getSurname().equals(inputSurname)){
			studentForUpdating.setSurname(inputSurname);
		}
		return studentForUpdating;

	}
	//D - delete student
	public static void deleteById(int id) throws Exception {
		Student studentForDeleting = getStudentById(id);
		allstudents.remove(studentForDeleting);
	}

}
