/* Esta versión controla que se introduzca por teclado un dato
 * que no sea un número entero. 
 * Si se da el caso se informa de ello y se vuelve a pedir 
 * nuevamente el dato.
 * Dicho control se realiza capturando la excepción producida
 */

package ejercicios;

import java.util.Scanner;

public class Actividad_18_Bucles_v2 {

	public static void main(String[] args) {
		int numero = Integer.MAX_VALUE;

		Scanner lector = new Scanner(System.in);

		System.out.println("Introduce un numero entero y pulsa return");
		System.out.println("Para terminar introduce un número negativo y pulsa return");

		try {

			numero = lector.nextInt();

		} catch (Exception e) { // Si al leer numero se produce un error ejecuta este bloque de codigo
			
			System.out.println("Me has dado algo que no no es un entero");
			System.out.println("Esta es la excepción: " + e.toString());
			
			// Lee (saca del buffer de Scanner) el dato que no ha podido leer,
			// esto es, el que ha producido el error por no ser un entero.
			lector.next();
		}

		while (numero >= 0) {
			System.out.println("Numero introducido positivo: " + numero);
			System.out.println("Introduce otro número: ");
			try {

				numero = lector.nextInt();

			} catch (Exception e) {
				System.out.println("El dato introducido no es un número entero");
				lector.next();
			}

		}

		System.out.println("Has introducido un numero negativo. Programa finalizado.");
		lector.close();

	}

}
