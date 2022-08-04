package com.bilgeadam.lesson017;

public class Airplane extends Vehicle {
	private double spanLength;
	private double maxHeigth;
	
	public Airplane(String brand) {
		super(brand);
		this.engine = "Hibrid";
		this.setName("Toros");
	}
	
	public Airplane (String brand, String color) {
		super(brand, color);
		this.engine = "Hibrid";
		this.setName("Ağrı");
	}
	
	public double getSpanLength() {
		return this.spanLength;
	}
	
	public void tellAboutYourself () {
		System.out.println("Ben bir uçağım");
	}

}
