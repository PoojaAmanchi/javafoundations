package com.deloi.javafoundation.day4;

import java.util.*;
public class Hset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<String> h=new HashSet<String>();
		h.add("grape");
		h.add("mango");
		h.add(null);//allows 1 null value
		h.add("apple");
		//h.add(null); does not allow more than 1 null value
		h.add("apple"); //no duplicate values
		Iterator<String> i=h.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}

	}

}
