/* Ejercicio 3: Leer números hasta que se introduzca un 0. Para cada uno indicar
si es par o impar*/



package CiclosoBucles;

import java.util.Scanner;


public class Ejercicio3 {


    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        int num;
        
        System.out.println("Introduce un número: ");
        num = entrada.nextInt();
        
        
        while(num != 0) {
            
            if(num %2 == 0){
                System.out.println("El número " +num+ " es par");
            }else{
                System.out.println("El número" +num+ " es impar");
            }
            
            System.out.println("Introduce otro número: ");
            num = entrada.nextInt();
        
        }


    }
    
}
