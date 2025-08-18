package com.driver;

public class Car extends Vehicle {
    int  wheels;
    String type;
    int doors;
    int gears;
    boolean isManual;
    int currentGear;
    int seats;

    public Car(String name, int wheels, int doors, int gears, boolean isManual, String type, int seats) {
        //Hint: Car extends Vehicle
        super(name);
        this.wheels = wheels;
        this.doors = doors;
        this.gears = gears;
        this.isManual = isManual;
        this.type = type;
        this.seats = seats;
        this.currentGear = 1;
    }
    public void changeGear(int newGear) {
        if (newGear > 0 && newGear <= gears) {
            this.currentGear = newGear;
            System.out.println("changeGear method called - The gear is changed to: " + currentGear);
        } else {
            System.out.println("Invalid gear: " + newGear);
        }
    }
    public void changeSpeed(int newSpeed, int newDirection){
        super.move(newSpeed, newDirection);
        System.out.println("changeSpeed method called - The speed is changed to: " + newSpeed + ", and the direction is changed to: " + newDirection + " degrees");
    }
    public int getCurrentGear(){
        return currentGear;
    }
}
