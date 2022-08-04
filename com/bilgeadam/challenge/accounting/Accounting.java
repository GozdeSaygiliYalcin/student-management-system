package com.bilgeadam.challenge.accounting;

public abstract class Accounting {
	public static final boolean HOURLY_BASED = true;
	public static final boolean SALARY_BASED = false;
	private int                 period;
	private Employee            employee;

	public abstract double getEarnings();

	public Accounting(int period, Employee employee) {
		super();
		this.period   = period;
		this.employee = employee;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Dönem: ").append(this.period).append(" - ");
		builder.append("Çalışan: ").append(employee.getName()).append(" - ");
		builder.append("Çalışma Türü: ").append(employee.isHourlyBased() ? "Saat başı ücretli" : "Aylık Ücretli").append(" - ");
		builder.append("Kazanç: ").append(this.getEarnings());
		return builder.toString();
	}

	public int getPeriod() {
		return this.period;
	}
}
