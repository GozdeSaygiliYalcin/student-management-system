package com.bilgeadam.lesson014;

public class Shadowing {
	String a;
	int    b;

	public static void main(String[] args) {
		Shadowing shadow = new Shadowing();
		System.out.println(shadow.foo(10));
	}

	int foo(int a) {   // sınıf değişkenlerini gölgeleme
		int b = 50;		// local (küçük kapsamlı) bloklarda aynı isimle tanımlanan
		return a + b;	// değişkenler sınıf değişkenlerini gölgeler/ezer
	}
	
	int foo2(int a) {   
		int b = 50;		
		if (a < b) {
//			int a = 26; // local olarak tanımlanmış değişkenleri gölgeleme
//			int b = 45;	// imkanı yok. Hata verir
		}
		return a + b;	
	}
	
}
