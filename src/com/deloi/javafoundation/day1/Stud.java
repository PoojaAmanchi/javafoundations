package com.deloi.javafoundation.day1;
class Stud {

    public static void main(String[] args) {
    	
        
        String name = args[0];
        Integer id = Integer.parseInt(args[1]);
        Integer m1 = Integer.parseInt(args[2]);
        Integer m2 = Integer.parseInt(args[3]);
        Integer m3 = Integer.parseInt(args[4]);

        Integer total = m1 + m2 + m3;
        Float avg = total / 3.0f;

        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Total: " + total);
        System.out.println("Average: " + avg);
        if (m1 < 35 || m2 < 35 || m3 < 35) {
            System.out.println("Fail");
        } 
          else if (avg >= 60) {
            System.out.println("First Class");
        } else if (avg >= 50) {
            System.out.println("Second Class");
        } else if (avg >= 35) {
            System.out.println("Third Class");
        } else {
            System.out.println("Fail");
        }
    }
}
