package com.bilgeadam.lesson028;

import java.time.LocalDate;

public abstract class Furniture {
	private String    name;
	private Material  material;
	private Color     color;
	private LocalDate productionDate;
	private double    price;

	public Furniture(String name, Material material, Color color, LocalDate productionDate, double price) {
		super();
		this.name           = name;
		this.material       = material;
		this.color          = color;
		this.productionDate = productionDate;
		this.price          = price;
	}
	
	public String getMaintainanceInfo () {
		if (this.material == Material.PLASTIC) {
			return "Plastik malzeme bakıma ihtiyaç duymaz";
		}
		else {
			int productionDay = this.productionDate.getDayOfMonth();  // üretim tarihinin ayın hangi günü olduğunu buluyorum 25.05.2022 ==> 25. gün
			LocalDate today = LocalDate.now();						  // bugünün tarihi
			LocalDate maintainanceDate;
			if (today.getDayOfMonth() > productionDay) {			  // eğer ayın 25'nden önce ise bugün bu ayın 25'nde bakım yapılmalı
				maintainanceDate = LocalDate.of(today.getYear(), today.getMonth(), productionDay);
			}
			else {   // diğer durumda bir sonraki ayın 25'inde bakım yapılmalı
				maintainanceDate = LocalDate.of(today.getYear(), today.getMonth().plus(1), productionDay);
			}
			return "Bir sonraki bakım günü " + maintainanceDate.toString() + "dir";
		}
	}

	public double getPrice() {
		return this.price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getName() {
		return this.name;
	}

	public Material getMaterial() {
		return this.material;
	}

	public Color getColor() {
		return this.color;
	}

	public LocalDate getProductionDate() {
		return this.productionDate;
	}

	@Override
	public String toString() {
		return "Furniture [name=" + this.name + ", material=" + this.material + ", color=" + this.color
				+ ", productionDate=" + this.productionDate + ", price=" + this.price + "]";
	}
}
