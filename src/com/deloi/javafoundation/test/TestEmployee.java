package com.deloi.javafoundation.test;

public class TestEmployee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Employee e1=new Employee(101,"Manga");
      System.out.println(e1.getId()+" "+e1.getName()+" "+e1.getCompanyName());
		Employee e2=new Employee(102, "Dhoni");
		System.out.println(e2.getId()+" "+e2.getName()+" "+e2.getCompanyName());
		
		Employee e3=new Employee();
		e3.setId(103);
		e3.setName("Kohli");
		System.out.println(e3.getId()+" "+e3.getName()+" "+e3.getCompanyName());
	}

}
