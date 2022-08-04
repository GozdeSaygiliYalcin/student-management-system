package com.bilgeadam.lesson020;

public class Book extends Product implements Rentable {
	protected String author;
	protected int    year;

	public Book(String name, String author, int year) {
		super(name);
		this.author = author;
		this.year   = year;
	}

	public String getAuthor() {
		return this.author;
	}

	public int getYear() {
		return this.year;
	}

	@Override
	public String toString() {
		return "Book [author=" + this.author + ", year=" + this.year + ", " + super.toString() + "]";
	}

	@Override
	public double endPrice(double discountRate) {
		return this.getPrice() * (1-discountRate) * 1.18;
	}

	@Override
	public double dailyRentPrice() {
		return 5.83;
	}

	@Override
	public double rentalPrice(int duration) {
		if (this.getProductsInStock() > 1) {
			return duration * this.dailyRentPrice();
		}
		System.err.println("Yeterli ürün yok");
		return -1;
	}
}
