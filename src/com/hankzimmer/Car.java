package com.hankzimmer;

public class Car extends Vehicle {
    private int wheels;
    private int doors;
    private boolean sunRoof;
    private String transmission;
    private int currentGear;

    public Car(String name, String color, int wheels, int doors, boolean sunRoof, String transmission) {
        super(name, color);
        this.wheels = wheels;
        this.doors = doors;
        this.sunRoof = sunRoof;
        this.transmission = transmission;
    }

    public void changeGear(int gear) {
        this.currentGear = gear;
        System.out.println(getName() + " changed to gear " + currentGear);
    }

    public int getWheels() {
        return wheels;
    }

    public boolean hasSunRoof() {
        return sunRoof;
    }

    public String getTransmission() {
        return transmission;
    }

}
