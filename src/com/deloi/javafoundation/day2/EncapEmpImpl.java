package com.deloi.javafoundation.day2;

public class EncapEmpImpl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EncapEmp e = new EncapEmp();
		e.seteId(1);
		e.seteName("pooja");
		e.setSal(1000000);
		System.out.println(e.geteName());
		System.out.println(e.geteId());
		//System.out.println(e.getSal()); not possible as it is private
		
		

	}

}
