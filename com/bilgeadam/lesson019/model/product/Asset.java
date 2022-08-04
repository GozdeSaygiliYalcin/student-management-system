package com.bilgeadam.lesson019.model.product;

import java.time.LocalDate;

/*
 * demirbaşlar
 */

public class Asset extends Product  {
	private int numOfAssets;
	
	public Asset(String name, double purchasePrice, LocalDate purchaseDate, int stockedAmount, int numOfAssets) {
		super(name, purchasePrice, purchaseDate, stockedAmount);
		this.numOfAssets = numOfAssets;
	}

	public int getNumOfAssets() {
		return this.numOfAssets;
	}

	@Override
	public String toString() {
		return "Asset [numOfAssets=" + this.numOfAssets + ", " + super.toString() + "]";
	}

}
