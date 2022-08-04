package com.bilgeadam.lesson028;

import java.util.Scanner;

public class Quetions {

	public static void main(String[] args) {
		Scanner inStr = new Scanner(System.in);
		Scanner inNum = new Scanner(System.in);
		int i = inNum.nextInt();
		String str = inStr.nextLine();
		
		System.out.println(i);
		System.out.println(str);
		
		inStr.close();
		inNum.close();
	}

}
