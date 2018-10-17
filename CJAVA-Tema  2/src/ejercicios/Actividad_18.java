package ejercicios;

import java.util.Scanner;

import leer.Leer;

public class Actividad_18 {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
      
		System.out.println("Introduce un número");
		int numero = scanner.nextInt();
		
		// forma 1
        System.out.println("El numero "+numero+ " en binario es "+ decimalBinario(numero));
       
        // forma 2
        System.out.printf("El número %d en binario es %.0f\n", numero,decimalBinario2(numero));
        
        
       // forma 3. La más sencilla..., llamando clase del API de Java.
        System.out.println("El numero "+numero+ " en binario es "+ Integer.toBinaryString(numero));


        
    }
	
   public static String decimalBinario (int numero){
        String binario="";
        String digito;
        for(int i=numero;i>0;i/=2){
            if(i%2==1){
                digito="1";
            }else{
                digito="0";
            }
            //Se añade el digito al principio 
            binario=digito+binario;
        }
        		
       
        return binario;
    }
   
   // Otra forma de hacerlo
   public static double decimalBinario2(int numero) {
	   int exp, digito;
       double binario;

       exp=0;
       binario=0;
       while(numero!=0){
               digito = numero % 2;           
               binario = binario + digito * Math.pow(10, exp);  
               exp++;
               numero = numero/2;
       }
       return  binario;
   }
   
  
}
