/*  Ejercicio 2: Construir un programa que permita dirigir el movimiento de un objeto
    dentro de un tablero y actualice su posición dentro del mismo. Los movimientos posibles
    son ARRIBA, ABAJO, IZQUIERDA Y DERECHA. Tras cada movimiento el programa mostrará la
    nueva dirección elegida y las coordenadas de situación del objeto dentro del tablero

 */
package POO.Ejercicio2;

import java.util.Scanner;


public class Principal {


    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        Tablero t1;
        int x, y;
        int opcion, incremento = 0;
        
        
        System.out.println("Introduce la posición de x: ");
        x = entrada.nextInt();
        
        System.out.println("Introduce la posición de Y:");
        y = entrada.nextInt();
        
        
        t1 = new Tablero(x,y);
        
        do {
            System.out.println("\n\t.: MENU: ");
            System.out.println("1. Mover hacia ARRIBA");
            System.out.println("2. Mover hacia ABAJO");
            System.out.println("3. Mover hacia la DERECHA");
            System.out.println("4. Mover hacia la IZQUIERDA");
            System.out.println("5. Salir");
            System.out.println("Escriba la opcion de menú: ");
            opcion = entrada.nextInt();
            
            if(opcion != 5){
                System.out.println("\nIntroduzca la cantidad de espacios a moverse");
                incremento = entrada.nextInt();
            }
            
            switch(opcion){
                case 1:
                        t1.moverArriva(incremento);
                        
                    break;
                    
                case 2:
                        t1.moverAbajo(incremento);
                        
                    break;
                    
                case 3: 
                        t1.moverDerecha(incremento);
                        
                    break;
                    
                case 4: 
                        t1.moverIzquierda(incremento);
                        
                    break;
                    
                case 5:
                    
                    break;
                    
                default:
                    
                    System.out.println("Error. La opcion no es correcta");
                    
                    break;
            }
            
            System.out.println("Posición actual del objeto (x, Y) : ("+t1.getX()+" , "+t1.getY()+")");
            
            
            
            
        } while (opcion != 5);
        
        

    }
    
}
