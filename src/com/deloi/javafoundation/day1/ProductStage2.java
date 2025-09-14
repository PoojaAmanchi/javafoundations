package com.deloi.javafoundation.day1;
import java.util.Scanner;
public class ProductStage2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of products: ");
        int n = sc.nextInt();
        sc.nextLine(); 
        for (int i = 1; i <= n; i++) {
            System.out.println("\nEnter details for Product " + i + ":");
            System.out.print("Enter Product ID: ");
            Integer pid = sc.nextInt();
            sc.nextLine(); 

            System.out.print("Enter Product Name: ");
            String pname = sc.nextLine();

            System.out.print("Enter Unit Price: ");
            Float up = sc.nextFloat();

            System.out.print("Enter Stock: ");
            Integer stk = sc.nextInt();

            System.out.print("Enter Quantity Purchased: ");
            Integer qty = sc.nextInt();
            sc.nextLine();
            
            Float tc = qty * up;
            Integer rem = stk - qty;
   
            System.out.println("\nProduct " + i + " Details:");
            System.out.println("Product ID: " + pid);
            System.out.println("Product Name: " + pname);
            System.out.println("Unit Price: " + up);
            System.out.println("Stock: " + stk);
            System.out.println("Quantity Purchased: " + qty);
            System.out.println("Total Cost: " + tc);
            System.out.println("Remaining Stock: " + rem);
        }sc.close();
    }
}
