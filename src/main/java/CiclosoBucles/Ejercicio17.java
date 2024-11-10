/* Ejercicio 17: Una empresa que se dedica a la venta de desinfectgantes necesita un
programa para gestionar facturas. En cada factura figura: el código del artículo, la 
cantidad vendida en litros y el precio por litro. Se pide de 5 facturas introducidas:
Facturación total, cantidad en litros vendios del artículo 1 y cuantas facturas
se emitieron de más de $600 */
package CiclosoBucles;

import java.util.Scanner;


public class Ejercicio17 {


    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        int codArticulo;
        int litros;
        float precioLitro;
        float importeFactura;
        float facturacionTotal = 0;
        float litrosArticulo1 = 0;
        int conteoMas600 = 0;
        
        for (int i = 1; i <= 5; i++) {
            System.out.println("Artículo Nº: "+i+ " introduzca el codigo: ");
            codArticulo = entrada.nextInt();
            System.out.println("Articulo Nº: "+i+ " introduzca la cantidad vendida en litros: ");
            litros = entrada.nextInt();
            System.out.println("Articulo Nº: "+i+ " introduzca el precio por litro: ");
            precioLitro = entrada.nextFloat();
            
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
