package com.bilgeadam.lesson028;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class CollectionExample {

	public static void main(String[] args) {
		Book b1 = new Book("Küçük Prens", "7687326", "Saint Excupery", 1978);
		Book b2 = new Book("Java", "rewrew", "Babür Somer", 2022);
		Book b3 = new Book("Tutunamayanlar", "6756756", "Oğuz atay", 1972);
		Book b4 = new Book("1984", "42342", "George Orwell", 1984);
		
		List<Book> bookList = new ArrayList<>();
		bookList.add(b1);
		bookList.add(b2);
		bookList.add(b3);
		bookList.add(b4);
		
		HashMap<String, Book> booksByName = new HashMap<String, Book>();
		booksByName.put(b1.name, b1);
		booksByName.put(b2.name, b2);
		booksByName.put(b3.name, b3);
		booksByName.put(b4.name, b4);

		HashMap<String, Book> booksByAutor = new HashMap<String, Book>();
		booksByAutor.put(b1.autor, b1);
		booksByAutor.put(b2.autor, b2);
		booksByAutor.put(b3.autor, b3);
		booksByAutor.put(b4.autor, b4);
		
		HashMap<Integer, Book> booksByYear = new HashMap<Integer, Book>();
		booksByYear.put(b1.year, b1);
		booksByYear.put(b2.year, b2);
		booksByYear.put(b3.year, b3);
		booksByYear.put(b4.year, b4);
		
		
		
	}

}
