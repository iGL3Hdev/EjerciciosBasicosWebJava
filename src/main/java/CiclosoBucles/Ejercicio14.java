/* Ejercicio 14: Pedir 10 sueldos. Mostrar su suma y cuantos hay mayores de $100

 */
package CiclosoBucles;

import java.util.Scanner;

public class Ejercicio14 {
    
    
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        float sueldos = 0;
        float sumaSueldos = 0;
        int contarSueldos = 0;
        
        
        
        for (int i = 1; i < 11; i++) {
            System.out.println("Introduzca un sueldo: ");
            sueldos = entrada.nextInt();
 
 
            
            if(sueldos > 1000){
                contarSueldos++;

                  
                
            }
            sumaSueldos += sueldos;
            
        }
             
            System.out.println("La suma de los sueldos es: "+sumaSueldos);
            System.out.println("La cantidad de sueldos mayores de $1000 es: "+contarSueldos);
        

    }
    
}
