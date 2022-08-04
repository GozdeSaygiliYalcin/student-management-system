package com.bilgeadam.lesson021;

public class ThreeDimArray {

	public static void main(String[] args) {
		int[][][] threeDimInts = new int[3][4][5];
		
		threeDimInts[0][0][0] = 0;
		threeDimInts[0][0][1] = 1;
		threeDimInts[0][0][2] = 2;
		
		threeDimInts[0][1][0] = 10;
		threeDimInts[0][1][1] = 11;
		threeDimInts[0][1][2] = 12;
		
		threeDimInts[1][1][0] = 110;
		threeDimInts[1][1][1] = 111;
		threeDimInts[1][1][2] = 112;
		
		for (int i = 0; i < threeDimInts.length; i++) {
			for (int j = 0; j < threeDimInts[i].length; j++) {
				for (int k = 0; k < threeDimInts[i][j].length; k++) {
					System.out.println(i + " - " + j + " - " + k + " = " + threeDimInts[i][j][k]);
				}
			}
		}
	}

}
