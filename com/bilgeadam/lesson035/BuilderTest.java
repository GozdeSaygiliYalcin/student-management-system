package com.bilgeadam.lesson035;

public class BuilderTest {
	public static void main(String[] args) {
		House house = new House.HouseBuilder(200, 4, 2, 20, new Address("cadde", 4711, 4711, "şehir", "ülke"))
				.areaOfBackGarden(300)
				.areaOfVeranda(20)
				.build();
		System.out.println(house);
		
		House house2 = new House.HouseBuilder(100, 4, 22, 20, new Address("cadde", 4711, 4711, "şehir", "ülke"))
				.areaOfFrontGarden(239)
				.areaOfVeranda(20)
				.numOfBalconies(3)
				.build();
		System.out.println(house2);
	}
}
