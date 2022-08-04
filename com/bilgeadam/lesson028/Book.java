package com.bilgeadam.lesson028;

public class Book {
	String name;
	String isbn;
	String autor;
	int    year;

	public Book(String name, String isbn, String autor, int year) {
		super();
		this.name  = name;
		this.isbn  = isbn;
		this.autor = autor;
		this.year  = year;
	}

	@Override
	public String toString() {
		return "Book [name=" + this.name + ", isbn=" + this.isbn + ", autor=" + this.autor + ", year=" + this.year
				+ "]";
	}
}
