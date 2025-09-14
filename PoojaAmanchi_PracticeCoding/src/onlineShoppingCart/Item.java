package onlineShoppingCart;

public class Item {
	private String name;
	private double price;
	private int quantity;
	public Item(String name, double price, int quantity) {

		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}
	public void displayItem() {
		 System.out.println(name + " - Price: " 
	            + price + ", Quantity: " + quantity);
	}
	public double getTotalPrice() {
        return price * quantity;
    }

}
