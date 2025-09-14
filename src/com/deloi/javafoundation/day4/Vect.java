package com.deloi.javafoundation.day4;

import java.util.Enumeration;
import java.util.Vector;

public class Vect {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector<String> v = new Vector<String>();
		v.add("grape");
		v.add("mango");
		v.add("mango");//allows duplicates
		v.add("kiwi");
		v.add(null);
		v.add(null);//allows more than 1 null
		
		Enumeration<String> e=v.elements();
		while(e.hasMoreElements()) {
			System.out.println(e.nextElement());
		}

	}

}
