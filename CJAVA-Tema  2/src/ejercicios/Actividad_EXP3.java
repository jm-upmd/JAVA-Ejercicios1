package ejercicios;

import leer.Leer;

public class Actividad_EXP3 {

	public static void main(String[] args) {
		System.out.println("Introduce un número: ");
		int numero = Leer.datoInt();
		String salida = numero == 0 ?  "cero" : numero > 0 ? "positivo" : "negativo";
		System.out.println("El número " + numero + " es " + salida);

	}
}
