package com.driver;

public class Main {
    public static void main(String[] args) {
        F1 mercedes = new F1("mercedes", false);
        Boat b = new Boat("Titanic",3000);
        System.out.println("Boat is " + b.getVehicleName() + " " + "Capacity of boat is  " + b.getVehicleCapacity());     // Titanic
        mercedes.move(40, 0);
        mercedes.accelerate(20);
        mercedes.accelerate(-60);

    }
}