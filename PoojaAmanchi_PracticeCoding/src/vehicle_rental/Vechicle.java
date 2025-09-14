package vehicle_rental;

abstract class Vehicle {
    private String vehicleNumber;
    private String model;

    public Vehicle(String vehicleNumber, String model) {
        this.vehicleNumber = vehicleNumber;
        this.model = model;
    }
    public String getVehicleNumber() {
        return vehicleNumber;
    }
    public String getModel() {
        return model;
    }
    public abstract double calculateRentalCost(int days);

    public void displayVehicleInfo() {
        System.out.println("Vehicle Number: " + vehicleNumber + ", Model: " + model);
    }
}
class Car extends Vehicle {
    private double dailyRate;
    public Car(String vehicleNumber, String model, double dailyRate) {
        super(vehicleNumber, model);
        this.dailyRate = dailyRate;
    }
    @Override
    public double calculateRentalCost(int days) {
        return (dailyRate * days)+100; 
    }}
class Bike extends Vehicle {
    private double dailyRate;

    public Bike(String vehicleNumber, String model, double dailyRate) {
        super(vehicleNumber, model);
        this.dailyRate = dailyRate;
    }
    @Override
    public double calculateRentalCost(int days) {
        return dailyRate * days;
    }
}

