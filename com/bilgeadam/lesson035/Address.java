package com.bilgeadam.lesson035;

public class Address {
	private String street;
	private int    doorNumber;
	private int    postalCode;
	private String city;
	private String country;
	
	public Address(String street, int doorNumber, int postalCode, String city, String country) {
		super();
		this.street     = street;
		this.doorNumber = doorNumber;
		this.postalCode = postalCode;
		this.city       = city;
		this.country    = country;
	}

	public String getStreet() {
		return this.street;
	}

	public int getDoorNumber() {
		return this.doorNumber;
	}

	public int getPostalCode() {
		return this.postalCode;
	}

	public String getCity() {
		return this.city;
	}

	public String getCountry() {
		return this.country;
	}

	@Override
	public String toString() {
		return "Address [street=" + this.street + ", doorNumber=" + this.doorNumber + ", postalCode=" + this.postalCode
				+ ", city=" + this.city + ", country=" + this.country + "]";
	}
	
}
