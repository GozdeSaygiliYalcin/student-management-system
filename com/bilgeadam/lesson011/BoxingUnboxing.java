package com.bilgeadam.lesson011;

public class BoxingUnboxing {

	public static void main(String[] args) {
		int primitiveNumber = 5;
		
		Integer complexNumber = primitiveNumber;   // boxing (kutulama) primitive türü sınıfa dönüştürme
		System.out.println(complexNumber);
		
		Boolean isTrue = null;
		
		if (isTrue == null) {
			isTrue = false; // otomatik olarak unboxing yapıyor ve primitive boolean olarak kullanıyor
		}
		if (isTrue)  
			System.out.println("Doğru");
		else
			System.out.println("Yanlış");
	}

}
