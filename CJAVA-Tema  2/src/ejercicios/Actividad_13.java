package ejercicios;

import leer.Leer;

public class Actividad_13 {
	 public static void main(String[] args) { 
		 int a, b, c;
		 a = Leer.datoInt();
		 b = Leer.datoInt();
		 c = Leer.datoInt();
		 if(a<=b && b<=c)
			 System.out.println("Los números se han introducido en orden ascendente");
		 else
			 System.out.println("Los números no se han introducido en orden ascendente");

	 }
	
}
