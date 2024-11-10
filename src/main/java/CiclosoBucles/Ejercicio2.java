/* Ejercicio 2: Leer un número e indicar si espositivo o negativo. El proceso se repetirá
    hasta que se introduzca un 0*/



package CiclosoBucles;

import java.util.Scanner;


public class Ejercicio2 {

    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        int num;
        
        System.out.println("Introduce un número: ");
        num = entrada.nextInt();
        
        
        while(num != 0){
            
            if(num > 0){
                System.out.println("El número" +num+ " es positivo ");
            }else{
                System.out.println("El número" +num+ " es negativo");
            }
            
        System.out.println("Introduzca otro número: ");
        num = entrada.nextInt();
        }      

    }
    
}
