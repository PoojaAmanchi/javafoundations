package com.deloi.javafoundation.day1;
public class StudStage2 {
    public static void main(String[] args) {
        int numStudents = Integer.parseInt(args[0]);
        int index = 1; 
        for (int i = 1; i <= numStudents; i++) {
            String name = args[index++];
            Integer id = Integer.parseInt(args[index++]);
            Integer m1 = Integer.parseInt(args[index++]);
            Integer m2 = Integer.parseInt(args[index++]);
            Integer m3 = Integer.parseInt(args[index++]);

            Integer total = m1 + m2 + m3;
            Float avg = total / 3.0f;

            System.out.println("\nStudent " + i + " Details:");
            System.out.println("Name: " + name);
            System.out.println("ID: " + id);
            System.out.println("Total: " + total);
            System.out.println("Average: " + avg);
            if (m1 < 35 || m2 < 35 || m3 < 35) {
                System.out.println("Fail");
            } else if (avg >= 60) {
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
}
