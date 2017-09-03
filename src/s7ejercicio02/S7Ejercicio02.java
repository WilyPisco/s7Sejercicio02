
package s7ejercicio02;

import java.util.Scanner;

/**
 *
 * @author wily1
 */
public class S7Ejercicio02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Escribe el radio: ");
        int number1 = Integer.parseInt(reader.nextLine());                
        
        double cir = 2 * Math.PI * number1;
        String toPrint = "\nLa Circunferencia del circulo es: " + cir;
        System.out.println(toPrint);      
    }
    
}
