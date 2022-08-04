package com.bilgeadam.lesson027;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class StudentClass implements Serializable {
	private static final long serialVersionUID = -5369190745598249226L;
	String        code;
	String        name;
	String        subject;
	List<Student> students;

	public StudentClass(String code, String name, String subject) {
		super();
		this.code     = code;
		this.name     = name;
		this.subject  = subject;
		this.students = new ArrayList<>();
	}

	public void addStudent(Student student) {
		this.students.add(student);
	}

	@Override
	public String toString() {
		return "StudentClass [code=" + this.code + ", name=" + this.name + ", subject=" + this.subject + ", students="
				+ this.students + "]";
	}
}
