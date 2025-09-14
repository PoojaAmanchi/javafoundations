package com.deloi.javafoundation.day2;

import java.util.StringTokenizer;

public class StringTokenizerClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringTokenizer st=new StringTokenizer("Welcome Pooja Hi"," ");
		while(st.hasMoreTokens()) {
			System.out.println(st.nextToken());
			
		}

	}

}
