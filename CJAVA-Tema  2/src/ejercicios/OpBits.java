package ejercicios;

public class OpBits {
	public static void main(String[] args) {
		int i, j;
		i = 12;  
		j = 10;
		System.out.println("* Operandos enteros:        i = " + i + " ;  j = " + j);
		System.out.println("  Negacion o complemento:      ~i es " + (~i));
		System.out.println("  Suma logica (binaria):       i & j es " + (i & j));
		System.out.println("  Suma exclusiva (binaria):    i ^ j es " + (i ^ j));
		System.out.println("  Producto logico (binaria):   i | j es " + (i | j));
		i = 12;
		j = -10;
		System.out.println("* Operandos enteros:        i = " + i + " ;  j = " + j);
		System.out.println("  Negacion o complemento:      ~i es " + (~i));  
		System.out.println("  Suma logica (binaria):       i & j es " + (i & j));
		System.out.println("  Suma exclusiva (binaria):    i ^ j es " + (i ^ j));
		System.out.println("  Producto logico (binaria):   i | j es " + (i | j));
		i = 7;
		j = 2;
		System.out.println("* Operandos enteros:        i = " + i + " ;  j = " + j);
		System.out.println("  Despl. a izquierdas:         i << j es " + (i << j));
		System.out.println("  Despl. a derechas:           i >> j es " + (i >> j));
		System.out.println("  Despl. a derechas sin signo: i >>> j  es " + (i >>> j));

		i = -7;
		j = 2;
		System.out.println("* Operandos enteros:        i = " + i + " ;  j = " + j);
		System.out.println("  Desplazamiento a izquierdas: i << j es " + (i << j));
		System.out.println("  Despl. a derechas:           i >> j es " + (i >> j));
		System.out.println("  Despl. a derechas sin signo: i >>> j  es " + (i >>> j));
	} 
}
