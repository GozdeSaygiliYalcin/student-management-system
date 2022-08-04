package com.bilgeadam.lesson019.model.product;

import java.time.LocalDate;

public class Product {

	private String    name;
	private double    purchasePrice;
	private LocalDate purchaseDate;
	protected int     stockedAmount;
	
	public Product(String name, double purchasePrice, LocalDate purchaseDate, int stockedAmount) {
		super();
		this.name          = name;
		this.purchasePrice = purchasePrice;
		this.purchaseDate  = purchaseDate;
		this.stockedAmount = stockedAmount;
	}

	public String getName() {
		return this.name;
	}

	public double getPurchasePrice() {
		return this.purchasePrice;
	}

	public LocalDate getPurchaseDate() {
		return this.purchaseDate;
	}

	public int getStockedAmount() {
		return this.stockedAmount;
	}

	@Override
	public String toString() {
		return "Product [name=" + this.name + ", purchasePrice=" + this.purchasePrice + ", purchaseDate="
				+ this.purchaseDate + ", stockedAmount=" + this.stockedAmount + "]";
	}
}