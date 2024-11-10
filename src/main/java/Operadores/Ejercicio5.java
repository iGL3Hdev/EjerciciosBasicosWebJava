/*Ejercicio 5: La calificación final de un estudiante de Informatíca se calcula con
base a las calificaciones de cuatro aspectos de su rendimiento académico: participación,
primer examen parcial, segundo examen parcial y examen final. Sabiendo que las
calificaciones anteriores entran a la calificación final con ponderaciones del 
10 %, 20 %, 25 % y 40 %, Hacer un programa que calcule e imprima la califiación
final obtenida por un estudiante*/



package Operadores;

import java.util.Scanner;


public class Ejercicio5 {


    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        float examenParcial1;
        float examenParcial2;
        float participacion;
        float examenFinal;
        float notaFinal;
        
        System.out.println("Introduce la nota de participación: ");
        participacion = entrada.nextFloat();
        System.out.println("Introduce la nota del parcial 1: ");
        examenParcial1 = entrada.nextFloat();
        System.out.println("Introduce la nota del parcial 2:");
        examenParcial2 = entrada.nextFloat();
        System.out.println("Introduce la nota del examen final: ");
        examenFinal = entrada.nextFloat();
        
        notaFinal = ((participacion * 0.1f) + (examenParcial1 *0.25f) + (examenParcial2 * 0.25f) + (examenFinal * 0.40f));
        
        System.out.println("La calificación final será: "+notaFinal);
        

    }
    
}
