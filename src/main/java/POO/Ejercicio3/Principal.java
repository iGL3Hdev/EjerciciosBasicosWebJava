/*  Ejercicio 3: Construir un programa que dada una serie de vehículos caracterizados
    por su marca, modelo y precio, imprima las propiedades del vehículo más barato.
    Para ello, se deberán leer por teclado las características de cada vehículo y 
    crear una clase que represente a cada uno de ellos.

 */
package POO.Ejercicio3;

import java.util.Scanner;


public class Principal {
    
    public static int indiceCocheMBarato(Vehiculo coches[]){
        float precio;
        int indice = 0;
        
        precio = coches[0].getPrecio();
        for (int i = 1; i < coches.length; i++) {
            if(coches[i].getPrecio() < precio){
                precio = coches[i].getPrecio();
                indice = i;
            }
        }
        
        return indice;
        
    }


    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        
        String marca;
        String modelo;
        float precio;
        int numeroVehiculos;
        int indiceBarato;
        
        System.out.println("Introduzca la cantidad de vehículos: ");
        numeroVehiculos = entrada.nextInt();
        
        
        Vehiculo coches[] = new Vehiculo[numeroVehiculos];
        
        for (int i = 0; i < coches.length; i++) {
            entrada.nextLine();
            System.out.println("Introduzca las características de los vehículos "+(i+1)+":");
            System.out.println("Introduzca la Marca del vehículo: ");
            marca = entrada.nextLine();
            System.out.println("Introduzca el modelo del vehículo: ");
            modelo = entrada.nextLine();
            System.out.println("Introduzca el precio del vehículo: ");
            precio = entrada.nextFloat();
            
            
            coches[i] = new Vehiculo(marca, modelo, precio);
                
        }
        
        indiceBarato = indiceCocheMBarato(coches);
        System.out.println("El coche más barato es: ");
        System.out.println(coches[indiceBarato].mostrarDatos());
        
    }
    
}
