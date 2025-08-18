package com.driver;

public class Main {
    public static void main(String[] args) {
        F1 mercedes = new F1("mercedes", false);
        mercedes.move(40, 0);
        mercedes.accelerate(20);
        mercedes.accelerate(60);

        Car car = new Car("Honda", 4, 4, 6, true, "Sedan", 5);
        car.changeGear(3); // change gear
        System.out.println("Current gear is: " + car.getCurrentGear());

        Boat b = new Boat("Titanic",3000);
        System.out.println("Boat is " + b.getVehicleName() + " " + "Capacity of boat is  " + b.getVehicleCapacity());
        // Titanic
        Vehicle v = new Vehicle("Car");
        v.steer(45);
        System.out.println("Vehicle name is: " + v.getName());




    }
}