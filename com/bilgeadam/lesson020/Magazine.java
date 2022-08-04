package com.bilgeadam.lesson020;

public class Magazine extends Book {
	private int issueNumber;
	
	public Magazine(String name, String author, int year, int issueNumber) {
		super(name, author, year);
		this.issueNumber = issueNumber;
	}

	public int getIssueNumber() {
		return this.issueNumber;
	}

	@Override
	public String toString() {
		return "Magazine [issueNumber=" + this.issueNumber + ", " + super.toString() + "]";
	}
	
	@Override
	public double endPrice(double discountRate) {
		return this.getPrice() * (1-discountRate) * 1.05;
	}

	@Override
	public double dailyRentPrice() {
		return -1;
	}

	@Override
	public double rentalPrice(int duration) {
		System.err.println("Magazinler kiralanamaz");
		return -1;
	}

	
}
