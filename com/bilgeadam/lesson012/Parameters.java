package com.bilgeadam.lesson012;

public class Parameters {

	public static void main(String[] args) {
		int a = 3;
		int b = 2;
		System.out.println("3 + 2       = " + add(a, b));
		System.out.println("3 + 2 + 15  = " + add(a, b, 15));
		System.out.println("3 x 2       = " + multiply(a, b));
		System.out.println("3'ün karesi = " + quadrat(a));
	}

	private static int add(int a, int b, int c) {
		// return a + b + c;			==> bir yöntem
		
		// return add(add(a, b), c);	==> başka bir yol
		
		// int temp = add(a,b);			==> bambaşka bir yol
		// return add(temp, c);
		
		return add(a, b) + c;
	}

	private static int quadrat(int a) {
		return multiply(a, a);
	}

	private static int multiply(int a, int b) {
		return a * b;
	}

	private static int add(int a, int b) {
		a++;
		b--;
		return a + b;
	}

}
