/*Ejercicio 13: Hacer un programa que simule un cajero automático con un saldo
inicial de 1000 dólares, con el siguiente menú de opciones:

1.- Ingresar dinero a la cuenta
2.- Retirar dinero de la cuenta
3.- Salir*/



package Condicionales;

import java.util.Scanner;


public class Ejercicio13 {


    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        final int saldoInicial = 1000;
        int opcion;
        float ingreso, saldoActual, retirar;

        
        System.out.println("Bienvenido al Cajero automático, elija una opcion:  ");
        System.out.println("1.- Ingresar dinero a la cuenta: ");
        System.out.println("2.- Retirar dinero de la cuenta: ");
        System.out.println("3.- Salir");
        opcion = entrada.nextInt();
        
        switch(opcion){
            
            case 1:
                
                System.out.println("Indique el dinero a ingresar: ");
                ingreso = entrada.nextFloat();
                
                saldoActual = saldoInicial + ingreso;
                
                System.out.println("El saldo en cuenta :" +saldoInicial);
                
                break;
                
            case 2:
                
                System.out.println("Indique el dinero a retirar: ");
                retirar = entrada.nextFloat();
                
                if(retirar > saldoInicial){
                    System.out.println("No cuenta con suficiente saldo");
                }else{
                    saldoActual = saldoInicial - retirar;
                    System.out.println("EL dinero de cuenta será: "+saldoActual);
                }
                
                break;
                
            case 3: break;
            
            
            default: 
                
                System.out.println("Se equivoco de opcion de menú");
            
            
                
        }
        


                
                
        }
    
}
