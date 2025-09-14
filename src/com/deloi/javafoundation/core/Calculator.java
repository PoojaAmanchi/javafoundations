package com.deloi.javafoundation.core;
import java.util.*;

public class Calculator {
	public static int sum(int num1,int num2) {
		return num1+num2;
	}
	public static int sub(int num1,int num2) {
		return num1-num2;
	}
	public static int product(int num1,int num2) {
		return num1*num2;
	}
	public static int div(int num1,int num2) {
		return num1/num2;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter ur name");
        String name=sc.next();
        System.out.println("Hello"+name+"Welcome");
        System.out.println("Enter 1st number");
        int num1=sc.nextInt();
        System.out.println("Enter 2nd number");
        int num2=sc.nextInt();
        System.out.println("Sum is "+Calculator.sum(num1,num2));
        System.out.println("Sub is "+sub(num1,num2));
        System.out.println("Product is "+product(num1,num2));
        System.out.println("Div is "+div(num1,num2));
        sc.close();
        
	}

}
