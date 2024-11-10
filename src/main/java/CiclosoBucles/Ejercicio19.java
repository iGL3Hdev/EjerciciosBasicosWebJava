/* Ejercicio 19: Dadas 6 notas, escribir la cantidad de alumnos aprobados, condicionados (=4)
y suspensos*/
package CiclosoBucles;

import java.util.Scanner;

public class Ejercicio19 {

    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        float nota;
        int aprobados = 0;
        int condicionados = 0;
        int suspensos = 0;
        
        
        for (int i = 1; i <= 6; i++) {
            
            do {
                
                System.out.println("Introduzca una nota: ");
                nota = entrada.nextInt();
                
            } while(nota < 0 || nota > 10);
            
            if(nota == 4){
                condicionados++;
            }else if(nota >= 5){
                aprobados++;
            }else{
                suspensos++;
            }
   
        }
        
            System.out.println("La cantidad de aprobados será: "+aprobados);
            System.out.println("La cantidad de suspensos será: "+suspensos);
            System.out.println("La cantidad de condicionados será: "+condicionados);
        

        
        

    }
    
}
