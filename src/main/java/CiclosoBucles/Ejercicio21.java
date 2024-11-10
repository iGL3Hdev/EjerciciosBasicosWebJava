/* Ejercicio 21: Pedir 10 números, y mostrar al final si se ha introducido alguno
negativo*/


package CiclosoBucles;

import java.util.Scanner;


public class Ejercicio21 {

 
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        int numero;
        boolean hay_negativos = false;
        
        for (int i = 0; i <= 10; i++) {
            
            System.out.println("Introduce un número: ");
            numero = entrada.nextInt();
            
            if(numero < 0){
                hay_negativos = true;
             
            }
            
        }
        
        if(hay_negativos == true){
            System.out.println("Si existen números negativos");
        }else{
            System.out.println("No existen números negativos");
        }
        
        

    }
    
}
