package com.bilgeadam.lesson012;

public class EndlessHello {

	public static void main(String[] args) {
		sayHello(78);
	}

	private static void sayHello(int counter) {
		System.out.println(counter + ". Hello");
		sayHello(++counter);
	}
}
