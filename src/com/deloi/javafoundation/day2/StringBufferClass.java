package com.deloi.javafoundation.day2;

public class StringBufferClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer sb = new StringBuffer("Deloitte");
		sb.reverse();
		sb.append("Training");
		sb.insert(12,"Provides");
		sb.replace(9, 10,"Java");
		sb.delete(9,12);
		System.out.println(sb);
		

	}

}
