package com.bilgeadam.lesson017;

public class VehicleTest {

	public static void main(String[] args) {
		Vehicle v1 = new Vehicle("Fiat", "blue", "Kartegena");
		Vehicle v2 = new Vehicle("BMW", "red", "Şimşek");
		v1.engine = "Diesel";  // bunun yapılmaması gerekli. Nesne yönelimli programlamada niteliklere doğrudan erişimden kaçınılmalıdır. sadece getters/setters
		Vehicle v3 = v2;
		Vehicle v4 = new Vehicle("Fiat", "blue", "Kartegena");

		v1.setSpeed(100);
		
		System.out.println("Vehicle1: Brand: " + v1.getBrand() + " Speed: " + v1.getSpeed() + " Color: " + v1.getColor() + " Name: " + v1.getName() + " Name: " + v1.engine);
		System.out.println("Vehicle2: Brand: " + v2.getBrand() + " Speed: " + v2.getSpeed() + " Color: " + v2.getColor() + " Name: " + v2.getName());
		System.out.println("Vehicle3: Brand: " + v3.getBrand() + " Speed: " + v3.getSpeed() + " Color: " + v3.getColor() + " Name: " + v3.getName());
		System.out.println();
		v2.setName("V2");
		System.out.println("Vehicle1: Brand: " + v1.getBrand() + " Speed: " + v1.getSpeed() + " Color: " + v1.getColor() + " Name: " + v1.getName());
		System.out.println("Vehicle2: Brand: " + v2.getBrand() + " Speed: " + v2.getSpeed() + " Color: " + v2.getColor() + " Name: " + v2.getName());
		System.out.println("Vehicle3: Brand: " + v3.getBrand() + " Speed: " + v3.getSpeed() + " Color: " + v3.getColor() + " Name: " + v3.getName());
		System.out.println();
		v3.setName("V3");
		v3.setSpeed(300);		
		System.out.println("Vehicle1: Brand: " + v1.getBrand() + " Speed: " + v1.getSpeed() + " Color: " + v1.getColor() + " Name: " + v1.getName());
		System.out.println("Vehicle2: Brand: " + v2.getBrand() + " Speed: " + v2.getSpeed() + " Color: " + v2.getColor() + " Name: " + v2.getName());
		System.out.println("Vehicle3: Brand: " + v3.getBrand() + " Speed: " + v3.getSpeed() + " Color: " + v3.getColor() + " Name: " + v3.getName());
		System.out.println();
		if (v1 == v4) {
			System.out.println("v1, v4'le eşittir");
		}
		else {
			System.out.println("v1, v4'le eşit değildir");
		}
		
		if (v1.equals(v4)) {
			System.out.println("v1 ile v4'ün içerikleri aynıdır");
		}
		else {
			System.out.println("v1 ile v4'ün içerikleri aynı değildir");
		}
		if (v2 == v3) {
			System.out.println("v2, v3'le eşittir");
		}
		else {
			System.out.println("v2, v3'le eşit değildir");
		}
		
		System.out.println();
		Airplane a1 = new Airplane("Boing", "grey");
		System.out.println("Airplane1: Brand: " + a1.getBrand() + " Speed: " + a1.getSpeed() + " Color: " + a1.getColor() + " Span: " + a1.getSpanLength());

		v1.tellAboutYourself();
		a1.tellAboutYourself();
		
	}
}
