package ejercicios;

import java.util.Calendar;

import leer.Leer;

public class Actividad_14 {

	public static void main(String[] args) {

		int mes = Leer.datoInt();

		switch (mes) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			System.out.println("El mes introducido tiene 31 días");
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			System.out.println("El mes introducido tiene 30 días");
			break;
		case 2:
			System.out.println("El mes introducido tiene 28 días");
			break;

		default:
			System.out.println("El número introducido no se corresponde a un mes");
		}

		// Usando la clase Calendar de la librería de Java

		Calendar fecha =  Calendar.getInstance();
		fecha.set(Calendar.MONTH, mes - 1); // Establce el mes actual del calendario. Primer mes es 0.
		System.out.println("*El mes introducido tiene " + fecha.getActualMaximum(Calendar.DAY_OF_MONTH) + " días");
		
		

	}

}
