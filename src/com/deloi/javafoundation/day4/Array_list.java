package com.deloi.javafoundation.day4;


import java.util.*;
public class Array_list {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> h=new ArrayList<String>();
		h.add("grape");
		h.add("mango");
		h.add(null);
		h.add("apple");
		h.add(null); //allow more than 1 null value
		h.add("apple"); //duplicate values allows
		Iterator<String> i=h.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}

	}

}
