package com.bilgeadam.lesson021;

public class Sales {
	private static final int NORTH = 0;
	private static final int SOUTH = 1;
	private static final int EAST  = 2;
	private static final int WEST  = 3;

	// 2021 ve 2022 (kuzey, güney, doğu, batı)

	public static void main(String[] args) {
		double sales2021North, sales2021South, sales2021East, sales2021West;
		double sales2022North, sales2022South, sales2022East, sales2022West;

		double[] sales = new double[8]; // ilk dört öğe kuzek güney, doğu, batı olarak 2021 satış degerleri, gerisi aynı
										// sıra ile 2022
		
		double[][] sales1 = new double[4][2];   // satırlar bölge + kolonlar yıl
		double[][] sales2 = new double[2][4];   // satırlar yıl + kolonlar bölge
		
		sales2[0][NORTH] = 34;
		
		sales1[NORTH][0] = 34;
		
	}

}
