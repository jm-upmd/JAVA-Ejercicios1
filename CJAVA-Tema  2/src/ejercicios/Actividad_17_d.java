/* Recoge un número por teclado y calcula los primos menores o igual a el*/

package ejercicios;

import java.util.Scanner;


public class Actividad_17_d {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Introduce un número entero:");
		int numero = scanner.nextInt();
		
		System.out.println("Numero de primos menores o igual que " + numero);
		
		
		// Calcula todos los primos menores o igual que numero
		for (int i = 1; i <= numero; i++) {
			if(esPrimoB(i))   // Llamada el metodo 
				System.out.println(i);
		}

	}

	// Opción A. Con un solo return y uso de variable boolean 

	private static boolean esPrimoA(int numero) {

		int i = 2;
		boolean primo = true;

		while (primo && i < numero) {
			if (numero % i == 0) {
				primo = false;
			}
			i++;
		}
		return primo;

	}

	// Opción B. Con dos returns. Sin uso de varibale adicional primo
	
	private static boolean esPrimoB(int numero) {
		int i = 2;

		while (i < numero) {
			if (numero % i == 0) {
				return false;
			}
			i++;
		}
		return true;
	}

}
