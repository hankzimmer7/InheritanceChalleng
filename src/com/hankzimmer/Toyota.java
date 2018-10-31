package com.hankzimmer;

public class Toyota extends Car {
    private String model;

    public Toyota(String name, String color, int doors, boolean sunRoof, String transmission, String model) {
        super(name, color, 4, doors, sunRoof, transmission);
        this.model = model;
    }

    public void holdValue() {
        System.out.println(getName() + " held value.");
    }

    public String getModel() {
        return model;
    }
}
