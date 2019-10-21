package ejercicios.piramide;

import java.util.Arrays;
import java.util.Scanner;

public class PiramideV2 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.print("Introduce el número de filas: ");
		
		int filas = in.nextInt();
		int numEspacios = filas;
		int numAsteriscos = 1;

		for(int i = 1; i <= filas; i++){
			
			System.out.println(strCaracter(numEspacios,' ') + strCaracter(numAsteriscos,'*'));
			numEspacios--;
			numAsteriscos+=2;
			
		}  
	}
	
	static String strCaracter(int n, char c) {
		char[] arrayChar = new char[n];
		for(int i = 0; i < arrayChar.length; i++)
			arrayChar[i]=c;
		return String.valueOf(arrayChar);
	}
	
	// Lo mismo que método anterior pero usando Arrays.fill()
	static String strCaracter2(int n, char c) {
		char[] arr = new char[n]; 
		Arrays.fill(arr, c);
		return String.valueOf(arr);	
	}
	

}
