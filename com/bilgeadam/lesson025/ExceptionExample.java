package com.bilgeadam.lesson025;

import java.util.Scanner;

public class ExceptionExample {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		while (true) {
			try {
//				int i = in.nextInt();
//				System.out.println(i);

				read(in);
				break;
			}
//			catch (NumberInputException e) {
//				System.out.println(e.getMessage());
//			}
			catch (PuncuationInputException | SpaceInputException e) {  // exception türlerini OR'luyoruz
				System.err.println(e.getMessage());
			}
			catch (Exception e) {
				System.err.println("Hatalı veriş tipi girişi. Tekrar lütfen");
				System.out.println(e.getMessage());
//				e.printStackTrace();
			}

			finally {
				in.nextLine();
			}
		}
		in.close();
	}
	
	private static void read(Scanner in) throws PuncuationInputException, SpaceInputException {
		try {
			readOnlyStrings(in);
		}
		catch (NumberInputException ex) {
			System.err.println("hatasız kul olmaz");
		}
	}

	private static void readOnlyStrings(Scanner in) throws NumberInputException, PuncuationInputException, SpaceInputException {
		System.out.println();
		System.out.print("Lütfen sayı harici bir karakter girin: ");
		String str = in.nextLine();
		char[] chars = str.toCharArray();
		for (char c : chars) {
			if (c >= '0' &&  c <= '9' ) {
				throw new NumberInputException("Sadece sayı harici karakterler girilebilir");
			}
			else if (c >= '!' &&  c <= '/' ) {
				throw new PuncuationInputException("Noktalama işaretleri girilmiş");
			}
			else if (c == ' ') {
				throw new SpaceInputException("Boşluk girilemez");
			}

		}
		
	}
}
