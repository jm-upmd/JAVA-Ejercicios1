package ejercicios;

import leer.Leer;

public class Actividad_ARR1 {
	public static void main(String[] args) {
		
		int[] listaNumeros; // Definimos el array
		listaNumeros = new int[5]; // Lo creamos con espacio para 5 enteros
		
		// Guardamos los datos introducidos por consola en el array
		listaNumeros[0] = Leer.datoInt();
		listaNumeros[1] = Leer.datoInt();
		listaNumeros[2] = Leer.datoInt();
		listaNumeros[3] = Leer.datoInt();
		listaNumeros[4] = Leer.datoInt();
		
		// Escribe númros en orden de introducción
        int contador = listaNumeros.length -1; // Numero de elementos del array menos 1
		for(int i=0; i<=contador; i++) {
			System.out.print(listaNumeros[i]);
			if(i < contador)  // Si no es el último numero le escribe una coma a la derecha
				System.out.print(",");
			else 
				System.out.println(""); // Si es el último escribe un salto de línea
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
