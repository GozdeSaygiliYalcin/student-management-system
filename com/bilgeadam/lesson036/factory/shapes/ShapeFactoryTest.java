package com.bilgeadam.lesson036.factory.shapes;

public class ShapeFactoryTest {

	public static void main(String[] args) {
		try {
			ShapeFactory factory = new ShapeFactory();
			Shape s1 = factory.create("kare");
			s1.draw();
			Shape s2 = factory.create("daire");
			s2.draw();
			Shape s3 = factory.create("dikdörtgen");
			s3.draw();
//			Shape s4 = ShapeFactory.create("oıhj");
//			s4.draw();
//			
			Shape s5 = ShapeFactory.create(ShapeTypes.RECTANGLE);
			s5.draw();
		}
		catch (UnknownShapeTypeException ex) {
			System.err.println(ex.getMessage());
		}

	}

}
