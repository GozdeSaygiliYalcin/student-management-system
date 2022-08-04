package com.bilgeadam.lesson011;

public class Typecasting {

	public static void main(String[] args) {
		int lowerType = 123;
		long higherType = lowerType;  //sorunsuz gerçekleşir, otomatik veya implicit olarak
		
		higherType = 123_123_123_121_123L;
		lowerType = (int)higherType;  // sorun oluşabilir = veri kaybı. Zorlamak veya explicit şekilde belirtmek gerekli
		System.out.println("lower type: " + lowerType + "\thigher type: " + higherType);

		float flt = 12.2345678f;
		double dbl = 12.234567890987654;
		
		double higher = flt;
		float lower = (float)dbl;
		System.out.println("lower: " + lower + "\thigher: " + higher);
	}

}
