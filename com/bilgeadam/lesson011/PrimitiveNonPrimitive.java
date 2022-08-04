package com.bilgeadam.lesson011;

public class PrimitiveNonPrimitive {

	public static void main(String[] args) {
		int a;
		a = 10;
		System.out.println(a);
		
		int b = a;
		System.out.println(b);
		
		a = 20;
		System.out.println(a);
		System.out.println(b);
		
		Person p;
		p = null;
		System.out.println(p);  // daha henüz yeni bir nesne oluşmadı. 
								// Sadece stack'te bir bellek alanı belirlendi 
		
		p = new Person();		// yeni bir nesne üretildi. Stack'te nesne için
		System.out.println(p);	// ayrılan belleğin başlangıç adresi tutuluyor
		
		System.out.println(p.name);
		System.out.println(p.age);
		p.name = "Babür";
		System.out.println(p.name);
		
		Person q = p;
		System.out.println(q);
		p.name = "Başka bir isim";
		System.out.println(p.name);
		System.out.println(q.name);
	}

}
