package ejercicios;

import java.util.Calendar;
import java.util.Scanner;

import leer.Leer;

public class Actividad_14 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Dame el número del mes: ");
		int mes = sc.nextInt();
		
		
		if(mes == 1 || mes == 3 || mes == 5 || mes== 7 || mes == 8 || mes == 10 || mes == 12 ) {
			System.out.println("El mes introducido tiene 31 días");
		} else if (mes == 4 || mes == 6 || mes == 9 || mes== 11) {
			System.out.println("El mes introducido tiene 30 días");
		} else if ( mes == 2) {
			System.out.println("El mes introducido tiene 28 días");
		} else {
			System.out.println("El número introducido no se corresponde a un mes");
		}
			
		
		/*switch (mes) {
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
*/
		// Otra forma de hacer lo mismo usando la clase Calendar de la librería de Java

		/*Calendar fecha =  Calendar.getInstance(); // Nos creamos un objeto Calendar
		fecha.set(Calendar.MONTH, mes - 1); // Establce el mes actual del calendario. Primer mes es 0.
		System.out.println("*El mes introducido tiene " + fecha.getActualMaximum(Calendar.DAY_OF_MONTH) + " días");*/
		
		

	}

}
