package com.bilgeadam.lesson028;

import java.time.LocalDate;

public abstract class Table extends Furniture { // sadece masa üretemeyeceğimiz için (ya fixsize, ya variablesize)
												// masayı abstract yaptık.
	private int   numOfLegs;
	protected int numOfPlaces;	// extend eden sınıflar bu nteliğe ulaşabilsinler diye protected

	public Table(String name, Material material, Color color, LocalDate productionDate, double price, int numOfLegs) {
		super(name, material, color, productionDate, price);
		this.numOfLegs = numOfLegs;
	}

	public int getNumberOfLegs() {
		return this.numOfLegs;
	}

	public abstract int getNumberOfPlaces(); // açılabilir veya sabit masaların iskele sayısı farklı. Masa sınıfı bu
												// soruya yanıt veremiyor
	// o yüzden de sorumluluğu (yani implementasyonu) alt sınıflara bırakıyor
}
