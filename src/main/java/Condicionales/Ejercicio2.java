
/* Ejercicio 2: Pedir dos números y decir cuál es el mayor o si son iguales*/

package Condicionales;

import java.util.Scanner;


public class Ejercicio2 {

  
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        int num1;
        int num2; 
        
        System.out.println("Introduce el número 1: ");
        num1 = entrada.nextInt();
        
        System.out.println("Introduce el número 2: ");
        num2 = entrada.nextInt();
        
        if(num1 > num2){
            System.out.println("El número: "+num1+" es mayor que el: "+num2);
        }else if(num1 == num2){
            System.out.println("El número: "+num1+" es igual que el: "+num2);
        }else{
            System.out.println("el número: "+num2+" es el mayor");
        }
   
    }
    
}
