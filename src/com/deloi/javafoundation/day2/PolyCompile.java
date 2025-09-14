package com.deloi.javafoundation.day2;

public class PolyCompile {
	int add(int i,int j) {
		return i+j;
	}
	float add(float i,int j) {
		return i+j;
	}
	int add(int i,int j,int k) {
		return i+j+k;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PolyCompile p=new PolyCompile();
		System.out.println(p.add(1, 3));
		System.out.println(p.add(1.5f, 3));
		System.out.println(p.add(1, 3,9));

	}

}
