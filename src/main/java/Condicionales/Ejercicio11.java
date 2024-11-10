/*Ejercicio 11: Construir un programa que simule el funcionamiento de una calculadora
que puede realizar las cuatro operaciones aritméticas básicas(suma, resta, producto,
y división) con valores numéricos enteros. El usuario debe especificar la operación
con el primer carácter del primer parámetro de la línea de comandos: S o s para la suma,
R o r para la resta, P, p, M o m para el producto y D o d para la división.*/


package Condicionales;

import java.util.Scanner;


public class Ejercicio11 {


    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        int num1, num2, suma, resta, mult, div;
        char operacion;
        
        System.out.println("Introduce el número 1: ");
        num1 = entrada.nextInt();
        
        System.out.println("Introduce el número 2: ");
        num2 = entrada.nextInt();
        
        System.out.println("Introduce la operación a realizar: ");
        operacion = entrada.next().charAt(0);
        
        switch(operacion){
            
            case 's':
            case 'S': suma = num1 + num2;
                
                System.out.println("La suma será: "+suma);
                
                break;
                
            case 'r':
            case 'R': resta = num1 - num2;
            
                System.out.println("La resta será: "+resta);
                
                break;
                
            case 'm':
            case 'M': mult = num1 * num2;
            
                System.out.println("La multiplicación será: "+mult);
                
                break;
                
            case 'd':
            case 'D': div = num1 / num2;
                
                System.out.println("La división será: "+div);
                break;
                
            default: 
                System.out.println("Error, se equivocó de operación");
        }

    }
    
}
