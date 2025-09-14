package com.deloi.javafoundation.day2;

class RunParent {
	void m1() {
		System.out.println("I am in Parent");
	}
	}
public class PolyRun extends RunParent{
	@Override
	void m1() {
		System.out.println("I am in Child");
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PolyRun a=new PolyRun();
		a.m1();

	}

}
