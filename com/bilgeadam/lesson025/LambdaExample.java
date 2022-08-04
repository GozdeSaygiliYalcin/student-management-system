package com.bilgeadam.lesson025;

public class LambdaExample {

	public static void main(String[] args) {
	
		System.out.println(sumOfArray(10, 20));
		
		LambdaExampleFunctioanInterface lambda = (a, b) -> {System.out.println(a + " + " + b); return a+b;};
		int sum = lambda.process(10, 20);
		System.out.println(sum);
		
		LambdaExampleFunctioanInterface lambda2 = (a, b) -> {System.out.println(a + " * " + b); return a*b;};
		System.out.println(lambda2.process(10, 20));
		
		
	}

	private static int sumOfArray(int a, int b) {
		System.out.println(a + " + " + b);
		return a + b;
	}

}
