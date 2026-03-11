package service;

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
		Professor 		prof2   	= new Professor("Rendijs", "Berzins-Kalnins", "010101-12345", Profdegree.phd);
		System.out.println(prof2);
		Professor 		prof3   	= new Professor("123s56", "Ber2ins", null, Profdegree.other);
		System.out.println(prof3);

	}

}
