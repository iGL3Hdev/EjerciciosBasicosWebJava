/*Ejercicio 12: Pedir una nota de 0 a 10 y mostrarla de la forma: Insuficiente,
Suficinete, Bien, Notabe y sobresaliente*/



package Condicionales;

import java.util.Scanner;


public class Ejercico12 {

 
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        int nota;
        
        
        System.out.println("Introduce una nota: ");
        nota = entrada.nextInt();
        
            if(nota < 0 || nota > 10){
                System.out.println("Nota inválida. Introduce una nota entre 0 y 10");
            }else if(nota < 5){
                System.out.println("Insuficiente");
            }else if(nota <6){
                System.out.println("Suficiente");
            }else if(nota <7){
                System.out.println("Bien");
            }else if(nota <9){
                System.out.println("Notable");
            }else{
                System.out.println("sobresaliente");
            }

    }
    
}
