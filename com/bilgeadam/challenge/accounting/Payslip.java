package com.bilgeadam.challenge.accounting;

public class Payslip extends Accounting {
	private double hourlyRate;
	private double hoursInPeriod;

	public Payslip(int period, Employee employee, double rate, double hours) {
		super(period, employee);
		this.hourlyRate    = rate;
		this.hoursInPeriod = hours;
	}

	@Override
	public double getEarnings() {
		return this.hourlyRate * this.hoursInPeriod;
	}

}
