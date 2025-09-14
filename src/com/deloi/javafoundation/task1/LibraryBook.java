package com.deloi.javafoundation.task1;

public class LibraryBook {
	private String bookTitle;
	private String authorName;

	public String getBookTitle() {
		return bookTitle;
	}
	public void setBookTitle(String bookTitle) {
		this.bookTitle = bookTitle;
	}
	public String getAuthorName() {
		return authorName;
	}
	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}
	public void display() {
		System.out.println(bookTitle+ " is written by "+authorName);
	}
	public LibraryBook(String bookTitle,String authorName) {
		this.bookTitle=bookTitle;
		this.authorName=authorName;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LibraryBook b1=new LibraryBook("Normal People","Pooja");
		b1.display();
		
   
	}

}
