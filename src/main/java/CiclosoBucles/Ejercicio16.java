/* Ejercicio 16: Pide un núemro (que debe estar entre 0 y 10) y mostrar la tabla
de multiplicar de dicho número*/
package CiclosoBucles;

import java.util.Scanner;


public class Ejercicio16 {

    
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        int num;
        
       
        do {
            
            System.out.println("Introduce un número: ");
            num = entrada.nextInt();
            
        } while (num < 0 || num > 10);
        
        System.out.println("La tabla de multiplicar del número "+num+ " es: ");
        
        for (int i = 0; i <= 10; i++) {
            
            System.out.println(num+ " x "+i+ " = " +num * i );
            
        }
        
        

    }
    
}
