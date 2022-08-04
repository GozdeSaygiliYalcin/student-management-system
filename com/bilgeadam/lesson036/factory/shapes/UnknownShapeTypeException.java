package com.bilgeadam.lesson036.factory.shapes;

import com.bilgeadam.lesson036.abstractfactory.UnknownCreateableTypeException;

public class UnknownShapeTypeException extends UnknownCreateableTypeException {
	private static final long serialVersionUID = 1L;

	public UnknownShapeTypeException(String message) {
		super(message);
	}
}
