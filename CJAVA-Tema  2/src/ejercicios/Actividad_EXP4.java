package ejercicios;

public class Actividad_EXP4 {

	public static void main(String[] args) {
		// Definición y asignación de variables con valores de los coeficientes.
		double a = 1;
		double b = 0;
		double c = -1;
		double x1, x2;
		
		// Calculo y asignación de las soluciones
		x1 = (-b + Math.sqrt(b * b - 4 * a * c)) / (2 * a);
		x2 = (-b - Math.sqrt(b * b - 4 * a * c)) / (2 * a);
		
		// Escritura por pantalla de las soluciones.
		System.out.print("Soluciones de la ecuacion de segundo grado: ");
		System.out.println(a + "x2 + " + b + "x + " + c);
		System.out.println("La primera solucion es x1 = " + x1);
		System.out.println("La segunda solucion es x2 = " + x2);
	}

}
