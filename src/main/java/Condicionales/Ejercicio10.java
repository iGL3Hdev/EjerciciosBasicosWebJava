/*Ejercicio 10: Pedir el día, mes y año de una fecha e indicar si la fecha es correcta.
con meses de 28, 30, y 31 días. Sin años bisiestos.*/



package Condicionales;

import java.util.Scanner;


public class Ejercicio10 {


    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        
        int dia, mes, año;
        
        System.out.println("Introduce el día: ");
        dia = entrada.nextInt();
        System.out.println("Introduce el mes: ");
        mes = entrada.nextInt();
        System.out.println("Introduce el año: ");
        año = entrada.nextInt();
        
        
        if(año == 0){
            System.out.println("Fecha incorrecta");
        }else if( mes == 2 && (dia >= 1 && dia <= 28)){
            System.out.println("Fecha correcta");
        }else if((mes == 4 || mes == 6 || mes == 9 || mes == 11)) {
            System.out.println("Fecha correcta");
        }else if((mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12)){
            System.out.println("Fecha correcta");
        }else{
            System.out.println("Fecha incorrecta");
        }

    }
    
}
