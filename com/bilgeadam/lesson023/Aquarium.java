package com.bilgeadam.lesson023;

import java.util.ArrayList;

public class Aquarium<T extends WaterAnimal> {
	private ArrayList<T> animals;

	public Aquarium () {
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
