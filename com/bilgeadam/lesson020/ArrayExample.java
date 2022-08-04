package com.bilgeadam.lesson020;

import java.util.Scanner;

public class ArrayExample {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
//		System.out.print("İlk array'in boyutu: ");
//		int   numOfElements = in.nextInt();
//		int[] array1        = new int[numOfElements];
//		System.out.println();
//		for (int i = 0; i < array1.length; i++) {
//			System.out.print((i + 1) + ". öğe: ");
//			array1[i] = in.nextInt();
//		}
//		System.out.println();
//		System.out.print("İkinci array'in boyutu: ");
//		numOfElements = in.nextInt();
//		int[] array2 = new int[numOfElements];
//		for (int i = 0; i < array2.length; i++) {
//			System.out.print((i + 1) + ". öğe: ");
//			array2[i] = in.nextInt();
//		}

		int[] array1 = {9,82,44,23,3};
		int[] array2 = {8,23,35,82,27,22};
		int length = array2.length;
		for (int i = 0; i < array1.length; i++) {
			for (int j = 0; j < array2.length; j++) {
				if (array1[i] == array2[j]) {
					array2[j] = -1;
					length--;
				}
			}
		}

		int array2Counter = 0;
		int[] array3 = new int[array1.length + length];
		for (int i = 0; i < array3.length; i++) {
			if (i < array1.length) {
				array3[i] = array1[i];
			}
			else {
				if (array2[array2Counter] != -1) {
					array3[i] = array2[array2Counter];
				}
				else {
					i--;
				}
				array2Counter++;
			}
		}

		for (int i : array3) {
			System.out.println(i);
		}
		in.close();

	}

}
