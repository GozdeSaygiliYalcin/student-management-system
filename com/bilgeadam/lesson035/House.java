package com.bilgeadam.lesson035;

public class House {
	private int     area;              // must have
	private int     numOfRooms;        // must have
	private int     numOfFloors;       // must have
	private int     numOfBalconies;    // optional
	private int     areaOfFrontGarden; // optional
	private int     areaOfBackGarden;  // optional
	private int     numOfWinwods;      // must have
	private int     numOfOutdoors;     // optional
	private int     areaOfVeranda;     // optional
	private Address address;           // must have

	public House(HouseBuilder houseBuilder) {
		this.area              = houseBuilder.area;
		this.numOfRooms        = houseBuilder.numOfRooms;
		this.numOfFloors       = houseBuilder.numOfFloors;
		this.numOfBalconies    = houseBuilder.numOfBalconies;
		this.areaOfFrontGarden = houseBuilder.areaOfFrontGarden;
		this.areaOfBackGarden  = houseBuilder.areaOfBackGarden;
		this.numOfWinwods      = houseBuilder.numOfWinwods;
		this.numOfOutdoors     = houseBuilder.numOfOutdoors;
		this.areaOfVeranda     = houseBuilder.areaOfVeranda;
		this.address           = houseBuilder.address;
	}

	@Override
	public String toString() {
		return "House [area=" + this.area + ", numOfRooms=" + this.numOfRooms + ", numOfFloors=" + this.numOfFloors
				+ ", numOfBalconies=" + this.numOfBalconies + ", areaOfFrontGarden=" + this.areaOfFrontGarden
				+ ", areaOfBackGarden=" + this.areaOfBackGarden + ", numOfWinwods=" + this.numOfWinwods
				+ ", numOfOutdoors=" + this.numOfOutdoors + ", areaOfVeranda=" + this.areaOfVeranda + ", address="
				+ this.address + "]";
	}

	public static class HouseBuilder {
		private int     area;              // must have
		private int     numOfRooms;        // must have
		private int     numOfFloors;       // must have
		private int     numOfBalconies;    // optional
		private int     areaOfFrontGarden; // optional
		private int     areaOfBackGarden;  // optional
		private int     numOfWinwods;      // must have
		private int     numOfOutdoors;     // optional
		private int     areaOfVeranda;     // optional
		private Address address;           // must have

		public HouseBuilder(int area, int numOfRooms, int numOfFloors, int numOfWinwods, Address address) {
			super();
			this.area         = area;
			this.numOfRooms   = numOfRooms;
			this.numOfFloors  = numOfFloors;
			this.numOfWinwods = numOfWinwods;
			this.address      = address;
		}

		public HouseBuilder numOfBalconies(int numOfBalconies) {
			this.numOfBalconies = numOfBalconies;
			return this;
		}

		public HouseBuilder areaOfFrontGarden(int areaOfFrontGarden) {
			this.areaOfFrontGarden = areaOfFrontGarden;
			return this;
		}

		public HouseBuilder areaOfBackGarden(int areaOfBackGarden) {
			this.areaOfBackGarden = areaOfBackGarden;
			return this;
		}

		public HouseBuilder numOfOutdoors(int numOfOutdoors) {
			this.numOfOutdoors = numOfOutdoors;
			return this;
		}

		public HouseBuilder areaOfVeranda(int areaOfVeranda) {
			this.areaOfVeranda = areaOfVeranda;
			return this;
		}

		public House build() {
			House house = new House(this);
			return house;
		}
	}
}
