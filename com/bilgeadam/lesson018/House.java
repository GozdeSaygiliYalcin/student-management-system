package com.bilgeadam.lesson018;

public class House {
	private int numberOfRooms;
	private int length;
	private int width;
	
	public House(int numberOfRooms, int length, int width) {
		super();
		this.numberOfRooms = numberOfRooms;
		this.length        = length;
		this.width         = width;
	}

	public int getNumberOfRooms() {
		return this.numberOfRooms;
	}

	public int getLength() {
		return this.length;
	}

	public int getWidth() {
		return this.width;
	}

	public int getArea() {
		return this.length * this.width;
	}
}
