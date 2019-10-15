/* Pide entero por teclado e indica si es primo o no*/
package ejercicios;

import java.util.Scanner;


public class Actividad_17_b {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Introduce un número entero:");
		int numero = scanner.nextInt();
		
		int i = 2;
		boolean primo = true;

		while (primo && i < numero) {
			if (numero % i == 0) {
				System.out.println(i);
				primo = false;
			}
			i++;
		}
		
		if (primo ) {
			System.out.println(numero + " es primo");
		} else {
			System.out.println(numero + " no es primo");
		}
	
		
		// Otra forma de hacerlo usando break y sin variable booleana
		
		int j=2;
		while (j < numero) {
			if (numero % j == 0) break;
			j++;
		}
		
		// Si i == numero es que ha recorrido todos lo numeros hasta llegar a numero
		// sin que ninguno de ellos haya sido divisor de numero, en cuyo caso es primo.
		
		if(j == numero){
			System.out.println(numero + " es primo");
		} else {
			System.out.println(numero + " no es primo");
		}
		
		
		// Otra forma de hacerlo  menos legible... Evitar este tipo de codificación!!!!
		int k =2;
		while ( k < numero && (numero % k++ != 0)); 
		System.out.println("El número " + (k == numero ? "ES":"NO ES" ) + " primo");
		
		
			
	}
}
