package com.bilgeadam.lesson021;

import java.util.Arrays;
import java.util.Random;

public class ArrayUtilsTest {

	public static void main(String[] args) {
		int length = 10;
		int[][] ints = new int[length][length];
		
		boolean[][][] xx = new boolean[3][3][3];
		
		xx[0][1][2] = false;
		
		Random rnd = new Random();
		
		for (int i=0; i < length; i++) {
			for (int j = 0; j < length; j++)
			ints[i][j] = rnd.nextInt();
		}
		
		System.out.println(ints);
		System.out.println(Arrays.deepToString(ints));
		
		int[] array = new int[length];
		Arrays.fill(array, 5);
		System.out.println(Arrays.toString(array));
		
		int[] arr2 = new int[length];
		for (int i=0; i < length; i++) {
			arr2[i] = rnd.nextInt();
		}

		System.out.println(Arrays.toString(arr2));
		Arrays.sort(arr2);
		System.out.println(Arrays.toString(arr2));
	}

}
