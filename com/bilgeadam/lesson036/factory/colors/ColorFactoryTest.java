package com.bilgeadam.lesson036.factory.colors;

public class ColorFactoryTest {

	public static void main(String[] args) {
		try {
			ColorFactory factory = new ColorFactory();
			Color        c1      = factory.create("kırmızı");
			c1.sayColorName();
			Color c2 = factory.create("mavi");
			c2.sayColorName();
			Color c3 = factory.create("yeşil");
			c3.sayColorName();
			Color c4 = factory.create("siyah");
			if (c4 != null)
				c4.sayColorName();
		}
		catch (UnknownColorNameException ex) {
			System.err.println(ex.getMessage());
		}
	}
}
