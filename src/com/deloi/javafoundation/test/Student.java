package com.deloi.javafoundation.test;

public class Student {
 private int roll;
 private String name;
 private static String clg="MGIT";
public int getRoll() {
	return roll;
}
public void setRoll(int roll) {
	this.roll = roll;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public static String getClg() {
	return clg;
}
public static void setClg(String clg) {
	Student.clg = clg;
}
public void displayInfo() {
	System.out.println("Hello "+ name+" Id:"+roll+" "+clg);
}
public Student(int roll,String name) {
	this.roll=roll;
	this.name=name;
}
public Student() {
	
}

 
}
