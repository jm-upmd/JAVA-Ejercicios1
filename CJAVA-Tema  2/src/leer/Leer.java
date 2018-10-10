package leer;

import java.util.Scanner;

public class Leer {
	
	static Scanner scaner = new Scanner(System.in);
	
	public static String dato() {
		
		return scaner.nextLine();

	}

	public static int datoInt() {
		return scaner.nextInt();
	}

	public static float datoFloat() {
		return scaner.nextFloat();
	}

	// Leer un char por teclado

	public static char datoChar() {
		return scaner.next().charAt(0);
		
	}

	public static long datoLong() {
		return scaner.nextLong();
		
	}
}
