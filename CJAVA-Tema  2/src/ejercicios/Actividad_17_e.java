/* Calcula los numeros de tres cifras tales que la suma de los 
 * cubos de sus cifras es igual al valor del número
 */
package ejercicios;

public class Actividad_17_e {

	public static void main(String[] args) {
		int dig1, dig2, dig3;

		for (int i = 100; i <= 999; i++) {
			dig1 = i % 10;
			dig2 = i % 100 / 10;		
			dig3 = i % 1000 /100;

			if ((Math.pow(dig1, 3) + Math.pow(dig2, 3) + Math.pow(dig3, 3)) == i) {
				System.out.println(dig3 + "^3 + " + dig2 + "^3 + " + dig1 + "^3 = " + i);
			}
			
		}
		
		// Otra forma (más costosa computacionalmente)
		System.out.println("-------------");
		for (int j = 100; j <= 999; j++) {
			String numero = String.valueOf(j); // Convierte el numero en un String
			String[] a = numero.split("");     // Mete cada componente del string en una posicion del array a[]
			dig1 = Integer.parseInt(a[0]);     // Covierte a entero el String de la posición 0 del array a[]
			dig2 = Integer.parseInt(a[1]);
			dig3 = Integer.parseInt(a[2]);
			
			if ((Math.pow(dig1, 3) + Math.pow(dig2, 3) + Math.pow(dig3, 3)) == j)
				System.out.println(dig1 + "^3 + " + dig2 + "^3 + " + dig3 + "^3 = " + j);

		}
	}
	
	

}
