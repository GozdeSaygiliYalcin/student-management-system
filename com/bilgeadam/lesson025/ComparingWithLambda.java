package com.bilgeadam.lesson025;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

import com.bilgeadam.lesson024.Student;

public class ComparingWithLambda {

	public static void main(String[] args) {
		List<Student> students = new ArrayList<>();
		students.add(new Student(123456, "Ali", "Veli", LocalDate.of(1998, 11, 25)));
		students.add(new Student(678994, "Ayşe", "Fatma", LocalDate.of(1997, 4, 12)));
		students.add(new Student(678994, "Zeynep", "Fatma", LocalDate.of(1996, 4, 12)));
		students.add(new Student(678994, "Erşan", "Kuneri", LocalDate.of(1948, 1, 1)));
		System.out.println("İnitial order: " + Arrays.toString(students.toArray()));

		students.sort(new Comparator<Student>() {

			@Override
			public int compare(Student o1, Student o2) {
				long firstDate  = o1.getBirthDate().toEpochDay();
				long secondDate = o2.getBirthDate().toEpochDay();
				return Long.compare(firstDate, secondDate);
			}
		});

		System.out.println("Order by birth date: " + Arrays.toString(students.toArray()));
		
		students.sort((stu1, stu2) -> stu1.getLastName().compareTo(stu2.getLastName()));
//		students.stream().forEach(System.out::println);
		System.out.println("Order by lastname: " + Arrays.toString(students.toArray()));
		
		students.sort((stu1, stu2) -> {
			int result = stu1.getLastName().compareTo(stu2.getLastName());
			if (result == 0) {
				return stu1.getFirstName().compareTo(stu2.getFirstName());
			}
			else {
				return result;
			}
		});
		System.out.println("Order by lastname and firstname: " + Arrays.toString(students.toArray()));

		students.sort(Comparator.comparing(Student::getFirstName));
		System.out.println("Order by firstname: " + Arrays.toString(students.toArray()));
		
		students.sort(Comparator.comparing(Student::getLastName).thenComparing(Student::getFirstName));
		System.out.println("Order by lastname and firstname (2): " + Arrays.toString(students.toArray()));
	}

}
