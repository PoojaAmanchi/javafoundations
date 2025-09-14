package com.deloi.javafoundation.day4;


import java.util.Map;
import java.util.TreeMap;

public class Tree_map {
	public static void main(String[] args) {
		TreeMap<Integer,String> t=new TreeMap<Integer,String>();
		t.put(456,"java");
		t.put(123,"sql");
		t.put(567,"java");//allows duplicates
		//t.put(null, "node");//no null key
		t.put(768, null);//allows multiple null values
		t.put(888, null);
		t.put(738, "react");
		
		for(Map.Entry<Integer,String> m:t.entrySet()){
			System.out.println(m.getKey()+" "+m.getValue());
		}
	}

}
