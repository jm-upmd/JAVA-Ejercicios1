package ejercicios;

import java.util.Scanner;

import ejercicios.metodos.ClaseRandom;
import leer.Leer;

public class Actividad_15 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int nota1,nota2,nota3,nota4, notaMedia;
		
		System.out.println("Introduce las cuatro notas. Pulsa enter tras escribir cada una de ellas:");
		nota1 = scanner.nextInt();
		nota2 = scanner.nextInt();
		nota3 = scanner.nextInt();
		nota4= scanner.nextInt();
		
		notaMedia = (nota1+nota2+nota3+nota4)/4;
		
		System.out.println("Nota media: " + notaMedia);
		
		if(notaMedia >= 90) {
			System.out.println("SOBRESALIENTE");
		} else if (notaMedia >= 80) {
			System.out.println("NOTABLE");
		} else if ( notaMedia >= 70) {
			System.out.println("BIEN");
		} else if (notaMedia >= 60) {
			System.out.println("SUFICIENTE");
		} else {
			System.out.println("INSUFICIENTE");
		}
		
		
	}

}
