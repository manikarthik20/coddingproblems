package com.ojas;

public class Pattern7 {
	public static void main(String[] args) {

		isPattern();
	}

	private static void isPattern() {
		for (int rows = 5; rows >= 1; rows--) {
			for (int coloms = 5; coloms >= rows; coloms--) {
				System.out.print(rows + " ");
			}
			System.out.println();

		}

		
	}

}
