package com.bilgeadam.lesson036.abstractfactory;

public abstract class AbstractFactory {
	public abstract Createable create(String type) throws UnknownCreateableTypeException;
}
