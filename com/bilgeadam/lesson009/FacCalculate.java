package com.bilgeadam.lesson009;


import java.util.Scanner;

public class FacCalculate {

	public static void main(String[] args) {
		
		
		@SuppressWarnings("resource")
		Scanner input= new Scanner(System.in);
		System.out.println("Lütfen bir sayı giriniz: ");
		long number=input.nextLong();
		long fac=1L; 
		
		
		for(long i=1;i<=number;i++){
			fac *= i;
		}
		System.out.println(number + "!= "+ fac);
	}

}