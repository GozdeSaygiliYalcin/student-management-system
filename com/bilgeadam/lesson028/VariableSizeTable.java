package com.bilgeadam.lesson028;

import java.time.LocalDate;

public class VariableSizeTable extends Table implements Extenable {
	private boolean open;   // masa açık mı kapalı mı?
	private int     numOfOpenPlaces;   // diğer masalara ek olarak açık halde iken oturulacak yer adedi

	public VariableSizeTable(String name, Material material, Color color, LocalDate productionDate, double price, int numOfLegs, int closedPlaces, int openPlaces) {
		super(name, material, color, productionDate, price, numOfLegs);
		this.numOfPlaces = closedPlaces;
		this.numOfOpenPlaces = openPlaces;
		this.open = false;
	}

	@Override
	public int getNumOfClosedPlaces() {
		return this.numOfPlaces;
	}

	@Override
	public int getNumOfOpenedPlaces() {
		return this.numOfOpenPlaces;
	}

	@Override
	public int getNumberOfPlaces() {
		if (this.open)
			return this.numOfOpenPlaces;
		else
			return this.numOfPlaces;
	}

	public boolean isOpen() {
		return this.open;
	}

	public void setOpen(boolean open) {
		this.open = open;
	}
}
