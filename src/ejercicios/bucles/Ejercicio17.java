package ejercicios.bucles;

import java.util.Scanner;

/*
 * Una empresa que se dedica a la venta de desinfectantes necesita un programa para gestionar las facturas. 
 * En cada factura figura: el código del artículo, la cantidad vendida en litros y el precio por litro. 
 * Se pide de 5 facturas introducidas: 
 * Facturación total, 
 * cantidad en litros vendidos del artículo 1 
 * y cuantas facturas se emitieron de más de $600.
 */
public class Ejercicio17 {
	public static void main(String [] args) {
		  Scanner entrada = new Scanner(System.in);
		  int codigo,cantidadVendidaL,cantidadArt1 = 0,cont600 = 0;
		  float precioLitro,facturacion = 0;
		  
		  for(int i=1;i<=5;i++) {
		   System.out.println("Articulo "+i+" Introduce el codigo del producto: ");
		   codigo=entrada.nextInt();
		   System.out.println("Introduce la cantidad vendidad en Litros:");
		   cantidadVendidaL=entrada.nextInt();
		     if(codigo==1) {
		      cantidadArt1+=cantidadVendidaL;
		      }
		   System.out.println("Introduce el precio por litro del articulo: ");
		   precioLitro=entrada.nextFloat();
		   facturacion+=cantidadVendidaL*precioLitro;
		     if((cantidadVendidaL*precioLitro)>600) {
		      cont600++;
		      }
		  }
		  System.out.println("Esta es la facturacion total: "+facturacion);
		  System.out.println("Cantidad en listros vendidos del articulo 1: "+ cantidadArt1);
		  System.out.println("Facturas de mas de 600$: "+cont600);
		  entrada.close();
		 

		}
}
