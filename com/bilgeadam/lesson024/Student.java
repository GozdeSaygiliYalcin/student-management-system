package com.bilgeadam.lesson024;

import java.time.LocalDate;

public class Student implements Comparable<Student> {
	private int       id;
	private String    firstName;
	private String    lastName;
	private LocalDate birthDate;
	
	public Student(int id, String firstName, String lastName, LocalDate birthDate) {
		super();
		this.id        = id;
		this.firstName = firstName;
		this.lastName  = lastName;
		this.birthDate = birthDate;
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

	public LocalDate getBirthDate() {
		return this.birthDate;
	}

	@Override
	public String toString() {
		return "Student [id=" + this.id + ", firstName=" + this.firstName + ", lastName=" + this.lastName
				+ ", birthDate=" + this.birthDate + "]";
	}

	@Override
	public int compareTo(Student otherStudent) {
//		if (this.id < otherStudent.id) {
//			return -1;
//		} else if (this.id > otherStudent.id) {
//			return 1;
//		}
//		return 0;
		
//		// daha kısa yol:
//		return this.id > otherStudent.id ? 1 : (this.id < otherStudent.id ? -1 : 0);
		
//		// id'lere göre sıralama
//		return Integer.compare(this.id, otherStudent.id);
		
		//soyadlara göre sıralama
		return this.lastName.compareTo(otherStudent.lastName);
	}
}
