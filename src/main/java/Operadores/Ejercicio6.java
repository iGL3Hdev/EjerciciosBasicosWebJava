/*Ejercicio 6: Hacer un programa que calcule el cuadrado de una suma*/


package Operadores;

import java.util.Scanner;


public class Ejercicio6 {

   
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        Double a;
        Double b;
        Double resultado;
        
        System.out.println("Introduce el valor de a: ");
        a = entrada.nextDouble();
        System.out.println("Introduce el valro de b: ");
        b = entrada.nextDouble();
        
        resultado = Math.pow(a, 2) + Math.pow(b,2) + 2*a*b;
        
        System.out.println("El resultado del cuadrado de una suma será: "+resultado);
        
        
        
    }
    
}
