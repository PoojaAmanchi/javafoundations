package com.deloi.javafoundation.day4;

import java.util.*;
public class Tset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<String> h=new TreeSet<String>();
		h.add("grape");
		h.add("mango");
		h.add("apple");
		//h.add(null); does not allow null values
		h.add("apple"); //no duplicate values
		Iterator<String> i=h.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}

	}

}
