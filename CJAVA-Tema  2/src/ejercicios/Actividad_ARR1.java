package ejercicios;

import java.util.Scanner;

public class Actividad_ARR1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] listaNumeros; // Definimos el array
		listaNumeros = new int[5]; // Lo creamos con espacio para 5 enteros
		
		// Guardamos los datos introducidos por consola en el array
		System.out.println("Introduce los 5 numeros. Pulsa enter tras escribir cada uno de ellos");
		listaNumeros[0] = sc.nextInt();
		listaNumeros[1] = sc.nextInt();
		listaNumeros[2] = sc.nextInt();
		listaNumeros[3] = sc.nextInt();
		listaNumeros[4] = sc.nextInt();
		
		// Escribe números en orden de introducción
        int contador = listaNumeros.length -1; // Numero de elementos del array menos 1
		for(int i=0; i<=contador; i++) {
			System.out.print(listaNumeros[i]);
			if(i < contador)  // Si no es el último numero le escribe una coma a la derecha
				System.out.print(",");
			else 
				System.out.println(); // Si es el último escribe un salto de línea
		}
		
		// Escribe números en orden inverso
		for(int i=contador; i >= 0; i--) {
			System.out.print(listaNumeros[i]);
			if(i > 0)  // Si no es el primer numero le escribe una coma a la derecha
				System.out.print(",");
			else 
				System.out.println(""); // Si es el primero escribe un salto de línea
		}
	}
	
}
