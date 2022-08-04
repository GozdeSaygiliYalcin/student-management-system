package com.bilgeadam.lesson011;

public class Point {
	double x;
	double y;
	
	@Override
	public boolean equals(Object obj) {
		Point other = (Point)obj;
		return (this.x == other.x && this.y == other.y);
	}
	
	@Override
	public String toString() {
		return "X: " + x + " Y: " + y;
	}
	
	
}
