/* Ejercicio 15: Dadas las edades y alturas de 5 alumnos, mostrar la edad y la estatura
media, la cantidad de alumnos mayores de 18 años, y la cantidad de alumnos que miden más
de 1.75*/


package CiclosoBucles;

import java.util.Scanner;


public class Ejercicio15 {


    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        float altura;
        int edad;
        float sumaAltura = 0;
        int sumaEdad = 0;
        float mediaAltura;
        float mediaEdad;
        int conteoMayor18 = 0;
        int conteoMayor175 = 0;
        
        
        for (int i = 1; i <= 5; i++) {
            System.out.println("Alumno "+i+" introduzca su edad: ");
            edad = entrada.nextInt();
            System.out.println("Alumno "+i+" introduzca su altura: ");
            altura = entrada.nextFloat();
            
            sumaEdad += edad;
            sumaAltura += altura;
            
            if(edad > 18){
                conteoMayor18++;
            }
            if(altura > 175){
                conteoMayor175++;
            }
        }
        
        mediaEdad = (float) sumaEdad / 5;
        mediaAltura = (float) sumaAltura / 5;
        
        System.out.println("La edad promedio es: "+mediaEdad);
        System.out.println("La estatura promedio es: "+mediaAltura);
        System.out.println("Cantidad alumnos mayores a 18 años: "+conteoMayor18);
        System.out.println("Cantidad alumnos más altos de 175 cm: "+conteoMayor175);

    }
    
}
