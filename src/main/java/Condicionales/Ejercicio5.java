/* Ejercicio 5: Un obrero necesita calcular su salario semanal, el cuál se obtiene
de la siguiente manera: 
    - Si trabaja 40 horas o menos se le paga $16 por hora
    - Si trabaja mas de 40 horas se le paga $16 por cada una de las primeras
        40 horas y $20 por cada hora extra*/


package Condicionales;

import java.util.Scanner;


public class Ejercicio5 {


    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        int horasSemanales;
        int salarioFinal;
        
        
        
        System.out.println("Cuantas horas a la semana trabaja?: ");
        horasSemanales = entrada.nextInt();
        
        
        if(horasSemanales <= 40){
            salarioFinal = horasSemanales * 16;
            System.out.println("El salario semanal será: "+salarioFinal);
            
        }else{
            salarioFinal = ((horasSemanales - 40)*20) + (40*16);
            
            System.out.println("El salario semanal será: "+salarioFinal);
            
        }


    }
    
}
