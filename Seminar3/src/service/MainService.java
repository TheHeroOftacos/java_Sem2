package service;

import model.Student;

public class MainService {

	public static void main(String[] args) {
		//datu tips 	nosaukums   =new konstruktors();
		Student   		stud1   	= new Student();
		System.out.println(stud1);
		Student   		stud2   	= new Student("Rendijs", "Berzins-Kalnins", "010101-12345");
		System.out.println(stud2);
		Student   		stud3   	= new Student("123456", "Ber2ins", null);
		System.out.println(stud3);

	}

}
