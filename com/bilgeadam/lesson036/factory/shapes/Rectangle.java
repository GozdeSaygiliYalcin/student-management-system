package com.bilgeadam.lesson036.factory.shapes;

public class Rectangle implements Shape {

	@Override
	public void draw() {
		System.out.println("Dikdörtgen çizdim");
	}
	@Override
	public void info() {
		this.draw();
	}

}
