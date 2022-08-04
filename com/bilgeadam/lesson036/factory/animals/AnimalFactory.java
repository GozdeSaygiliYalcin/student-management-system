package com.bilgeadam.lesson036.factory.animals;

import com.bilgeadam.lesson036.abstractfactory.AbstractFactory;
import com.bilgeadam.lesson036.abstractfactory.Createable;
import com.bilgeadam.lesson036.abstractfactory.UnknownCreateableTypeException;

public class AnimalFactory extends AbstractFactory{

	@Override
	public Createable create(String animal) throws UnknownCreateableTypeException {
		if (animal.equalsIgnoreCase("kedi"))
			return new Cat();
		
		if (animal.equalsIgnoreCase("köpek"))
			return new Dog();
		
		if (animal.equalsIgnoreCase("kuş"))
			return new Bird();
		
		throw new UnknownCreateableTypeException("Desteklenmeyen hayvan"); // never do that: Exception'ların içine her zaman ingilizce mesaj yazılır
	}
}
