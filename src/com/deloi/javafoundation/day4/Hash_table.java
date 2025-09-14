package com.deloi.javafoundation.day4;

import java.util.Hashtable;
import java.util.Map;

public class Hash_table {
	public static void main(String[] args) {
		
	Hashtable<Integer,String> h=new Hashtable<Integer,String>();
	h.put(1,"mango");
	h.put(2,"apple");
	h.put(3,"mango");//allows duplicates
	h.put(4,"kiwi");
	//h.put(5,null); //no nulls
	for(Map.Entry<Integer,String> m:h.entrySet()){
		System.out.println(m.getKey()+" "+m.getValue());
	}
	}
}
