package com.bilgeadam.lesson014;

public class Printer {
	private static final double CRITICAL_TONER_LEVEL  = 1d;
	private static final double TONER_USAGE_PER_SHEET = 0.5d;

	private String  printerName;     // yazıcımızın ismi
	private double  tonerLevel;      // anlık toner seviye bilgisi
	private int     printedBWPages;  // toplamda kaç adet siyah/beyaz sayfa basmış
	private int     printedColPages; // toplamda kaç adet renkli sayfa basmış
	private boolean dublexCapable;   // duplex printing yapabiliyor mu;
	private boolean colorCapable;    // renli printing yapabiliyor mu?
	private int     numPapers;       // yazıcıda kaç kağıt var?

	public Printer() {
		this.tonerLevel      = 100.0; // yeni bir yazıcı yarattığımızda toner'ı dolu gelir
		this.printedBWPages  = 0;     // yeni bir yazıcı yarattığımızda toplam basılan S/B sayfa sayısı 0'dır
		this.printedColPages = 0;     // yeni bir yazıcı yarattığımızda toplam basılan renkli sayfa sayısı 0'dır
		this.numPapers       = 0;     // yeni bir yazıcı yarattığımızda içinde kağıt yok
	}

	public void startPrintJob(int numPages, boolean colorPrint, boolean dublexPrint) { // emir işleme
		if (!isTonerLevelSufficient()) {
			System.err.println("Yeterli toner yok. Doldurulması gerekli.");
			this.fillToner(100.0);
		}

		int printedSheets = 0; // basılmış sayfa adedi
		while (printedSheets < numPages) { // basmış sayfa adedi istenilen sayfa adedinden az olduğu sürece baskıyta
											// devam et
			if (!isPaperAvailable()) {
				System.err.println("Yazıcıda kağıt kalmadı. Kağıt koyulması gerekli");
				this.fillPaper(50);
			}
			printedSheets = printPage(printedSheets, colorPrint, dublexPrint);
		}
		this.endPrintJob();
	}

	private int printPage(int sheetNumber, boolean colorPrint, boolean dublexPrint) {
		sheetNumber++;
		System.out.println(sheetNumber + ". sayfa basıldı");
		if (dublexPrint) {
			this.tonerLevel = this.tonerLevel - Printer.TONER_USAGE_PER_SHEET * 2;
			this.numPapers--;
		}
		else {
			this.tonerLevel  = this.tonerLevel - Printer.TONER_USAGE_PER_SHEET;
			this.numPapers  -= 2;
		}
		if (colorPrint) {
			this.printedColPages++;
		}
		else {
			this.printedBWPages++;
		}
		return sheetNumber;
	}

	private boolean isPaperAvailable() {
		return (this.numPapers / 2) > 0; // bir yaprağa bir veya iki sayfa basılabilir (duplex olup almamasına bağlı)
	} // o yüzden yüklenen sayfa adedini 2 ile çarpmıştık.

	private void endPrintJob() {
		System.out.println("Baskı başarı ile tamamlandı");
		this.statusReport();
	}

	private boolean isTonerLevelSufficient() {
		return this.tonerLevel >= Printer.CRITICAL_TONER_LEVEL;
	}

	public void setPrinterName(String printerName) {
		this.printerName = printerName;
	}

	public void fillToner(double tonerLevel) {
		if (tonerLevel > 100.0) { // en fazla %100 doldurmayı garanti ediyor
			tonerLevel = 100.0;
		}
		this.tonerLevel = tonerLevel;
	}

	public void setDublexCapable(boolean dublexCapable) {
		this.dublexCapable = dublexCapable;
	}

	public void setColorCapable(boolean colorCapable) {
		this.colorCapable = colorCapable;
	}

	public void fillPaper(int paperAmount) {
		this.numPapers = paperAmount * 2;  // her yaprağa 2 adet sayfa basıldığından kağıt adedimiz yüklenen yaprak adedinin iki katı olmalı
	}

	public void statusReport() {
		System.out.println("Yazıcı adı:\t" + this.printerName);
		int totalPages = printedBWPages + printedColPages;
		System.out.println("Toplam yazılan sayfa:\t" + totalPages);
		if (totalPages > 0) {
			double printedBWRate    =  printedBWPages / (double)totalPages;
			double printedColorRate = 1 - printedBWRate;
			System.out.println("S/B yazılan sayfa:\t" + printedBWPages + "\t (" + printedBWRate * 100 + "%)");
			System.out.println("Renkli yazılan sayfa:\t" + printedColPages + "\t (" + printedColorRate * 100 + "%)");
		}
		System.out.println("Toner seviyesi:\t" + tonerLevel);
	}

	@Override
	public String toString() {
		return "Printer [printerName=" + this.printerName + ", tonerLevel=" + this.tonerLevel + ", printedBWPages="
				+ this.printedBWPages + ", printedColPages=" + this.printedColPages + ", dublexCapable="
				+ this.dublexCapable + ", colorCapable=" + this.colorCapable + ", numPapers=" + this.numPapers + "]";
	}

	public boolean isDublexCapable() {
		return this.dublexCapable;
	}

	public boolean isColorCapable() {
		return this.colorCapable;
	}
}
