package com.bilgeadam.challenge.accounting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

public class PersonnelManagement {
	private List<Employee>   employees;
	private Map<Integer, List<Accounting>> payments;

	public PersonnelManagement() {
		super();
		this.employees = new ArrayList<>();
		this.payments  = new HashMap<>();
	}

	public static void main(String[] args) {
		PersonnelManagement mngmt = new PersonnelManagement();
		mngmt.initEmployeeList();
		mngmt.listEmployees();
		mngmt.fireEmployee("Çağıl Ezgi ", "Aydemir");
		mngmt.listEmployees();
		mngmt.sortEmployeesByName();
		mngmt.listEmployees();
		mngmt.createSalaryList(1);
		mngmt.createSalaryList(2);
		mngmt.createSalaryList(3);
		mngmt.showPaymentsFor(2);
	}

	private void showPaymentsFor(int period) {
		List<Accounting> periodsPayments = this.payments.get(period);
		periodsPayments.stream().forEach(System.out::println);
	}

	private void createSalaryList(int period) {
		List<Accounting> periodsPayments = new ArrayList<>();
		Random rnd = new Random();
		for (Employee employee : this.employees) {
			Accounting payment;
			if (employee.isHourlyBased()) {
				payment = new Payslip(period, employee, employee.getEarning(), rnd.nextInt(170));
			}
			else {
				payment = new Payroll(period, employee, employee.getEarning());
			}
			periodsPayments.add(payment);
		}
		
		this.payments.put(period, periodsPayments);
	}

	private void sortEmployeesByName() {
		Collections.sort(employees);
	}

	private void fireEmployee(String firstName, String lastName) {
		Employee employeeToFire = new Employee(firstName, lastName);
		int      index          = -1;
		boolean  found          = false;
		for (Employee employee : employees) {
			index++;
			if (employee.getName().equalsIgnoreCase(employeeToFire.getName())) {
				found = true;
				break;
			}
		}
		if (found) {
			this.employees.remove(index);
		}
	}

	private void listEmployees() {
		System.out.println("\n===================");
		System.out.println("| Çalışan Listesi |");
		System.out.println("===================");
		this.employees.stream()
				.forEach(employee -> System.out.printf("%2d - %s\n", employee.getId(), employee.getName()));
	}

	private void initEmployeeList() {
		this.employees.add(new Employee("Talha   ", "Çamlıca", Accounting.HOURLY_BASED, 250.0));
		this.employees.add(new Employee("Cebrail", "Kaplan", Accounting.HOURLY_BASED, 225.0));
		this.employees.add(new Employee("Elif", "Yıldırım", Accounting.HOURLY_BASED, 150.0));
		this.employees.add(new Employee("Olgu  ", "Başak", Accounting.HOURLY_BASED, 250.0));
		this.employees.add(new Employee("Eralp ", "Nitelik", Accounting.HOURLY_BASED, 225.0));
		this.employees.add(new Employee("Gözde  Saygılı ", "Yalçın", Accounting.HOURLY_BASED, 300.0));
		this.employees.add(new Employee("Berna Baykan", "Dere", Accounting.SALARY_BASED, 25000.0));
		this.employees.add(new Employee("Hande ", "Hüdaioğlu", Accounting.SALARY_BASED, 22500.50));
		this.employees.add(new Employee("Veysel Karani    ", "Yazıcı", Accounting.SALARY_BASED, 25000.0));
		this.employees.add(new Employee("Mehmet Hasan  ", "Çifçi", Accounting.SALARY_BASED, 21234.0));
		this.employees.add(new Employee("Can", "Demirhan", Accounting.SALARY_BASED, 25000.0));
		this.employees.add(new Employee("Recep  ", "Kabakcı", Accounting.SALARY_BASED, 35000.0));
		this.employees.add(new Employee("Çağatay", "Ünal", Accounting.SALARY_BASED, 25000.0));
		this.employees.add(new Employee("Semih  ", "Biygit", Accounting.SALARY_BASED, 13578.0));
		this.employees.add(new Employee("Çağıl Ezgi ", "Aydemir", Accounting.SALARY_BASED, 11340.0));
		this.employees.add(new Employee("Yusuf     ", "Yardımcıel", Accounting.SALARY_BASED, 35000.0));

	}

}
