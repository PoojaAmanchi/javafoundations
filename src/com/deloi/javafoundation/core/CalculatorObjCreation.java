package com.deloi.javafoundation.core;
import java.util.*;

public class CalculatorObjCreation {
	public  int sum(int num1,int num2) {
		return num1+num2;
	}
	public int sub(int num1,int num2) {
		return num1-num2;
	}
	public int product(int num1,int num2) {
		return num1*num2;
	}
	public int div(int num1,int num2) {
		return num1/num2;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        CalculatorObjCreation c=new CalculatorObjCreation();
        System.out.println("Enter ur name");
        String name=sc.next();
        System.out.println("Hello"+name+"Welcome");
        System.out.println("Enter 1st number");
        int num1=sc.nextInt();
        System.out.println("Enter 2nd number");
        int num2=sc.nextInt();
        System.out.println("Sum is "+c.sum(num1,num2));
        System.out.println("Sub is "+c.sub(num1,num2));
        System.out.println("Product is "+c.product(num1,num2));
        System.out.println("Div is "+c.div(num1,num2));
        sc.close();
        
	}

}
