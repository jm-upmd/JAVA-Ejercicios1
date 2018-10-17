package ejercicios;

import java.util.Scanner;

import leer.Leer;

public class Actividad_EXP3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce un número: ");
		int numero = sc.nextInt();
		String salida = numero == 0 ?  "cero" : numero > 0 ? "positivo" : "negativo";
		System.out.println("El número " + numero + " es " + salida);

	}
}
