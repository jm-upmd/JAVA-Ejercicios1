package ejercicios.piramide;

import java.util.Scanner;

public class PiramideBis {

	public static void main(String[] args) {
Scanner sss = new Scanner(System.in);
		
		System.out.print("Introduce el número de filas: ");

		int filas = sss.nextInt();
		int numEspacioss = filas-1; 
		int numAsteriscos = 1;
		
		for(int i = 1; i <= filas; i++) {        // Para cada piso de la pirámide
			numEspacioss = filas -i;
			numAsteriscos = i*2 -1;
			for(int j=1; j<= numEspacioss; j++) // Pinta espacios
				System.out.print(" ");
			
			for(int j=1; j<=numAsteriscos; j++)  // Pinta asteriscos
				System.out.print("*");
			
			System.out.println();
			
		}
		sss.close();

	}

}
