
/*Ejercicio 14: Hacer un programa que pase de kg a otra unidad de medida de masa, 
mostrar en pantalla un menú con las opciones posibles*/

package Condicionales;

import java.util.Scanner;


public class Ejercicio14 {


    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        float medida;
        int opcion= 0;
        
        System.out.println("Introduzca la candidad de kg: ");
        medida = entrada.nextFloat();
        System.out.println("Escoja una opción: ");
        System.out.println("1.- Hectogramos: " );
        System.out.println("2.- Decagramos: ");
        System.out.println("3.- Gramos: ");
        System.out.println("4.- Decigramos: ");
        System.out.println("5.- Centigramos: ");
        System.out.println("6.- Miligramos: ");
        
        switch(opcion){
            
            case 1:
                
                medida *= 10;
                System.out.println("La nueva medida en Hectogramos es: ");
                break;
                
            case 2:
                
                medida *= 100;
                System.out.println("La nueva medida en Decagramos es: ");
                break;
                
            case 3:
                
                medida *= 1000;
                System.out.println("La nueva medida en gramos es: ");
                break;
                
            case 4:
                
                medida *= 10000;
                System.out.println("La nueva medida en Decigramos es: ");
                break;
                
            case 5:
                
                medida *= 100000;
                System.out.println("La nueva medida en Centigramos es: ");
                break;
                
            case 6:
                
                medida *= 1000000;
                System.out.println("La nueva medida en Miligramos es: ");
                break;
                
                
        }
        

    }
    
}
