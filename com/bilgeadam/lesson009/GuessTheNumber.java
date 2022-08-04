package com.bilgeadam.lesson009;

import java.util.Random;
import java.util.Scanner;

public class GuessTheNumber {

	/**
	 * (1) 	Bilgisayar  1 ila 100 arasında 50 hariç bir tam sayıyı kafasından atacak siz de o sayıyı tahmin etmeye çalışacaksınız
	 * 		Bilgisayar tahminlerinizi "yüksek" veya "alçak" şeklinde değerlendirecek
	 * (2)	Yeni özellik: 10 defada sayı bulunamaz ise oyuncu oyunu kaybetsin
	 * (3)  0 sayısı ile oyun sonlandırılabilsin
	 */
	public static void main(String[] args) {
		Random rnd = new Random();					// random sayı üretmeye yarayan sınıf

		// 1 ila 100 arası 50 hariç bir tam sayı üretmek için
		int numberToGuess;
		do {
			numberToGuess = rnd.nextInt(101);		
		} while (numberToGuess == 0 || numberToGuess == 50);
		
		System.out.println(numberToGuess);
		boolean numberFound = false;				// ilk durumda sayı bulunmamış durumda
		Scanner input = new Scanner(System.in);		// scanner açtık
		int guess;									// tahmin edilen sayı
		int guessCount = 0;
		
		do {
			do {
				System.out.print("Lütfen 1 ila 100 arası bir sayı giriniz (0 ile oyunu sonlandır): ");
				guess = input.nextInt();
				if (0 > guess || guess > 100) {
					System.err.println("Lütfen biraz dikkat");
				}
			} while (!(0 <= guess && guess <= 100));
			
			if (guess == 0) {
				break;				// break bir loop'u anında sonlandırır.
			}
			
			if (guess == 50) {
				System.out.println("50 giremezsiniz");
				continue;			// continue bir loop'un işleme devam etmesini durdurur ve loop'ın başına döner.
			}
			
			guessCount++;
			System.out.println();
			if (guess == numberToGuess) {
				System.out.println("Tebrikler " + guessCount + ". denemede doğru sayıyı buldunuz!");
				numberFound = true;					// sayı bulundu
			}
			else {
				if (guess > numberToGuess) {
					System.out.println(guessCount + ". deneme: <<<Çok yüksek>>>");
				}
				else {
					System.out.println(guessCount + ". deneme: <<<Çok alçak>>>");
				}
			}
		} while (!numberFound && guessCount <= 10);  // aslında numberFound'a ihtiyaç yok. while(numberToGuess != guess) şeklinde de olabilirdi
		
		input.close();
		if (!numberFound) {
			System.err.println("Çok başarısızsınız");
		}
		System.out.println("Umarım eğlendiniz");
	}
	
	
}
