package com.bilgeadam.lesson036.factory.shapes;

import com.bilgeadam.lesson036.abstractfactory.AbstractFactory;

public class ShapeFactory extends AbstractFactory {

	public Shape create(String shapeName) throws UnknownShapeTypeException {
		if (shapeName.equalsIgnoreCase("kare")) {
			return new Square();
		}
		if (shapeName.equalsIgnoreCase("daire")) {
			return new Circle();
		}
		if (shapeName.equalsIgnoreCase("dikdörtgen")) {
			return new Rectangle();
		}
		throw new UnknownShapeTypeException("Given shape name is not supported <<<" + shapeName + ">>>");
	}

	public static Shape create(ShapeTypes type) throws UnknownShapeTypeException {
		return switch (type) {
			case SQUARE: {
				yield new Square();
			}
			case RECTANGLE: {
				yield new Rectangle();
			}
			case CIRCLE: {
				yield new Circle();
			}
			default:
				throw new UnknownShapeTypeException("Given shape name is not supported <<<" + type + ">>>");
		};
	}
}
