package com.bilgeadam.lesson026;

import java.io.File;
import java.io.IOException;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;

public class FileExample {

	public static void main(String[] args) {
		File myFile = new File("C:\\Users\\babur.somer\\OneDrive - BilgeAdam\\Boost\\26 - File Examples");
		if (myFile.isFile()) {
			System.out.println("Bir dosya");
		}
		
		if (myFile.isDirectory()) {   // klasör mü dosya mı?
			System.out.println("Bir klasör");
			String[] fileNames = myFile.list();   // klasörün içinde bulunan tüm varlıkların isimlerini listele. (bunlar dosya veya klasör olabilirler)
			for (String fileName : fileNames) {	// listeyi işliyoruz
				File file = new File(myFile, fileName);	// her bir varlık için üstünde çalıştığımız klasör bilgilerini kullanarak yeni bir File objesi yaratıyoruz
				if (file.isFile()) {	// yeni File objesinin özelliklerini sorguluyoruz. Eğer varlık dosya tipinde ise dosyanın özelliklerini gösteriyor
					System.out.println("Dosya adı            : " + file.getName());	
					System.out.println("Dosya yolu ve adı    : " + file.getAbsolutePath()); 
					System.out.println("Dosya erişilebilir mi? " + (file.canExecute() ? "Erişilebilir" : "Erişilemez"));
					System.out.println("Dosya gizli mi?      ? " + (file.isHidden() ? "Gizli" : "Gizli değil"));
					System.out.println("Dosya okunur mu?     ? " + (file.canRead() ? "Okunabilir" : "Okunamaz"));
					System.out.println("Dosya yazılır mı?    ? " + (file.canWrite() ? "Yazılabilir" : "Yazılamaz"));
					long lastModified = file.lastModified();
					LocalDateTime lastModifiedTime = Instant.ofEpochMilli(lastModified).atZone(ZoneId.systemDefault()).toLocalDateTime();
					System.out.println("Son değiştirilme     : " + lastModifiedTime);
					System.out.println("\n=================================");
				}
			}
			
			File newFile = new File("C:\\Users\\babur.somer\\OneDrive - BilgeAdam\\Boost\\26 - File Examples\\My Third File.txt");
			if (newFile.exists()) {
				System.err.println("Dosya zaten var");
			}
			else {
				boolean success = false;
				try {
					success = newFile.createNewFile();
				}
				catch (IOException ex) {
					ex.printStackTrace();
				}
				if (success) {
					System.out.println("Dosya Yaratıldı");
				}
				else {
					System.out.println("Dosya yaratılamadı");
				}
			}
		}
	}

}
