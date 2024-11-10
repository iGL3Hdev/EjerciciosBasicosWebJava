/* Ejercicio 4: Una compañia de ventas de carros usados, paga a su personal de 
ventas un salario de 1000$ mensuales, mas una comisión de 150$ por cada carro
vendido, más el 5% del valor de la venta por carro. Cada mes el capturista de la 
empresa ingresa en la computadora los datos pertinentes. Hacer un programa que calcule
e imprima el salario mensual de un vendedor dado*/


package Operadores;

import java.util.Scanner;


public class Ejercicio4 {


    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        int cochesVendidos;
        final int salario = 1000;
        float comision;
        float salarioTotal;
        float costeVehiculo;
        
        System.out.println("Cuantos vechículos ha vendido al mes: ");
        cochesVendidos = entrada.nextInt();
        System.out.println("Indique el coste de los vehículos: ");
        costeVehiculo = entrada.nextFloat();
        
        salarioTotal = (float)(salario + (cochesVendidos*150)+(costeVehiculo * cochesVendidos *0.05));
        
        System.out.println("El salario total será: "+salarioTotal);

    }
    
}
