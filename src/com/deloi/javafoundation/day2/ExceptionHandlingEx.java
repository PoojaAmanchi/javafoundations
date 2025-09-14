package com.deloi.javafoundation.day2;

public class ExceptionHandlingEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			/*int i=10,j=0,k=i/j;
			System.out.println(k);*/
			String s="pooja";
			int i=Integer.parseInt(s);
			System.out.println(i);
			/*String s1=null;
			System.out.println(s.length());
			
			int ar[]= {1,2,3,4,5,6};
			System.out.println(ar[5]);*/
		}
		catch(NullPointerException n) {
			n.printStackTrace();
			System.out.println("catch1");
		}
		catch(NumberFormatException n) {
			n.printStackTrace();
			System.out.println("catch2");
		}
		catch(ArrayIndexOutOfBoundsException n) {
			n.printStackTrace();
			System.out.println("catch3");
		}
		catch(ArithmeticException n) {
			n.printStackTrace();
			System.out.println("catch4");
		}
		finally {
			System.out.println("Finally....");
		}
	}
}
