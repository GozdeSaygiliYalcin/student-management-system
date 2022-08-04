package com.bilgeadam.lesson036.factory.shapes;

public class Square implements Shape {

	@Override
	public void draw() {
		System.out.println("Kare çizdim");
	}
	@Override
	public void info() {
		this.draw();
	}

}
