/*Ejercicio 3: Guillermo tiene N dolares. Luis tiene la mitad de lo que posee
Guillermo. Juan tiene la mitad d elo que poseen Luis y Guillermo juntos. Hacer un 
programa que calcule e imprima la cantidad de dinero que tienen entre los tres.*/


package Operadores;

import java.util.Scanner;


public class Ejercicio3 {

 
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        float dineroGuillermo;
        float dineroLuis;
        float dineroJuan;
        float dineroTotal;
        
        System.out.println("Cuanto dinero tiene Guillermo: ");
        dineroGuillermo = entrada.nextFloat();
        
        dineroLuis = dineroGuillermo/2;
        dineroJuan = (dineroGuillermo + dineroLuis)/2;
        
        dineroTotal = dineroGuillermo + dineroLuis + dineroJuan;
        
        System.out.println("El dinero entre los tres es: " +dineroTotal);
    }
    
}
