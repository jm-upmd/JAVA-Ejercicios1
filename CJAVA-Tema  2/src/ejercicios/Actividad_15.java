package ejercicios;

import leer.Leer;

public class Actividad_15 {

	public static void main(String[] args) {
		int nota1,nota2,nota3,nota4;
		nota1 = Leer.datoInt();
		nota2 = Leer.datoInt();
		nota3 = Leer.datoInt();
		nota4= Leer.datoInt();
		
		int notaMedia = (nota1+nota2+nota3+nota4)/4;
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
