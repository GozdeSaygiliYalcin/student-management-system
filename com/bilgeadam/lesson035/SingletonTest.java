package com.bilgeadam.lesson035;

public class SingletonTest {

	public static void main(String[] args) {
		System.out.println("herhangi bir şey yaptım");
		
		Commons.getInstance().getLogger().info("logger üzerinden ");
		Commons.getInstance().setSomething("bla bla");
		System.out.println(Commons.getInstance().getSomething());
		
	}

}
