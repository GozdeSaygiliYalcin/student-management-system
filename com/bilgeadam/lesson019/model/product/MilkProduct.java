package com.bilgeadam.lesson019.model.product;

import java.time.LocalDate;

public class MilkProduct extends Goods {
	MilkType type;           // laktozsuz, yağsız, yarım yağlı
	String   subProductName; // peynir filan

	public MilkProduct(String name, double purchasePrice, LocalDate purchaseDate, int stockedAmount, double sellPrice, String unit) {
		super(name, purchasePrice, purchaseDate, stockedAmount, sellPrice, unit);
	}

	public MilkType getType() {
		return this.type;
	}

	public void setType(MilkType type) {
		this.type = type;
	}

	public String getSubProductName() {
		return this.subProductName;
	}

	public void setSubProductName(String subProductName) {
		this.subProductName = subProductName;
	}

	@Override
	public String toString() {
		return "MilkProduct [type=" + this.type + ", subProductName=" + this.subProductName + ", "
				+ super.toString() + "]";
	}
}
