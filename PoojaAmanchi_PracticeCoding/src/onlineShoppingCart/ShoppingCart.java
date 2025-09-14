package onlineShoppingCart;
import java.util.Scanner;

/*
 * 3. Online Shopping Cart (Composition & Aggregation) Scenario: 
 * A shopping cart contains multiple items. Each item has a price and quantity. The cart calculates the total price.
 */
public class ShoppingCart {
    private double totalPrice = 0;

    public void addItem(Item item) {
        item.displayItem(); 
        totalPrice += item.getTotalPrice();
    }

    public void displayTotal() {
        System.out.println("\nTotal Price of Cart: " + totalPrice);
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        ShoppingCart cart = new ShoppingCart();

        System.out.print("Enter number of items in the cart: ");
        int n = sc.nextInt();
        sc.nextLine(); 

        for (int i = 1; i <= n; i++) {
            System.out.println("\nEnter details for Item " + i + ":");
            System.out.print("Name: ");
            String name = sc.nextLine();

            System.out.print("Price: ");
            double price = sc.nextDouble();

            System.out.print("Quantity: ");
            int quantity = sc.nextInt();
            sc.nextLine();

            Item item = new Item(name, price, quantity); 
            cart.addItem(item); 
        }

        cart.displayTotal();
        sc.close();
	}
}
