package ejercicios;

import java.util.Scanner;


public class Actividad_EXP2 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		float gCelsius, gFathrenheit;
		
		System.out.print("Introduce los grados Celsius: ");
		gCelsius = teclado.nextFloat();
		System.out.println("Celsius: " + gCelsius);
		// Ojo,  tengo que indicar que 5 ó 7 es float porque si no hace la 
		// división entera y devuelve 1 en vez de 1.8
		// incorrecto: gFathrenheit = (9/5f) * gCelsius + 32;
		
		gFathrenheit = (9f/5) * gCelsius + 32;
		
		System.out.print("\nGrados Fathrenheit: " + gFathrenheit);

	}

}
