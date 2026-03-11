package service;

import model.Course;
import model.Grade;
import model.Professor;
import model.Student;
import modelenum.Profdegree;

public class MainService {

	public static void main(String[] args) {
		//datu tips 	nosaukums   =new konstruktors();
		Student   		stud1   	= new Student();
		System.out.println(stud1);
		Student   		stud2   	= new Student("Rendijs", "Berzins-Kalnins", "010101-12345");
		System.out.println(stud2);
		Student   		stud3   	= new Student("123456", "Ber2ins", null);
		System.out.println(stud3);
		
		Professor 		prof1   	= new Professor();
		System.out.println(prof1);
		Professor 		prof2   	= new Professor("Maris", "Berzins", "010101-12345", Profdegree.phd);
		System.out.println(prof2);
		Professor 		prof3   	= new Professor("123s56", "Kalnins", null, Profdegree.other);
		System.out.println(prof3);

		Course 		course1   	= new Course("Mathematics", (byte) 3, prof1);
		System.out.println(course1);
		Course 		course2   	= new Course("Physics", (byte) 14, prof2);
		System.out.println(course2);
		Course 		course3   	= new Course("Chemistry chem", (byte) 31, prof3);
		System.out.println(course3);

		Grade 		grade1   	= new Grade(8, stud1, course1);
		System.out.println(grade1);
		Grade 		grade2   	= new Grade(9, stud2, course2);
		System.out.println(grade2);
		Grade 		grade3   	= new Grade(7, stud3, course3);
		System.out.println(grade3);

	}

}
