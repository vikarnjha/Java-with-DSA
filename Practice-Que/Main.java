class Vehicle {
    public void move(){
        System.out.println("Vehicle is moving");
    }
}
class Car extends Vehicle{
    @Override
    public void move(){
        System.out.println("Car is moving");
    }
}
public class Main {
    public static void main(String[] args) {
        // Creating an object of Vehicle
        Vehicle myVehicle = new Vehicle();
        myVehicle.move();  // Calls the move() method of Vehicle
        
        // Creating an object of Car
        Car myCar = new Car();
        myCar.move();  // Calls the overridden move() method of Car
        
        // Demonstrating polymorphism
        Vehicle myPolymorphicCar = new Car();
        myPolymorphicCar.move();  // Calls the overridden move() method of Car
    }
}
