package com.bilgeadam.lesson023;

public class ZooTest {

	public static void main(String[] args) {
		Zoo<Animal> zoo = new Zoo<>();
		zoo.add(new LandAnimal());
		zoo.add(new WaterAnimal());
		zoo.add(new AirAnimal());

		zoo.list();
		
		Aquarium<WaterAnimal> aquarium = new Aquarium<>();
//		aquarium.add(new LandAnimal());  // olmaz çünkü sadece wateranimalları tutabiliyor
	}

}
