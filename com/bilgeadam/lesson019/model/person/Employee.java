package com.bilgeadam.lesson019.model.person;

import java.time.LocalDate;

/*
 * Çalışan numarası EMP-001
 */
public class Employee extends Person {
	private static int       employeeCounter;
	private double           salary;
	private LocalDate        startDate;
	private EmployeePosition position;       // kasiyer, tezgahtar, yönetici, ...

	public Employee(String name, LocalDate birthDate) {
		super(name, birthDate);
	}

	public Employee(String name, LocalDate birthDate, EmployeePosition position) {
		super(name, birthDate);
		this.position = position;
	}
	
	@Override
	public String toString() {
		return "Employee [salary=" + this.salary + ", startDate=" + this.startDate + ", position=" + this.position.getName()
				+ ", employeeID=" + this.idNumber + ", " + super.toString() + "]";
	}

	@Override
	public String generateID() {
		String num = String.format("%03d", ++employeeCounter);

		return "EMP-" + num;
	}

	public double getSalary() {
		return this.salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public LocalDate getStartDate() {
		return this.startDate;
	}

	public void setStartDate(LocalDate startDate) {
		this.startDate = startDate;
	}

	public String getPosition() {
		return this.position.getName();
	}

	public void setPosition(EmployeePosition position) {
		this.position = position;
	}
}
