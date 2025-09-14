package vehicle_rental;

/*5. Vehicle Rental System (Abstraction & Polymorphism) Scenario: 
 * A rental service rents cars and bikes. Each vehicle can be rented, but the rental cost calculation differs.
 */
 
public class VechcileRentalSystem {
    public static void main(String[] args) {
        Vehicle car = new Car("C123", "Tata Nexon", 2000); 
        Vehicle bike = new Bike("B456", "Royal Enfield", 500); 

        System.out.println("Car Rental ");
        car.displayVehicleInfo();
        System.out.println("Total Rental for 5 days: " 
                    + car.calculateRentalCost(5));

        System.out.println("\nBike Rental");
        bike.displayVehicleInfo();
        System.out.println("Total Rental for 3 days: "
                    + bike.calculateRentalCost(3));
       
    }

}
