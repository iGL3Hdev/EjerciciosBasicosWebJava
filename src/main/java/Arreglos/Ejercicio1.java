
/* Ejercicio 1: Leer 5 números, guardalos en un arreglo y mostrarlos en el mismo 
orden introducido*/

package Arreglos;

import java.util.Scanner;



public class Ejercicio1 {


    public static void main(String[] args) {

        
        float [] numeros = new float[5];
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Guardando los datos en el array: ");
        
        for (int i = 0; i < 5; i++) {
            System.out.print((i+1)+".Introduzca un número: ");
            numeros[i] = entrada.nextFloat();
            
        }
        
        
             System.out.println("\nImprimir los elementos del array"); 
             for (float i:numeros){
                 System.out.println(i);
            
        }
        
        

    }
    
}
