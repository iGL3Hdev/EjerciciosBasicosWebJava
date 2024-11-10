/* Ejercicio 18: Hacer unas modificaciones al ejercicio anterior suponiendo que 
no se introduce le precio por litro. Sólo existen tres productos con precios:

    1- 0,6 $/litro
    2- 3 $/litro
    3- 1,25 $/litro
*/
package CiclosoBucles;

import java.util.Scanner;


public class Ejercicio18 {


    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        int codArticulo;
        int litros;
        float precioLitro = 0;
        float importeFactura;
        float facturacionTotal = 0;
        float litrosArticulo1 = 0;
        int conteoMas600 = 0;
        
        for (int i = 1; i <= 5; i++) {
            
            do {
                
                System.out.println("Artículo Nº: "+i+ " introduzca el codigo: ");
                codArticulo = entrada.nextInt();
                
            } while (codArticulo < 1 || codArticulo > 3);

            System.out.println("Articulo Nº: "+i+ " introduzca la cantidad vendida en litros: ");
            litros = entrada.nextInt();
            
            
            switch(codArticulo){
                
                case 1:
                    precioLitro = 0.6f;
                    break;
                    
                case 2:
                    precioLitro = 3;
                    break;
                    
                case 3:
                    precioLitro = 1.25f;
                    break;
            }
            
            importeFactura = (float) litros * precioLitro;
            facturacionTotal += importeFactura;
            
            if(codArticulo == 1){
                litrosArticulo1 += litros;
            }
            if(importeFactura > 600){
                conteoMas600++;
            }         
        }
        
        System.out.println("Resumen de ventas: ");
        System.out.println("Facturación total: "+facturacionTotal);
        System.out.println("Cantidad en litros vendidos del artículo 1: "+litrosArticulo1);
        System.out.println("Cantidad de facturas mayores a $600: "+conteoMas600);

    }
    
}
