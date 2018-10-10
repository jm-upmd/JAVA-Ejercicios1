/* Pide entero por teclado e indica si es primo o no*/
package ejercicios;

import leer.Leer;

public class Actividad_17_b {
	public static void main(String[] args) {
		System.out.println("Introduce un número entero:");
		int numero = Leer.datoInt();
		
		int i = 2;
		boolean primo = true;

		while (primo && i < numero) {
			if (numero % i == 0) {
				primo = false;
			}
			i++;
		}
		
		if (primo) {
			System.out.println(numero + " es primo");
		} else {
			System.out.println(numero + " no es primo");
		}
		
	}
}
