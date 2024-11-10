/* Ejercicio 22: Pedir 5 calificaciones de alumnos y decir al final si hay algún
suspenso*/


package CiclosoBucles;

import java.util.Scanner;


public class Ejercicio22 {


    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        float calificaciones;
        boolean suspenso = false;
        
        for (int i = 1; i <= 5; i++) {
            
            System.out.println("Introduzca la calificación: ");
            calificaciones = entrada.nextFloat();
            
            if(calificaciones < 5){
                suspenso = true;
            }
        }
        
        if(suspenso == true){
            System.out.println("Si hay suspensos");
        }else{
            System.out.println("No hay suspensos");
        }

    }
    
}
