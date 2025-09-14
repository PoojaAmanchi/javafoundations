package com.deloi.javafoundation.task1;
import com.deloi.javafoundation.task1.inventory.Warehouse;

public class MainWarehouseApp {

	public static void main(String[] args) {
		//Create objects using constructor
		Warehouse wh1=new Warehouse("Hyderabad");
		wh1.showLocation();
		Warehouse wh2=new Warehouse("Pune");
		wh2.showLocation();

	}

}
