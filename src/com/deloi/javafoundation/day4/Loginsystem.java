package com.deloi.javafoundation.day4;
import java.util.*;

public class Loginsystem {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Date date=new Date();
		Random rand=new Random();
		
		Map<String,String> accounts=new HashMap<>();
		while(true) {
			System.out.println("Welcome to portal");
			System.out.println("1.SignUp");
			System.out.println("2.Login");
			System.out.println("3.Exit");
			
			int choice=sc.nextInt();
			sc.nextLine();
			if(choice==1) {
				System.out.println("Enter Username");
				String uname=sc.nextLine();
				if(accounts.containsKey(uname)) {
					System.out.println("Uname already exits");
				}
				else {
					System.out.println("Enter Password");
					String pwd=sc.nextLine();
					accounts.put(uname, pwd);
					System.out.println("Singup Success");
				}}
			else if(choice==2) {
				System.out.println("Enter Username");
				String uname=sc.nextLine();
				System.out.println("Enter Password");
				String pwd=sc.nextLine();
				
				if(accounts.containsKey(uname)&& accounts.get(uname).equals(pwd)) {
					System.out.println("Hi "+uname+" Welcome to portal");
					
					System.out.println("Plz stay connected..Logged in at "+date);	
					System.out.println("Your subscription id is "+rand.nextInt(1000));
				}
				else {
					System.out.println("Invalid Username or Password");
				}
			}
			else if(choice==3) {
				System.out.println("Byeee...");
				break;
			}
			else {
				System.out.println("Invalid choice! Try again");
			}
			
		}sc.close();
	}

}
