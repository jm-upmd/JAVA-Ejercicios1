package ejercicios.metodos;

import java.util.Scanner;

public class CalculaArea {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		int opcion;
		boolean finalizar = false;

		while (!finalizar) {
			System.out.println("\n\nMenus de opciones");
			System.out.println("------------------------");
			System.out.println("1. Calcular el área de un cuadrado");
			System.out.println("2. Calcular el area de un Triangulo");
			System.out.println("3. Calcular el area de un Circulo");
			System.out.println("4. finalizar");
			System.out.print("Elije la opcion:");
			opcion = entrada.nextInt();
			switch (opcion) {
			case 1:
				System.out.println("Has seleccionado calcular el area de un cuadrado...");
				double lado;
				double areaCuadrado;
				System.out.println("Cual es la base del cuadrado");
				if(!numeroOK(entrada)) break;
				lado = entrada.nextDouble();
				areaCuadrado = areaCuadrado(lado);
				System.out.printf("El area del cuadrado es %,.2f\n", areaCuadrado);
				break;
			case 2:
				System.out.println("Ha seleccionado calcular el area de un triangulo...");
				double lado1;
				double lado2;

				double areaTriangulo;

				System.out.print("Dame el lado1");
				if(!numeroOK(entrada)) break;

				lado1 = entrada.nextDouble();
				System.out.print("Dame el lado2");
				if(!numeroOK(entrada)) break;

				lado2 = entrada.nextDouble();

				areaTriangulo = areaTriangulo(lado1, lado2);

				System.out.printf("El area del triangulo es %,.2f\n", areaTriangulo);
				break;
			case 3:
				System.out.println("Has seleccionado calcular el area de un circulo...");

				double radioCirculo;
				double areaCirculo;

				System.out.print("Cual es el radio del circulo?");
				
				if(!numeroOK(entrada)) break;

				radioCirculo = entrada.nextDouble();

				areaCirculo = areaCirculo(radioCirculo);

				System.out.printf("El area del circulo es %,.2f\n", areaCirculo);
				break;
			case 4: 
				finalizar = true;
				break;
			default:
				System.out.println("Opción incorrecta");
			}
		} // while
		System.out.println("Programa finalizado.");
	}

	static boolean numeroOK(Scanner entrada) {
		if(!entrada.hasNextDouble()) {
			System.out.println("Numero incorrecto.");
			entrada.next();
			return false;
		}
		return true;
	}

	public static double areaCirculo(double radio) {
		return Math.pow(radio, 2) * Math.PI;
	}

	public static double areaTriangulo(double base, double altura) {
		return base * altura / 2;
	}

	public static double areaCuadrado(double lado) {
		return lado * lado;
	}
}

