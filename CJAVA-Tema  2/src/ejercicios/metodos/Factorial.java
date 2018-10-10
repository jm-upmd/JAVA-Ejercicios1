package ejercicios.metodos;

import java.util.Scanner;

public class Factorial {
	public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Introduce un numero");
        
        int numero=entrada.nextInt();
        
        System.out.println("El factorial de "+numero+ " es " + factorial(numero));
    }
   public static int factorial (int numero){
        int res=numero;
        //Se inicia con el numero anterior al que introducimos
        for(int cont=(numero-1);cont>0;cont--){
            //Acumulamos el resultado
            res=res*cont;
        }
        return res;
    }
}
