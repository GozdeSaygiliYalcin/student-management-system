package com.bilgeadam.lesson020;

public class Video extends Product implements Rentable {
	private String actor;
	private String language;
	
	public Video(String name, String actor, String language) {
		super(name);
		this.actor = actor;
		this.language = language;
	}

	public String getActor() {
		return this.actor;
	}

	public String getLanguage() {
		return this.language;
	}

	@Override
	public String toString() {
		return "Video [actor=" + this.actor + ", language=" + this.language + ", " + super.toString() + "]";
	}
	
	@Override
	public double endPrice(double discountRate) {
		return this.getPrice() * (1-discountRate/2) * 1.10;
	}

	@Override
	public double dailyRentPrice() {
		return 10.37;
	}

	@Override
	public double rentalPrice(int duration) {
		if (duration > 5) {
			System.err.println("Videolar 5 günden uzun kiralanamaz");
			return -1;
		}
		if (this.getProductsInStock() > 1) {
			return duration * this.dailyRentPrice();
		}
		System.err.println("Yeterli ürün yok");
		return -1;
	}

}
