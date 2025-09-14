package com.deloi.javafoundation.task1;

public class Product {
	//member variables
	private int productId;
	private String productName;
	private int price;
    
	//Getter and Setter Functions
	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	//Constructor initialization
	public Product(int productId, String productName,int price){
		this.productId=productId;
		this.productName=productName;
		this.price=price;
	}
	//Display Function
	public void displayProduct() {
		System.out.println("Product Id: "+productId+", Product Name: "+productName+" ,Price: "+price);
	}

	public static void main(String[] args) {
		Product p1=new Product(1,"Bag",5000);
		p1.displayProduct();
		
		Product p2=new Product(2,"Bottle",1000);
		p2.displayProduct();
		
		
  
	}

}
