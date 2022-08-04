package com.bilgeadam.lesson036.abstractfactory;

import com.bilgeadam.lesson036.factory.animals.Animal;
import com.bilgeadam.lesson036.factory.colors.Color;
import com.bilgeadam.lesson036.factory.shapes.Shape;

public class AbstractFactoryTest {

	public static void main(String[] args) {
		try {
			AbstractFactory factory = FactoryProducer.produce("renk");
			Createable c = factory.create("kırmızı");
			((Color)c).sayColorName();
			
			factory = FactoryProducer.produce("şekil");
			c = factory.create("kare");
			((Shape)c).draw();
			
			factory = FactoryProducer.produce("hayvan");
			c = factory.create("kuş");
			((Animal)c).giveSound();
			
			c.info();
		}
		catch (UnknownCreateableTypeException ex) {
			ex.printStackTrace();
		}

	}

}
