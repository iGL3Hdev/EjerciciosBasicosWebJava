/* Ejercicio 13: Pedir 10 numeros. Mostrar la media de los números positivos, la 
media de los números negativos y la cantidad de ceros*/
package CiclosoBucles;

import java.util.Scanner;


public class Ejercicio13 {


    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        int num;
        int sumaPositivos = 0;
        int sumaNegativos = 0;
        int conteoPositivos = 0;
        int conteoNegativos = 0;
        float mediaPositivos;
        float mediaNegativos;
        int conteoCeros = 0;
        
        for (int i = 1; i < 11; i++) {
            System.out.println("Introduzca un número: ");
            num = entrada.nextInt();
            
            
            if(num == 0){
                conteoCeros++;
            }else if(num > 0){
                sumaPositivos += num;
                conteoPositivos++;
            }else{
                sumaNegativos += num;
                conteoNegativos++;
            }         
        }
        
        if(conteoPositivos == 0){
            System.out.println("No se puede realizar la media de los números positivos");
        }else{
            mediaPositivos = (float) sumaPositivos / conteoPositivos;
            System.out.println("La media de los números positivios es: "+mediaPositivos);
        }
        
        if(conteoNegativos == 0){
            System.out.println("No se puede realizar la media de los números negativos");
        }else{
            mediaNegativos = (float) sumaNegativos / conteoNegativos;
            System.out.println("La media de los números negativos es: "+mediaNegativos);
        }
        
        System.out.println("La cantidad de ceros es: "+conteoCeros);

    }
    
}
