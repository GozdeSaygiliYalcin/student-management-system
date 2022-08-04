package com.bilgeadam.lesson036.factory.colors;

public class Red implements Color {

	@Override
	public void sayColorName() {
		System.out.println("Kıpkırmızı");
	}

	@Override
	public void info() {
		this.sayColorName();
	}

}
