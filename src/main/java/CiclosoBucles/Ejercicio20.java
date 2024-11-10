/* Ejercicio 20: Pedir un número N, introducir N sueldos, y mostrar el sueldo máximo*/


package CiclosoBucles;

import java.util.Scanner;


public class Ejercicio20 {


    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        int numeroSueldos;
        float sueldo;
        float sueldoMaximo = 0;
        
        
        System.out.println("Introduzca la cantidad de sueldos: ");
        numeroSueldos = entrada.nextInt();
        
        
        for (int i = 0; i <=numeroSueldos; i++) {
            System.out.println("Introduzca el sueldo "+i+": ");
            sueldo = entrada.nextFloat();  
            
            if(sueldo > sueldoMaximo){
                sueldoMaximo = sueldo;
            }
        }
        
        System.out.println("El sueldo máximo será: "+sueldoMaximo);
    }
    
}
