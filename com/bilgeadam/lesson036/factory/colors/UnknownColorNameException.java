package com.bilgeadam.lesson036.factory.colors;

import com.bilgeadam.lesson036.abstractfactory.UnknownCreateableTypeException;

public class UnknownColorNameException extends UnknownCreateableTypeException {
	private static final long serialVersionUID = 1L;

	public UnknownColorNameException(String message) {
		super(message);
	}

}
