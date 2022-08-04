package com.bilgeadam.lesson019.model.person;

import java.time.LocalDate;

/*
 * Müşteri numarası CST-0001
 */
public class Customer extends Person {
	private static int customerCounter;
	private boolean    isClose;
	private String     favouriteProduct;
	
	
	public Customer(String name, LocalDate birthDate) {
		super(name, birthDate);
	}

	@Override
	public String toString() {
		return "Customer [isClose=" + this.isClose + ", favouriteProduct=" + this.favouriteProduct + ", customerID="
				+ this.idNumber + ", toString()=" + super.toString() + "]";
	}

	@Override
	public String generateID() {
		String num = String.format("%04d", ++customerCounter);
		return "CST-" + num;
	}
	
	
}
