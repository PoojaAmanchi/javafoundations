package com.deloi.javafoundation.day4;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class ListEmailMap {
     static LinkedHashMap<String, String> emails = new LinkedHashMap<>();

    public static void registerEmail(String email, String name) {
        if (emails.containsKey(email)) {
            System.out.println("Email already exists: " + email);
        } else {
            emails.put(email, name);
            System.out.println("Email registered successfully!");
        }
    }
    public static void listEmails() {
        System.out.println("\nRegistered emails:");
        for (Map.Entry<String, String> entry : emails.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n1. Register Email\n2. List Emails\n3. Exit");
            System.out.print("Enter choice: ");
            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter email: ");
                    String email = sc.nextLine();
                    registerEmail(email, name);
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
