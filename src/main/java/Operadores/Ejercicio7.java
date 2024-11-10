/*Ejercicio 7: Construir un programa que, dado un número total de horas, devuelve
el número de semanas, días y horas equivalentes*/


package Operadores;

import java.util.Scanner;


public class Ejercicio7 {

 
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        int horas;
        int semanas;
        int dias;
        int horasTotales;
        
        System.out.println("Introduce el número de horas: ");
        horasTotales = entrada.nextInt();
        
        semanas = horasTotales / 168;
        dias = horasTotales%168 / 24;
        horas = horasTotales%24;
        
        System.out.println(horasTotales+ " horas, equivalen a: "+semanas+" semanas "+dias+" dias y "+horas+" horas");

        
        
    }
    
}
