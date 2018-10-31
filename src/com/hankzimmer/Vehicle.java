package com.hankzimmer;

public class Vehicle {
    private String name;
    private String color;
    private int currentVelocity;
    private String currentDirection;

    public Vehicle(String name, String color) {
        this.name = name;
        this.color = color;
        this.currentVelocity = 0;
        this.currentDirection = "north";
    }

    public void changeSpeed(int speed) {
        currentVelocity += speed;
        System.out.println(name + " changed speed by " + speed + " and is now travelling at a velocity of " + currentVelocity);
    }

    public void stop() {
        currentVelocity = 0;
        System.out.println(name + " stopped. Current velocity is " + currentVelocity);
    }

    public void steer(String direction) {
        if (currentDirection == "north") {
            if (direction == "left") {
                currentDirection = "west";
            }
            if (direction == "right") {
                currentDirection = "east";
            }
        } else if (currentDirection == "east") {
            if (direction == "left") {
                currentDirection = "north";
            }
            if (direction == "right") {
                currentDirection = "south";
            }
        } else if (currentDirection == "south") {
            if (direction == "left") {
                currentDirection = "east";
            }
            if (direction == "right") {
                currentDirection = "west";
            }
        } else if (currentDirection == "west") {
            if (direction == "left") {
                currentDirection = "south";
            }
            if (direction == "right") {
                currentDirection = "north";
            }
        }
        System.out.println(name + " steered to the " + direction + " and is now travelling " + currentDirection);
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public int getCurrentVelocity() {
        return currentVelocity;
    }

    public String getCurrentDirection() {
        return currentDirection;
    }
}
