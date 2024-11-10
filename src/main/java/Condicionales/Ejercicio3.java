
/*Ejercicio 3: Hacer un programa que lea un carácter por teclado y compruebe
si es una letra mayúscula*/

package Condicionales;

import java.util.Scanner;


public class Ejercicio3 {


    public static void main(String[] args) {
        
        
        Scanner entrada = new Scanner(System.in);
        
        
        char letra;
        
        System.out.println("Introduzca un carácter: ");
        letra = entrada.next().charAt(0);
        
        if(Character.isUpperCase(letra)){
            System.out.println("Es una letra mayúscula");
        }else{
            System.out.println("Es una letra minúscula");
        }
    }
    
}
