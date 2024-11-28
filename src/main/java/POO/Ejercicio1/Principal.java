/* Ejerciio 1: Construir un programa que calcule el área y el perímetro de un cuadrilátero
                dada la longitud de los dos lados. Los valores de la longitud deberán
                introducirse por línea de ordenes. Si es un cuadrado, sólo se proporcionará
                la longitud de uno de los lados al constructor.
 
 */
package POO.Ejercicio1;

import java.util.Scanner;


public class Principal {


    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        
        Cuadrilatero c1;
        float lado1;
        float lado2;
        
        System.out.println("Introduzca el lado 1: ");
        lado1 = entrada.nextFloat();
        System.out.println("Introduzca el lado 2: ");
        lado2 = entrada.nextFloat();
        
        if(lado1 == lado2){
            c1 = new Cuadrilatero(lado1);
        }else{
            c1 = new Cuadrilatero(lado1, lado2);
        }
        
        System.out.println("El perímetro es: "+c1.getPerimetro());
        System.out.println("El área es: "+c1.getArea());
        
        
        
        
    }
    
}
