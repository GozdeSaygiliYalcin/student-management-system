package com.bilgeadam.lesson018;

import java.util.Scanner;

public class VacuumRobot {
	private static final double CRITICAL_CHARGE_LEVEL = 20.0;
	private static final double DUST_BAG_FULL_LEVEL   = 100.0;

	private String  brand;
	private String  name;
	private double  chargeLevel;
	private double  dustBagFillRate;
	private boolean initialized;
	private House   house;
	private boolean vacuumOn;

	public VacuumRobot(String brand, String name) {
		this.brand           = brand;
		this.name            = name;
		this.chargeLevel     = 100;
		this.dustBagFillRate = 0;
		this.initialized     = false;
		this.vacuumOn        = false;
	}

	public void start() {
		this.turnOn();
		if (!this.initialized) {
			this.init();
			this.scanEnvironment();
			this.createRoutePlan();
		}
		this.startCleaning();
		this.turnOff();
	}

	private void startCleaning() {
		while (true) {
			this.evaluateLocation();
			this.planRoute();
			this.turnOnVacuum();
			this.trackRoute();
			this.recharge();
			this.emptyBag();
		}
	}

	private void emptyBag() {
		this.dustBagFillRate = 0.0;
	}

	private void recharge() {
		this.chargeLevel = 100.0;
	}

	private void trackRoute() {
		double trackedArea = 0.0;
		while (true) {
			if (this.isRouteDone(trackedArea)) {  // iş bitti mi sorgusu
				break;
			}
			if (this.isChargeLevelCritical()) {  // şarj durum sorgusu
				break;
			}
			if (this.isDustBagFull()) {
				this.showAlert();
				break;
			}
			trackedArea += 10;
			this.chargeLevel -= 2.5;
			this.dustBagFillRate += 0.8;
			try {
				Thread.sleep(1000); // programı 1000 milisaniye (=1 saniye) durduruyor
			}
			catch (InterruptedException ex) {
				// do nothing
			}
			System.out.println("Evin %" + (trackedArea / (this.house.getArea() * this.house.getNumberOfRooms()))*100 + 
					"'si temizlendi. Şarj durumu: " + this.chargeLevel + " Torba doluluk: " + this.dustBagFillRate);
		}
		this.turnOffVacuum();
		this.returnToChargingStation();
		this.turnOff();
	}

	private void showAlert() {
		System.err.println("Bir şey ters gitti");
	}

	private void returnToChargingStation() {
		System.err.println("Şarj istasyonuna geri döndüm");
	}

	private void turnOffVacuum() {
		System.err.println("Vakumu kapattım");
	}

	private boolean isRouteDone(double trackedArea) {
		double totalArea = this.house.getArea() * this.house.getNumberOfRooms();
		return trackedArea >= totalArea;   // dolaşmış olduğu alan toplam alandan büyük veya eşit ise iş bitmiş demektir
	}

	private void turnOnVacuum() {
		this.vacuumOn = true;
		System.out.println("Vakumu açtım");
	}

	private void planRoute() {
		System.out.println(this.house.getNumberOfRooms() + " odalı ve her odası " + this.house.getArea()
				+ " m2 büyüklüklüğündeki evi temizliyorum");
	}

	private void evaluateLocation() {
		System.out.println("Konum belirlendi");
	}

	private void createRoutePlan() {
		System.out.println("Ev planı oluşturuldu");
	}

	private void scanEnvironment() {
		System.out.println("Çevreyi taradı");
	}

	private void turnOff() {
		System.out.println("Robot kapandı");
	}

	private void turnOn() {
		System.out.println("Robot açıldı");
	}

	private void init() {
		Scanner in = new Scanner(System.in);
		System.out.print("Oda adedi:   :");
		int numOfRooms = in.nextInt();
		System.out.print("Oda genişliği: ");
		int width = in.nextInt();
		System.out.print("Oda uzunluğu : ");
		int length = in.nextInt();
		in.close();
		this.house       = new House(numOfRooms, length, width);
		this.initialized = true;
	}

	public boolean isDustBagFull() {
		return this.dustBagFillRate == VacuumRobot.DUST_BAG_FULL_LEVEL;
	}

	public boolean isChargeLevelCritical() {
		return this.chargeLevel < VacuumRobot.CRITICAL_CHARGE_LEVEL;
	}

	public double getChargeLevel() {
		return this.chargeLevel;
	}

	public void setChargeLevel(double chargeLevel) {
		this.chargeLevel = chargeLevel;
	}

	public double getDustBagFillRate() {
		return this.dustBagFillRate;
	}

	public void setDustBagFillRate(double dustBagFillRate) {
		this.dustBagFillRate = dustBagFillRate;
	}

	public String getBrand() {
		return this.brand;
	}

	public String getName() {
		return this.name;
	}

	@Override
	public String toString() {
		return "VacuumRobot [brand=" + this.brand + ", name=" + this.name + ", chargeLevel=" + this.chargeLevel
				+ ", dustBagFillRate=" + this.dustBagFillRate + "]";
	}
}
