package ejercicios;

public class OpCombinados {
	 public static void main(String[] args) { 
	      int i,j;   // Variables enteras. Podrian ser reales 
	      i = 7; 
	      j = 3; 
	      System.out.println("* Operandos enteros:   i = "+ i +" ;  j = "+ j); 
	      i += j; 
	      System.out.println("  Suma combinada:      i += j " + "   // i vale " + i); 
	      i = 7; 
	      i -= j; 
	      System.out.println("  Resta combinada:     i -= j " + "   // i vale " + i); 
	      i = 7; 
	      i *= j; 
	      System.out.println("  Producto combinado:  i *= j " + "   // i vale " + i); 
	      i = 7; 
	      i /= j; 
	      System.out.println("  Division combinada:  i /= j " + "   // i vale " + i); 
	      i = 7;  
	      i %= j; 
	      System.out.println("  Resto combinada:     i %= j " + "   // i vale " + i); 
	   } 
}
