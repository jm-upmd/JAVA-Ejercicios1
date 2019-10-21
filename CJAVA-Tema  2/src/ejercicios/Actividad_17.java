package ejercicios;

public class Actividad_17 {

	public static void main(String[] args) {
		
		for(int i=0; i<=200; i+=2)
			System.out.println(i);
		
		
		// Otra forma de hacerlo (menos eficiente)
				
		  for(int i = 0; i <= 100; i++) { 
		    if(i % 2 == 0) 
		  	 System.out.println(i); 
		  }
		 
	}
}
