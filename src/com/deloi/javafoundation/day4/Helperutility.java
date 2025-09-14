package com.deloi.javafoundation.day4;
import java.util.*;

public class Helperutility {
	public static void main(String args[]) {
	Date d = new Date();
	Random r = new Random();
	Scanner c=new Scanner(System.in);
	System.out.println("Enter ename");
	String ename=c.next();
	System.out.println("Hi.."+ename+"  ur tkt no: "+r.nextInt(10000)+" ..Dob.."+d);
	c.close();
	
	}
}
