package com.bilgeadam.lesson020;

public class Stationary extends Product {
	private String color;

	public Stationary(String name, String color) {
		super(name);
		this.color = color;
	}

	public String getColor() {
		return this.color;
	}

	@Override
	public String toString() {
		return "Stationary [color=" + this.color + ", " + super.toString() + "]";
	}

	@Override
	public double endPrice(double discountRate) {
		return this.getPrice() * (1-discountRate) * 1.18 * 0.20;  // ÖTV de var
	}

}
