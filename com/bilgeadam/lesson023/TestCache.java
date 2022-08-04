package com.bilgeadam.lesson023;

public class TestCache {

	public static void main(String[] args) {
		CacheString string = new CacheString();
		string.add("bu bir string");
		
		CacheShirt shirt = new CacheShirt();
		shirt.add(new Shirt("mavi", 36, "black"));
		
		CacheAny<Shirt> shirts = new CacheAny<>();
		shirts.add(new Shirt("kırmızı", 38, "black"));
	}
}
