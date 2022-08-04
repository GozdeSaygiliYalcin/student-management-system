package com.bilgeadam.lesson014;

public class LocalVariable {
	int y;

	public static void main(String[] args) {
		int           x     = 6;
		LocalVariable local = new LocalVariable();
		
		System.out.println(local.y);
		System.out.println(x);
	}

	int foo(int a) {
		int x = 2;
		if (a < 35) {
			int y = 0;
			int z = 2;
			return a * x * z + y;
		}
		else {
			int y = 1;
			// return a * x * z + y; compiler hatası verir çünkü z bu blokta tanımsız
			return a * x + y;
		}
	}

	int foo2(int a) {
		int x = 2;
		if (a < 35) {
			int y = 0;
			int z = 2; // her blok bir birinden bağımsız olduğu için her ......
			return a * x * z + y;
		}
		else {
			int  y = 1;
			char z = 'b'; // .... blokta aynı ismi farklı türlerle kullanabiliriz
			return a * x * z + y;
		}
	}
}
