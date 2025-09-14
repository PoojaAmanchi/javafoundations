package com.deloi.javafoundation.test;

public class TestStudent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1 = new Student(1, "Pooja");
		s1.displayInfo();

		Student s2 = new Student();
		s2.setRoll(2);
		s2.setName("Priya");
		System.out.println("Hi " + s2.getName() + " Id:" + s2.getRoll() + " " + s2.getClg());
	}
	
	

}
