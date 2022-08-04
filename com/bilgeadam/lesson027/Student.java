package com.bilgeadam.lesson027;

import java.io.Serializable;
import java.time.LocalDate;

public class Student implements Serializable{
	private static final long serialVersionUID = -2600666978575425818L;
	int       id;
	String    name;
	LocalDate birthDate;

	public Student(int id, String name, LocalDate birthDate) {
		super();
		this.id        = id;
		this.name      = name;
		this.birthDate = birthDate;
	}

	@Override
	public String toString() {
		return "Student [id=" + this.id + ", name=" + this.name + ", birthDate=" + this.birthDate + "]";
	}
}
