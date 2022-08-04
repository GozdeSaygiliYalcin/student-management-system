package com.bilgeadam.lesson013.altpaket;

public class VehicleTest {

	public static void main(String[] args) {
		Vehicle v1 = new Vehicle();
		v1.setAutomaticGear(true);
		v1.setColor("mavi");
		v1.setLabel("Porsche");
		v1.setMaxSpeed(250);
		
		System.out.println(v1.toString());
		
		if (v1.isAutomaticGear()) {
			System.out.println("Araba otomatik vitesli");
		}
		System.out.println("v1'in rengi " + v1.getColor() + "'dir, " + v1.getColor());
	}

}
