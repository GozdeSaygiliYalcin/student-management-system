package com.bilgeadam.lesson028;

public enum Material {
	TIMBER("ahşap"), PLASTIC("plastik");

	private String material;

	Material(String material) {
		this.material = material;
	}

	public String getMaterial() {
		return this.material;
	}
}
