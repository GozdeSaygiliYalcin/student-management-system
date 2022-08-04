package com.bilgeadam.lesson024;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class StudentTest {

	public static void main(String[] args) {
		Student student1 = new Student(123456, "Ali", "Veli", LocalDate.of(1998, 11, 25));
		Student student2 = new Student(678994, "Ayşe", "Fatma", LocalDate.of(1997, 4, 12));
		Student student3 = new Student(678994, "Erşan", "Kuneri", LocalDate.of(1948, 1, 1));

		// öğrencileri sıralamak istesek
		System.out.println(student1.compareTo(student2));

		List<Student> students = new ArrayList<>();
		students.add(student1);
		students.add(student2);
		students.add(student3);
		System.out.println(Arrays.toString(students.toArray()));

		students.sort(new Comparator<Student>() {

			@Override
			public int compare(Student o1, Student o2) {
				long firstDate  = o1.getBirthDate().toEpochDay();
				long secondDate = o2.getBirthDate().toEpochDay();
				return Long.compare(firstDate, secondDate);
			}
		});
		
		System.out.println(Arrays.toString(students.toArray()));
	}

}
