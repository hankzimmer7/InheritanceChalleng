package com.hankzimmer;

public class Main extends Object{

    public static void main(String[] args) {
	 Toyota corolla = new Toyota("Corolla","silver", 4, false, "manual", "corolla");

	 corolla.changeSpeed(30);
	 corolla.steer("right");
	 corolla.changeGear(4);
	 corolla.changeSpeed(65);
	 corolla.holdValue();
    }
}
