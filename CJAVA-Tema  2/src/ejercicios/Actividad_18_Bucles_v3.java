package ejercicios;

import java.util.Scanner;

public class Actividad_18_Bucles_v3 {

	public static void main(String[] args) {
		int numero = Integer.MAX_VALUE;

		Scanner lector = new Scanner(System.in);

		System.out.println("Introduce un numero entero y pulsa return");
		System.out.println("Para terminar introduce un número negativo y pulsa return");

		numero = lector.nextInt();

		while (numero >= 0) {
			System.out.println("Numero introducido positivo: " + numero);
			System.out.println("Introduce otro número: ");

			numero = lector.nextInt();

		}

		System.out.println("Has introducido un numero negativo. Programa finalizado.");

	}

}
