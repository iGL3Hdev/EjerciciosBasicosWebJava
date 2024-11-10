/* Ejercicio 1; Hacer un programa que calcule e imprima la
   suma de tres calificaciones */


package Operadores;

import java.util.Scanner;

public class Ejercicio1 {


    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        int nota1;
        int nota2;
        int nota3;
        int resultado;
        
        System.out.println("Introduzca la nota1: ");
        nota1 = entrada.nextInt();
        System.out.println("Introduzca la nota 2: ");
        nota2 = entrada.nextInt();
        System.out.println("Introduzca la nota 3: ");
        nota3 = entrada.nextInt();
        
        resultado = nota1 + nota2 + nota3;
        
        System.out.println("El resultado final será: "+resultado);

    }
    
}
