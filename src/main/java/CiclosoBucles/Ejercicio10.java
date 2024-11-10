/* Ejercicio 10: Pedir 10 núemros y escribir la suma total*/


package CiclosoBucles;

import java.util.Scanner;


public class Ejercicio10 {


    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        int num;
        int suma = 0;


        for (int i = 1; i < 10; i++) {
            System.out.println("Introduce un número: ");
            num = entrada.nextInt();
            
            suma += num;
        }
        
        System.out.println("La suma de los 10 números será: "+suma);
        
 
    }
    
}
