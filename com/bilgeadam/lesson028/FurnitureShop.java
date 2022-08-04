package com.bilgeadam.lesson028;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class FurnitureShop {
	List<Furniture> furnitures;
	
	public FurnitureShop() {
		super();
		this.furnitures = new ArrayList<>();  // collection
	}

	public static void main(String[] args) {
		System.out.println("Welcome");
		FurnitureShop shop = new FurnitureShop();
		shop.fillShop();
		shop.listFurnitures();
		System.out.println("bye");
	}

	private void listFurnitures() {
		for (Furniture furniture : furnitures) {
			System.out.println(furniture);
			if (furniture.getName().equalsIgnoreCase("sandalye")) {
				Chair chair = (Chair)furniture;
				System.out.println("Sandalyenin rengi " + chair.getColor().getColor());
			}
			if (furniture instanceof Extenable) {
				System.out.println("Kapalı hal oturma adedi: " + ((Extenable) furniture).getNumOfClosedPlaces());   
				System.out.println("Açık hal oturma adedi: " + ((Extenable) furniture).getNumOfOpenedPlaces());   
			}
			if (furniture.getMaterial() == Material.TIMBER) {
				System.out.println("Bakım ihtiyacı: " + furniture.getMaintainanceInfo());
			}
		}
		
	}

	private void fillShop() {
		FixSizeTable fs1 = new FixSizeTable("Güzel Masa 1", Material.PLASTIC, Color.BLACK, LocalDate.now(), 123.5, 4, 6);
		FixSizeTable fs2 = new FixSizeTable("Güzel Masa 2", Material.TIMBER, Color.WHITE, LocalDate.now(), 553.5, 4, 8);
		VariableSizeTable vs1 = new VariableSizeTable("Açılır Masa 1", Material.TIMBER, Color.GREY, LocalDate.now(), 553.5, 4, 8, 12);
		VariableSizeTable vs2 = new VariableSizeTable("Açılır Masa 2", Material.PLASTIC, Color.GREY, LocalDate.now(), 563.5, 4, 6, 10);
		Wardrope w = new Wardrope("Dolap", Material.TIMBER, Color.BLACK, LocalDate.of(2022, 5, 15), 456);
		FixSizeTable fs3 = new FixSizeTable("hello table", Material.TIMBER, Color.GREY, LocalDate.now(), 1, 2, 3);
		
		this.furnitures.add(fs1);
		this.furnitures.add(fs2);
		this.furnitures.add(vs1);
		this.furnitures.add(vs2);
		this.furnitures.add(w);
		this.furnitures.add(new Chair("Sandalye", Material.PLASTIC, Color.GREY, LocalDate.of(2022, 3, 4), 100));
		this.furnitures.add(fs3);
	}

}
