package com.deloi.javafoundation.day2;

public class StringClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="ibm";
		String s1="deloitte";
		String s2="Welcome";
		System.out.println(s.length());
		
		System.out.println(s.contains("deloitte"));
		System.out.println(s.endsWith("k"));
		System.out.println(s.substring(1,3));
		
		for(int i=0;i<s1.length();i++) {
			System.out.println(s1.charAt(i));
		}
		s1=s1.concat(s1);
		
		System.out.println(s1==s2);//checks reference of 2 strings
		System.out.println(s1.compareTo(s));//true 0,false -2,2 or anything
		System.out.println(s1.equals(s2));

	}

}
