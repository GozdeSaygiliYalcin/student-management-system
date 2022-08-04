package com.bilgeadam.lesson011;

public class PointTest {

	public static void main(String[] args) {
		Point p = new Point();
		p.x = 10.3d;
		p.y = 26.8d;

		Point q;
		q = p;
		
		System.out.println("P'nin x değeri :" + p.x + "\tP'nin y değeri :" + p.y);
		System.out.println("Q'nin x değeri :" + q.x + "\tQ'nin y değeri :" + q.y);
		
		System.out.println("-----------------");
		p.x = 15.9;
		System.out.println("P'nin x değeri :" + p.x + "\tP'nin y değeri :" + p.y);
		System.out.println("Q'nin x değeri :" + q.x + "\tQ'nin y değeri :" + q.y);
		
		System.out.println("-----------------");
		q.x = 100;
		System.out.println("P'nin x değeri :" + p.x + "\tP'nin y değeri :" + p.y);
		System.out.println("Q'nin x değeri :" + q.x + "\tQ'nin y değeri :" + q.y);

		if (p == q) {
			System.err.println("P ve Q özdeştir (identical) [adresler aynı]");
		}
		else {
			System.err.println("P ve Q özdeş değildir");
		}
		if (p.equals(q)) {
			System.err.println("P ve Q aynıdır (equal) [içerikleri aynı]");
		}
		else {
			System.err.println("P ve Q aynı değildir");
		}

		System.out.println("-----------------");
		Point r = new Point();
		r.x = 100;
		r.y = 26.8d;

		System.out.println("P'nin x değeri :" + p.x + "\tP'nin y değeri :" + p.y);
		System.out.println("R'nin x değeri :" + r.x + "\tR'nin y değeri :" + r.y);
		if (p == r) {
			System.err.println("P ve R özdeştir");
		}
		else {
			System.err.println("P ve R özdeş değildir");
		}
		if (p.equals(r)) {
			System.err.println("P ve R aynıdır");
		}
		else {
			System.err.println("P ve R aynı değildir");
		}
	}

}
