package com.deloi.javafoundation.day4;

import java.util.*;

public class Hash_map {
	public static void main(String args[]) {
	HashMap<Integer,String> h=new HashMap<Integer,String>();
	h.put(456,"java");
	h.put(123,"sql");
	h.put(567,"java");//allows duplicates
	h.put(null, null);//allows single null key
	h.put(768, null);//allows multiple null values
	h.put(738, "react");
	
	for(Map.Entry<Integer,String> m:h.entrySet()){
		System.out.println(m.getKey()+" "+m.getValue());
	}


	
	}
}