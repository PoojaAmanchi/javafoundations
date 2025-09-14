package com.deloi.javafoundation.task1.inventory;

public class Warehouse {
	private String location;

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	// Constructor
	public Warehouse(String location) {
		this.location = location;
	}
    //Method to display Info
	public void showLocation() {
		System.out.println("Warehouse Location: " + location);
	}
	

}
