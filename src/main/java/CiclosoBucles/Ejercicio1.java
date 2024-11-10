/* Ejercicio 1: Leer un número por teclado y mostrar su cuadrado, repetir el
proceso hasta que se introduzca un número negativo*/



package CiclosoBucles;

import java.util.Scanner;


public class Ejercicio1 {

 
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        int num;
        int cuadrado;
        
        System.out.println("Introduzca un número: ");
        num = entrada.nextInt();
        
       
        
            while(num >= 0){
            
                cuadrado = (int) Math.pow(num, 2);
        
                System.out.println("El cuadrado del número: "+num+ " es: "+cuadrado);
        
                System.out.println("Introduzca otro número: ");
                num = entrada.nextInt();
            }

    }
    
}
