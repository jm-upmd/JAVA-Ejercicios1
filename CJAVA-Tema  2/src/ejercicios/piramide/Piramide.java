/*
Ejemplo:
s = número de espacios
a = número de asteríscos.

filas = 5

"     *     "   s = filas; a = 1  // valores iniciales
"    ***    "   s = s - 1; a = a + 2;
"   *****   "   s = s - 2; a = a + 4;  
"  *******  "   En cada iteración: 
" ********* "       s = s-1; a = a + 2; 

*/

package ejercicios.piramide;

import java.io.Closeable;
import java.util.Scanner;

public class Piramide {

	public static void main(String[] args) {
		Scanner sss = new Scanner(System.in);
		
		System.out.print("Introduce el número de filas: ");

		int filas = sss.nextInt();
		int numEspacioss = filas; 
		int numAsteriscos = 1;
		
		for(int i = 1; i < filas; i++) {        // Para cada piso de la pirámide
			
			for(int j=1; j<= numEspacioss; j++) // Pinta espacios
				System.out.print(" ");
			
			for(int j=1; j<=numAsteriscos; j++)  // Pinta asteriscos
				System.out.print("*");
			
			System.out.println();
			numEspacioss--;
			numAsteriscos+=2;
			
		}
		sss.close();
	}

}
