// Base Class: Vehicle

class Vehicle {

    // Attributes
    private String make;
    private String model;
    private int year;

    // Constructor
    public Vehicle(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }

    // Method to display vehicle information
    public void displayInfo() {
        System.out.println("Vehicle Make: " + make);
        System.out.println("Vehicle Model: " + model);
        System.out.println("Vehicle Year: " + year);
    }
}

// Derived Class: Car
class Car extends Vehicle {

    // Additional attributes
    private int numberOfDoors;
    private boolean isAutomatic;

    // Constructor
    public Car(String make, String model, int year, int numberOfDoors, boolean isAutomatic) {
        super(make, model, year); // Call the base class constructor
        this.numberOfDoors = numberOfDoors;
        this.isAutomatic = isAutomatic;
    }

    // Overriding displayInfo method
    @Override
    public void displayInfo() {
        super.displayInfo(); // Call the base class method
        System.out.println("Number of Doors: " + numberOfDoors);
        System.out.println("Is Automatic: " + isAutomatic);
    }
}

// Derived Class: Bike
class Bike extends Vehicle {

    // Additional attributes
    private String type;
    private boolean hasCarrier;

    // Constructor
    public Bike(String make, String model, int year, String type, boolean hasCarrier) {
        super(make, model, year); // Call the base class constructor
        this.type = type;
        this.hasCarrier = hasCarrier;
    }

    // Overriding displayInfo method
    @Override
    public void displayInfo() {
        super.displayInfo(); // Call the base class method
        System.out.println("Bike Type: " + type);
        System.out.println("Has Carrier: " + hasCarrier);
    }
}

// Optional Challenge: Subclass ElectricCar
class ElectricCar extends Car {

    // Additional attributes
    private double batteryCapacity;
    private int range;

    // Constructor
    public ElectricCar(String make, String model, int year, int numberOfDoors, boolean isAutomatic, double batteryCapacity, int range) {
        super(make, model, year, numberOfDoors, isAutomatic);
        this.batteryCapacity = batteryCapacity;
        this.range = range;
    }

    // Overriding displayInfo method
    @Override
    public void displayInfo() {
        super.displayInfo(); // Call the Car class method
        System.out.println("Battery Capacity: " + batteryCapacity + " kWh");
        System.out.println("Range: " + range + " km");
    }
}

// Main class to demonstrate polymorphism
public class Main {

    public static void main(String[] args) {
        // Create instances of Car, Bike, and ElectricCar
        Vehicle car = new Car("Toyota", "Camry", 2020, 4, true);
        Vehicle bike = new Bike("Giant", "Escape 3", 2021, "Road", true);
        Vehicle electricCar = new ElectricCar("Tesla", "Model S", 2023, 4, true, 100.0, 600);

        // Create an array of Vehicle objects
        Vehicle[] vehicles = {car, bike, electricCar};

        // Iterate over the array and call displayInfo
        for (Vehicle vehicle : vehicles) {
            vehicle.displayInfo();
            System.out.println();
        }
    }
}
