/* Esta versión utiliza el método hasNextInt() para verificar
 * antes de leer el dato introducido por teclado, si es un entero
 * lo lee y en caso contrario lo saca del buffer de Scaner 
 * y vuelve a pedir otro numero.
 */

package ejercicios;

import java.util.Scanner;

public class Actividad_18_Bucles_v1 {

	public static void main(String[] args) {
		
		int numero = Integer.MAX_VALUE; // Inicializamos a valor positivo por ej. MAX_VALUE

		Scanner lector = new Scanner(System.in);

		System.out.println("Introduce un numero entero y pulsa return");
		System.out.println("Para terminar introduce un número negativo y pulsa return");
			
		// Bucle para leer numeros mientras no se de uno negativo.
		
		while (numero >= 0) {
				System.out.println("Introduce el número: ");

				if(lector.hasNextInt()) {
					numero = lector.nextInt();
					System.out.println("Numero introducido positivo: " + numero);
					
				} else {
					System.out.println("El dato no es un número entero");
					lector.next();  // Saca datos del buffer
				}
		}

		System.out.println("Has introducido un numero negativo. Programa finalizado.");

	}

}
