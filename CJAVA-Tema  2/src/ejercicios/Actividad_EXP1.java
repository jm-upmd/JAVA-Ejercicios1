package ejercicios;

import java.util.Scanner;

public class Actividad_EXP1 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int numero1, numero2;
		System.out.print("Introduce el primer número: ");
		numero1 = teclado.nextInt();
		System.out.print("\nIntroduce el segundo número: ");
		numero2 = teclado.nextInt();
		
		int multiplicacion = numero1 * numero2;
		int cociente = numero1 / numero2;
		int resto = numero1 % numero2;
		
		System.out.println("Multiplicación: " + multiplicacion);
		System.out.println("Cociente: " + cociente);
		System.out.println("Resto: " + resto);
		teclado.close();

	}

}
