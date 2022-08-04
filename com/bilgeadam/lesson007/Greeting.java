package com.bilgeadam.lesson007;

public class Greeting {

	public static void main(String[] args) {

		SimpleGreeting object1 = new SimpleGreeting();   // SimpleGreeting s�n�f�ndan bir nesne �rettik
		SimpleGreeting nesne = new SimpleGreeting();

		GraphicalGreeting object2 = new GraphicalGreeting();	 // GraphicalGreeting s�n�f�ndan bir ba�ka nesne �rettik
		GraphicalGreeting object4 = new GraphicalGreeting();

		object1.hello();
		object1.bye();
		object1.hello();

		nesne.bye();
		
		object2.hello();
		object2.bye();
	}

}
