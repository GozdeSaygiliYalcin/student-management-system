package com.bilgeadam.lesson013;

public class Test {
	int variableA;

	public static void main(String[] args) {
		int  variableA = 10;
		Test test      = new Test();
		System.out.println("Main after calling test-method: " + test.test(variableA));
		System.out.println("Main local variable: " + variableA);
		System.out.println("Main örnek değişkeni: " + test.variableA);
	}

	int test(int variableA) {
		variableA += 25;
		System.out.println("Test local variable: " + variableA);
		return this.variableA;
	}
}
