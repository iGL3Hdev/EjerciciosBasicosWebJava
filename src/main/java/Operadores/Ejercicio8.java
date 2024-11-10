/* Ejercicio 8: Construir un programa que calcule y muestre por pantalla las raíces
de la ecuación de segundo grado de coeficientes reales*/

package Operadores;

import java.util.Scanner;


public class Ejercicio8 {


    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        double a, b, c, x1, x2;
        
        System.out.println("Introduce el valor de a: ");
        a = entrada.nextInt();
        System.out.println("Introduce el valor de b: ");
        b = entrada.nextInt();
        System.out.println("Introduce el varlo de c: ");
        c = entrada.nextInt();
        
        x1 = (-b + Math.sqrt(Math.pow(b, 2) - (4 * a * c))) / (2 * a);
        x2 = (-b - Math.sqrt(Math.pow(b, 2) - (4 * a * c))) /(2 * a);
        
        System.out.println("la raiz 1 es: "+x1+ " y la raiz 2 es: "+x2);
        
 
    }
    
}
