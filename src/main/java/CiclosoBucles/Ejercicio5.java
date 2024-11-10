/* Ejercicio 5: Realizar un juego para adivinar un número. Para ello generar un número
    aleatorio entre 0-100, y luego ir pidiendo números indicando "es mayor" o "es menor"
    según sea mayor o menor con respecto a N. El proceso termina cuando el usuario
    acierta y mostrar el número de intentos.*/



package CiclosoBucles;

import java.util.Scanner;


public class Ejercicio5 {


    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        int num;
        int contador = 0;
        double aleatorio;
        
        aleatorio = (int)(Math.random()*100);
        
        
        do {
            
            System.out.println("Introduce un número: ");
            num = entrada.nextInt();
            
            if(aleatorio > num){
                System.out.println("El número es mayor");
            }else{
                System.out.println("El número es menor");
            }
            contador++;
        } while (num != aleatorio);
        
        System.out.println("Genial. Has ganado. Has utilizado " +contador+ " intentos");
        


    }
    
}
