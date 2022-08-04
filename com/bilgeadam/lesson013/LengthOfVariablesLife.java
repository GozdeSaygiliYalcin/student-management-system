package com.bilgeadam.lesson013;

public class LengthOfVariablesLife {
	double totalAmount;  //örnek değişkeni
	
	public static void main(String[] args) {
		double totalAmount = 0;
		LengthOfVariablesLife life = new LengthOfVariablesLife();
		life.calculate(14, 100);
		System.out.println(life.totalAmount);
		
	}
	
	void calculate(double rate, int amount) { // rate: argüman = yerel değişken
		double taxRate = rate / 100;  	// yerel değişken 

		double totalAmount = 0;  		// yerel değişken

		if (taxRate > 0) {
			double taxAmount;
			taxAmount = taxRate * amount;
			this.totalAmount = amount + taxAmount;
		}
		System.out.println("Toplam :" + totalAmount);
	}

}
