
/* Ejercicio 7: Pedir números hasta que se introduzca uno negativo, y 
    calcular la media*/


package CiclosoBucles;

import java.util.Scanner;


public class Ejercicio7 {


    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        int num;
        float media;
        int suma = 0;
        int elementos = 0;
        
        System.out.println("Introduce un número: ");
        num = entrada.nextInt();
        
        while(num >= 0){
            
            suma += num;
            
            elementos++;
            
            System.out.println("Introduce otro número: ");
            num = entrada.nextInt();
                        
        }
        
        if(elementos == 0){
            System.out.println("Error ! La división entre 0 no existe");
        }else{
            media = suma / elementos;
            System.out.println("La media será: "+media);
        }
        
        

            
    }
    
}
