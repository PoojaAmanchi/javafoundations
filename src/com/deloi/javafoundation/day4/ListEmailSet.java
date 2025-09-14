package com.deloi.javafoundation.day4;

import java.util.Iterator;
import java.util.*;

import java.util.Scanner;

public class ListEmailSet {
    static Set<String> emails = new LinkedHashSet<String>();
    public static void registerEmail(String email) {
        if (emails.contains(email)) {
            System.out.println("Email already exists: " + email);
        } else {
            emails.add(email);
            System.out.println("Email registered successfully!");
        }}
    public static void listEmails() {
        System.out.println("\nRegistered emails:");
        Iterator<String> i=emails.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
    }}
    public static void main(String[] args) { 
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("\n1. Register Email\n2. List Emails\n3. Exit");
            System.out.print("Enter choice: ");
            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                
                    System.out.print("Enter email: ");
                    String email = sc.nextLine();
                    registerEmail(email);
                    break;
                case 2:
                    listEmails();
                    break;
                case 3:
                    System.out.println("Exiting...");
                    sc.close();
                    return;
                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
}
