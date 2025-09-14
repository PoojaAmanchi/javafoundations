package com.deloi.javafoundation.day1;
public class Emp {
    public static void main(String[] args) {
        
        Integer eid = Integer.parseInt(args[0]);
        String ename = args[1];
        Float basic = Float.parseFloat(args[2]);
        
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

        System.out.println("Employee ID: " + eid);
        System.out.println("Employee Name: " + ename);
        System.out.println("Basic Salary: " + basic);
        System.out.println("HRA: " + hra);
        System.out.println("TA: " + ta);
        System.out.println("DA: " + da);
        System.out.println("Gross Salary: " + gross);
        System.out.println("Class: " + empClass);
    }
}
