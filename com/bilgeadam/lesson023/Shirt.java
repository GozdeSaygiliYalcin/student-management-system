package com.bilgeadam.lesson023;

public class Shirt {
	private String model;
	private int    size;
	private String color;
	
	public Shirt(String model, int size, String color) {
		super();
		this.model = model;
		this.size  = size;
		this.color = color;
	}

	public String getModel() {
		return this.model;
	}

	public int getSize() {
		return this.size;
	}

	public String getColor() {
		return this.color;
	}

	@Override
	public String toString() {
		return "Shirt [model=" + this.model + ", size=" + this.size + ", color=" + this.color + "]";
	}
}
