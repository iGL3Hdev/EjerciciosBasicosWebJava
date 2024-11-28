/*  Ejercicio 4: Construir un programa para una competencia de atletismo, el programa
    debe gestionar una serie de atletas caracterizados por su número de atleta, nombre 
    y tiempo de carrera, al final del programa debe mostrar los datos del atleta 
    ganador de la carrera. 
 */


package POO.Ejercicio4;

import java.util.Scanner;


public class Principal {
    
    public static int indiceGanador(Atleta atletas[]){
        float tiempoCarrera;
        int indice = 0;
        tiempoCarrera = atletas[indice].getTiempoCarrera();
        for (int i = 1; i < atletas.length; i++) {
            if(atletas[i].getTiempoCarrera() < tiempoCarrera){
                tiempoCarrera = atletas[i].getTiempoCarrera();
                indice = i;
            }              
        }
        
        return indice;
    }


    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        int numeroAtleta;
        String nombre;
        float tiempoCarrera;
        int numeroAtletas;
        int indiceAtletaGanador;
        
        System.out.println("Introduzca el número de atletas: ");
        numeroAtletas = entrada.nextInt();
        
        Atleta atletas[] = new Atleta[numeroAtletas];
        
        for (int i = 0; i < atletas.length; i++) {
            System.out.println("\nIntroduzca los datos del atleta "+(i+1)+": ");
            System.out.println("Introduzca el número del atleta: ");
            numeroAtleta = entrada.nextInt();
            entrada.nextLine();
            System.out.println("Introduzca le nombre del atleta: ");
            nombre = entrada.next();
            System.out.println("Introduzca el tiempo de la carrera: ");
            tiempoCarrera = entrada.nextFloat();
        }
        
        indiceAtletaGanador = indiceGanador(atletas);
        System.out.println("El atleta ganador es: ");
        System.out.println(atletas[indiceAtletaGanador].mostrarDatosGanador());
        

    }
    
}
