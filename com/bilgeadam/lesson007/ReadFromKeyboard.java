package com.bilgeadam.lesson007;

public class ReadFromKeyboard {

	public static void main(String[] args) {
		DoubleReader reader1 = new DoubleReader();
		DoubleReader reader2 = new DoubleReader();
		double x = reader1.readX();
		double y = reader2.readY();
		
		System.out.println(x * y);
	}

}
