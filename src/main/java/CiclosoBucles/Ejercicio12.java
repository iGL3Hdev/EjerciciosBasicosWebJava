/*Ejercicio 12: Pedir un número y calcular su factorial*/ 

package CiclosoBucles;

import java.util.Scanner;


public class Ejercicio12 {


    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        int num;
        long factorial = 1;
        
        System.out.println("Introduzca un número: ");
        num = entrada.nextInt();
        
        for (int i = 1; i <= num; i++) {
            factorial *= i; 
            
        }
        
        System.out.println("El factorial del número: "+num+ " es: "+factorial);
    }
    
}
