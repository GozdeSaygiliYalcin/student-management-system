package com.bilgeadam.challenge.accounting;

public class Payroll extends Accounting {
	private double salary;
	
	public Payroll(int period, Employee employee, double salary) {
		super(period, employee);
		this.salary = salary;
	}
	
	@Override
	public double getEarnings() {
		return this.salary;
	}

}
