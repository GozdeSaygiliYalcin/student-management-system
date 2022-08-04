package com.bilgeadam.lesson014;

import java.util.Scanner;

public class PrinterManager {
	private Printer printer; // nesne özniteliği. PrinterManager'in bir yazıcısı var artık.

	public static void main(String[] args) {

		PrinterManager manager = new PrinterManager();
		manager.initPrinter();
		manager.startPrinting();

		/*
		PrinterManager manager = new PrinterManager();
		manager.startPrintJob();
		
		Eğer startPrintJob()'u static olarak tanımlamaz isek o zaman printermanager sınıfından
		bir nesne üretmemiz ve o nesnenin bişr metodu olarak çağırmmaız gerekirdi.
		
		static metod ve değişkenler sınıfa ait varlıklardır.
		startPrintJob(printer);
		*/

	}

	private void initPrinter() {
		printer = new Printer();
		printer.setColorCapable(true);
		printer.setDublexCapable(true);
		printer.fillPaper(10);
		printer.setPrinterName("Benim Yazıcım");
		printer.statusReport();
		// System.out.println(printer); // genel kontrol için. Atanan değerler doğru gösteriliyor mu?
	}

	private void startPrinting() {

		Scanner in = new Scanner(System.in);
		while (true) {
			System.out.print("Kaç sayfa basmak istiyorsunuz?: ");
			int numPages = in.nextInt();
			in.nextLine();
			if (numPages == 0) {
				break;
			}
			
			boolean colorPrint = false;
			if (printer.isColorCapable()) {
				System.out.print("Renkli basmak ister misiniz ([E]vet/:[H]ayır) ");
				colorPrint = in.nextLine().equalsIgnoreCase("e");
			}

			boolean dublexPrint = false;
			if (printer.isDublexCapable()) {
				System.out.print("Arkalı/önlü basmak ister misiniz ([E]vet/:[H]ayır) ");
				dublexPrint = in.nextLine().equalsIgnoreCase("e");
			}

			printer.startPrintJob(numPages, colorPrint, dublexPrint); // akış diyagramında "emri işle"ye tekabül etmekte
		}
		in.close();
	}
}
