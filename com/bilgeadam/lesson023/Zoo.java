package com.bilgeadam.lesson023;

import java.util.ArrayList;

public class Zoo <T extends Animal>{
	private ArrayList<T> animals;

	public Zoo () {
		this.animals = new ArrayList<>();
	}
	
	public void add(T t) {
		this.animals.add(t);
	}
	
	public void list() {
		for (T t : animals) {
			System.out.println(t);
		}
	}
}
