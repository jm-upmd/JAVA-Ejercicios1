package ejercicios.metodos;

import java.util.Scanner;

public class CambioDivisa {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
        System.out.println("Escribe una cantidad en euros:");
        double cantidad=entrada.nextDouble();
        System.out.println("Escribe la moneda a la que quieres convertir (libras, dolares, yenes: ");
        String moneda = entrada.next();
        conversor(cantidad, moneda);
        
    }
	
    public static void conversor (double cantidad, String moneda){
        double res=0;
 
        //Este booleano lo utilizo en caso de que alguien, no introduzca un nombre de moneda correcto
        boolean correcto = true;
 
        //Segun la moneda, calculamos la cantidad
        switch (moneda){
        case "libras":
            res=cantidad*0.86;
            break;
        case "dolares":
            res=cantidad*1.29;
            break;
        case "yenes":
            res=cantidad*129.852;
            break;
        default:
            System.out.println("No has introducido una moneda correcta");
            correcto=false;
        }
 
        //Solo si es correcto muestra el mensaje
        if (correcto){
            System.out.println(cantidad+ " euros en " +moneda+ " son " +res);
        }
 
    }

}
