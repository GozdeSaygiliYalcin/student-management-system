package com.bilgeadam.challenge.accounting;

public class Employee implements Comparable<Employee> {
	private static int EMPLOYEE_NUMBER = 1;

	private int     id;
	private String  firstName;
	private String  lastName;
	private boolean hourlyBased;
	private double  earning;

	public Employee(String firstName, String lastName) {
		super();
		this.id          = Employee.EMPLOYEE_NUMBER++;
		this.firstName   = firstName.trim();
		this.lastName    = lastName.trim();
	}
	
	public Employee(String firstName, String lastName, boolean hourlyBased, double earning) {
		this(firstName, lastName);
		this.hourlyBased = hourlyBased;
		this.earning     = earning;
	}

	public int getId() {
		return this.id;
	}

	public String getFirstName() {
		return this.firstName;
	}

	public String getLastName() {
		return this.lastName;
	}

	public String getName() {
		return this.firstName + " " + this.lastName;
	}

	@Override
	public String toString() {
		return this.getId() + " - " + this.getName();
	}

	@Override
	public int compareTo(Employee other) {
		return this.getName().compareTo(other.getName());
	}

	public boolean isHourlyBased() {
		return this.hourlyBased;
	}

	public void setHourlyBased(boolean hourlyBased) {
		this.hourlyBased = hourlyBased;
	}

	public double getEarning() {
		return this.earning;
	}

	public void setEarning(double earning) {
		this.earning = earning;
	}
}
