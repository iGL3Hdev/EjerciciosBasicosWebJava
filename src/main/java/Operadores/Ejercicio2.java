
/* Ejercicio 2: Hacer un programa que calcule e imprima el saliro semanal de un empleado
a partir de sus horas semanales trabajadas y su salario por hora*/

package Operadores;

import java.util.Scanner;


public class Ejercicio2 {

   
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        float horasTrabajadas;
        int precioHora;
        float salarioTotal;
        
        System.out.println("Introduce las horas semanales trabajadas: ");
        horasTrabajadas = entrada.nextFloat();
        System.out.println("Introduce el precio hora: ");
        precioHora = entrada.nextInt();
        
        salarioTotal = (int)horasTrabajadas * precioHora;
        
        System.out.println("El salario semanal será: " +salarioTotal);
        

    }
    
}
