/* Ejercicioi 6: Pedir números hasta que se teclee un 0, mostrar la suma de todos
    los númoers introducidos*/


package CiclosoBucles;

import java.util.Scanner;


public class Ejercicio6 {

 
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        int num;
        int suma = 0;
        int contador = 0;
        
        
        do {
            
            System.out.println("Introduce un número: ");
            num = entrada.nextInt();
            
            suma += num;
            
        } while (num != 0);
        
        System.out.println("La suma es: "+suma);

    }
    
}
