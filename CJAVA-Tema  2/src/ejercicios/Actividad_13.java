package ejercicios;

import java.util.Scanner;


public class Actividad_13 {
	 public static void main(String[] args) { 
		 Scanner ss = new Scanner(System.in);
		 int a, b, c;
		 
		System.out.println("El dato que has introducido no es un entero");
		 
		 a = ss.nextInt();
		 b = ss.nextInt();
		 c = ss.nextInt();
		
		 if(a<=b && b<=c)
			 System.out.println("Los números se han introducido en orden ascendente");
		 else
			 System.out.println("Los números no se han introducido en orden ascendente");

	 }
	
}

//		if(ss.hasNextInt())  
//			a = ss.nextInt();
