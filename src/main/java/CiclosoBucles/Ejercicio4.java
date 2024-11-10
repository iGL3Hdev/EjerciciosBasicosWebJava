/*Ejercicio 4: Pedir números hasta que se teclee uno negativo, y mostrar cuántos
números se han introducido*/


package CiclosoBucles;

import java.util.Scanner;


public class Ejercicio4 {

 
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        int num;
        int contador = 0;
        
        System.out.println("Introduce un número: ");
        num = entrada.nextInt();
        
        
        while(num >= 0){
            contador++;
            
            System.out.println("Introduce otro número: ");
            num = entrada.nextInt();
        }
        
        System.out.println("Has introducido " +contador+ " no negativos");
       
 
    }
    
}
