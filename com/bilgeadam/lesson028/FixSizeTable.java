package com.bilgeadam.lesson028;

import java.time.LocalDate;

public class FixSizeTable extends Table {

	public FixSizeTable(String name, Material material, Color color, LocalDate productionDate, double price, int numOfLegs, int numOfPlaces) {
		super(name, material, color, productionDate, price, numOfLegs);
		this.numOfPlaces = numOfPlaces;
	}

	@Override
	public int getNumberOfPlaces() {
		return this.numOfPlaces;
	}
}
