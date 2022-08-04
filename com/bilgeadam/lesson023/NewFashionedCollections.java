package com.bilgeadam.lesson023;

import java.util.LinkedList;

import com.bilgeadam.lesson011.Person;

public class NewFashionedCollections {

	public static void main(String[] args) {
		LinkedList<String> strings = new LinkedList<>();
		strings.add("Elma");
		strings.add("Armut");
		strings.add("Üzüm");
		strings.add("Karpuz");
		for (String string : strings) {
			System.out.println(string);
		}
		
		LinkedList<Person> persons = new LinkedList<>();
		persons.add(new Person());
		
		for (Person person : persons) {
			System.out.println(person);
		}
	}

}
