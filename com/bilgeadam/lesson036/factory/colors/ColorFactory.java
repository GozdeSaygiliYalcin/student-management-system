package com.bilgeadam.lesson036.factory.colors;

import com.bilgeadam.lesson036.abstractfactory.AbstractFactory;

public class ColorFactory extends AbstractFactory {
	
	public Color create(String colorName) throws UnknownColorNameException {
		if (colorName.equalsIgnoreCase("kırmızı")) {
			return new Red();
		}
		if (colorName.equalsIgnoreCase("mavi")) {
			return new Blue();
		}
		if (colorName.equalsIgnoreCase("yeşil")) {
			return new Green();
		}
		return null;  // bilinmeyen renk türü geldiğinde null da dönebiliriz. Bir çok teklike (NullPointerException) veye
						// Factory'nin çağrıldığı noktada gereksiz kontroller yapmamıza neden olur
//		throw new UnknownColorNameException("Given color name is not supported <<<" + colorName + ">>>");
	}
}
