/*Ejercicio 4: En MegaPlaza se hace un 20% de descuento a los clientes cuya compra
supere los 300$ ¿Cuál será la cantidad que pagará una persona por su compra?*/


package Condicionales;

import java.util.Scanner;


public class Ejercicio4 {

 
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        double precioCompra, precioFinal;
        
        System.out.println("Introduce el precio de compra: ");
        precioCompra = entrada.nextDouble();
        
        if(precioCompra > 300){
            precioFinal = precioCompra - (precioCompra * 0.20);
            
            System.out.println("El precio de la compra será: "+precioFinal);
        }else if(precioCompra <= 300){
            System.out.println("El precio de la compra será: "+precioCompra);
        }
            
        }
    }
    

