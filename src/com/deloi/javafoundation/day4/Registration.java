package com.deloi.javafoundation.day4;
import java.util.*;

public class Registration {
	static String generateUid(String fname,String idp) {
		StringBuffer uid=new StringBuffer("");
		uid.append(fname);
		uid.append(idp.substring(0,2));
		uid.append(idp.substring(idp.length() - 2));
		return uid.toString();
	}
	static String generatePwd(String fname,String lname,int dob,String idp,String mob) {
		StringBuffer pwd=new StringBuffer("");
		pwd.append(fname.substring(fname.length()-1));
		pwd.append(lname.substring(0,1));
		
		int dobSum=digitSum(dob);
		pwd.append(dobSum);
		
		for(char c:idp.toCharArray()) {
			if(("AEIOUaeiou".indexOf(c)>=0)||(Character.isDigit(c)&& (c-'0')%2==0)) {
				pwd.append(c);
			}}
		int temp=0;
		for(char d:mob.toCharArray()) {
			while(temp>9)
			if(Character.isDigit(d)&& (d-'0')%2==1 ){
				temp+=d;	
			}}
		temp=digitSum(temp);
		pwd.append(temp);
		
		return pwd.toString();
		
	}
	static int digitSum(int num) {
		while(num>9) {
			int temp=0;	
			while(num>0) {
				temp+=num%10;
				num/=10;
			}
			num=temp;
			}
		return num;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Firstname");
		String fname=sc.nextLine();
		System.out.println("Enter Lastname");
		String lname=sc.nextLine();
		System.out.println("Enter DOB");
		int dob=sc.nextInt();
		sc.nextLine();
		System.out.println("Enter SocialSecurity Number");
		String idp=sc.nextLine();
		System.out.println("Enter MobileNo");
		String mob=sc.nextLine();
		
		System.out.println("Your Generated Uid is: "+generateUid(fname,idp));
		System.out.println("Your Generated Password is: "+generatePwd(fname,lname,dob,idp,mob));
		
		sc.close();
	
 
	}

}
