package com.bilgeadam.lesson023;

import java.util.HashMap;

public class Chess {

	public static void main(String[] args) {
		HashMap<String, String> board = new HashMap<>();
		for (char col='a'; col<='h'; col++) {
			for (int lin=8; lin>=1; lin--) {
				board.put(""+col+lin, "");
			}
		}

	}

}
