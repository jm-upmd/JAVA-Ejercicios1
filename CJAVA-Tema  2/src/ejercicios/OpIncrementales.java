package ejercicios;

public class OpIncrementales {
	 public static void main(String[] args) { 
		    int i,j;           //   Variables enteras. Podrian ser reales o char 
		    i = 7; 
		    System.out.println("* Operando entero:  i = " + i + ";"); 
		    System.out.println(" Operador ++:       j = i++; "); 
		    j = i++;                              
		    System.out.println("                    // i vale " + i + "; j vale " + j); 
		    i = 7; 
		    System.out.println("                    i = " + i + ";"); 
		    System.out.println("                    j = ++i; "); 
		    j = ++i;                              
		    System.out.println("                    // i vale " + i + "; j vale " + j); 
		    i = 7; 
		    System.out.println("* Operando entero:  i = " + i + ";"); 
		    System.out.println(" Operador --:       j = i--; "); 
		    j = i--;                              
		    System.out.println("                    // i vale " + i + "; j vale " + j); 
		    i = 7; 
		    System.out.println("                    i = " + i + ";"); 
		    System.out.println("                    j = --i; "); 
		    j = --i;                              
		    System.out.println("                    // i vale " + i + "; j vale " + j); 
		  } 
}
