package com.deloi.javafoundation.day1;
import java.util.Scanner;
public class EmpStage2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of employees: ");
        int n = sc.nextInt();
        sc.nextLine(); 
        for (int i = 1; i <= n; i++) {
            System.out.println("\nEnter details for Employee " + i + ":");
            System.out.print("Employee ID: ");
            Integer eid = sc.nextInt();
            sc.nextLine(); 
            System.out.print("Employee Name: ");
            String ename = sc.nextLine();

            System.out.print("Basic Salary: ");
            Float basic = sc.nextFloat();
            sc.nextLine();
    
            Float hra = 0.12f * basic;
            Float ta  = 0.08f * basic;
            Float da  = 0.10f * basic;
            Float gross = basic + hra + ta + da;
            String empClass;
            if (gross >= 25000) {
                empClass = "A";
            } else if (gross >= 10000 && gross < 25000) {
                empClass = "B";
            } else if (gross < 10000) {
                empClass = "C";
            } else {
                empClass = "D";
            }   
            System.out.println("Employee " + i + " Details:");
            System.out.println("Employee ID: " + eid);
            System.out.println("Employee Name: " + ename);
            System.out.println("Basic Salary: " + basic);
            System.out.println("HRA: " + hra);
            System.out.println("TA: " + ta);
            System.out.println("DA: " + da);
            System.out.println("Gross Salary: " + gross);
            System.out.println("Class: " + empClass);
        }

        sc.close();
    }
}
