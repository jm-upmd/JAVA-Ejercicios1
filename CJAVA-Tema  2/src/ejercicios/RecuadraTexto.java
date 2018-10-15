package ejercicios;

import java.util.Scanner;

public class RecuadraTexto {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Escribe un texto:");
		String texto = scanner.nextLine();
		
		// Si texto es: hola caracloa
		// La salida será: 
		/* 
		    *******************
		 	*  hola caracola  *
		 	*******************
		 */
		
		for (int i=1; i<=texto.length()+6; i++) {
			System.out.print('*');
		}
		System.out.println();
		
		System.out.print("*  " + texto.toUpperCase()+ "  *");
		
		System.out.println();

		for (int i=1; i<=texto.length()+6; i++) {
			System.out.print('*');
			
		}
	
	}

}
