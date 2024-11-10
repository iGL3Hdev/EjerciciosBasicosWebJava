
/* Ejercicio 8: Pedir un número N, y mostrar todos los números del 1 al N*/

package CiclosoBucles;

import java.util.Scanner;


public class Ejercicio8 {


    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        int num, i;
        
        System.out.println("Introduce un número: ");
        num = entrada.nextInt();
        
        i = 1;
        
        while(i <= num){
            System.out.println(i);
            i++;
        }

    }
    
}
