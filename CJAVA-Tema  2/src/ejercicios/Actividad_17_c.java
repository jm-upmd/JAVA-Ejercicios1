/* Pide un entero por teclado y calcula todos los primos
 * menores o igual que el introducido
 */

package ejercicios;

import java.util.Scanner;


public class Actividad_17_c {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Introduce un número entero:");
		int numero = scanner.nextInt();
		int j ;
		boolean esPrimo ;
		
		System.out.println("Numeros primos menores o igual que " + numero);
		for (int i = 1; i <= numero; i++) {
			j= 2;
			esPrimo = true;
			while (esPrimo && j < i) {
				if(i % j == 0 ) {
					esPrimo = false;
				}
				j++;
			}
			
			if (esPrimo)
				System.out.println(i);

		}
		
	}
}
