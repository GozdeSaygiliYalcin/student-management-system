package com.bilgeadam.lesson019.model.person;

import java.time.LocalDate;

public abstract class Person {
	private String    name;
	private String    address;
	private LocalDate birthDate;
	protected String  idNumber;

	public Person(String name, LocalDate birthDate) {
		this.name      = name;
		this.birthDate = birthDate;
		this.idNumber  = this.generateID();
	}

	public abstract String generateID();

	public String getAddress() {
		return this.address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getName() {
		return this.name;
	}

	public LocalDate getBirthDate() {
		return this.birthDate;
	}

	@Override
	public String toString() {
		return "Person [name=" + this.name + ", address=" + this.address + ", birthDate=" + this.birthDate + "]";
	}
}
