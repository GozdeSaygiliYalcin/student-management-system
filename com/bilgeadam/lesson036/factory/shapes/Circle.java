package com.bilgeadam.lesson036.factory.shapes;

public class Circle implements Shape {

	@Override
	public void draw() {
		System.out.println("Daire çizdim");
	}
	@Override
	public void info() {
		this.draw();
	}

}
