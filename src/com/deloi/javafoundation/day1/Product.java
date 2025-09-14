package com.deloi.javafoundation.day1;
public class Product {
    public static void main(String[] args) {
      
        Integer pid = Integer.parseInt(args[0]);
        String pname = args[1];
        Float up = Float.parseFloat(args[2]);
        Integer stk = Integer.parseInt(args[3]);
        Integer qty = Integer.parseInt(args[4]);

        Float tc = qty * up;
        Integer rem = stk - qty;

        System.out.println("Product ID: " + pid);
        System.out.println("Product Name: " + pname);
        System.out.println("Unit Price: " + up);
        System.out.println("Stock: " + stk);
        System.out.println("Quantity Purchased: " + qty);
        System.out.println("Total Cost: " + tc);
        System.out.println("Remaining Stock: " + rem);
    }
}
