package ejercicios.metodos;


// Llenar un array con 100 enteros comprendidos entre 40 y 80, generados de forma aleatoria 
// Mostrar los impares elevado a 3

public class ClaseRandom {
	
	
	public static void main(String[] args) {
		int[] listaEnteros = new int[100];

		for(int i = 0; i < listaEnteros.length; i++) {
			listaEnteros[i]= aleatorio(10, 50);
			
		}
		
		for(int i: listaEnteros) {
			if(i % 2 != 0) {
				System.out.printf("%d\t%d\n", i, (int)Math.pow(i, 3));
			}
			
		}
	}
	
	static int aleatorio(int rangoDesde, int rangoHasta) {
		// Math.random() devuelve un número double entre 0 y 0.1 (0.1 no incluido)
		int numeroAleatorio;
		numeroAleatorio = (int) (Math.random() * (rangoHasta - rangoDesde + 1)) + rangoDesde;
		return numeroAleatorio;
		
	}

}
