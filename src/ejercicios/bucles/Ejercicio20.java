package ejercicios.bucles;

import javax.swing.JOptionPane;

/*
 * Ejercicio 20: Pedir un numero N, introducir N sueldos, y mostrar el sueldo maximo.
 */
public class Ejercicio20 {
	   public static void main(String[] args) {
	        int nSueldo, sueldo, sueldoMax = 0;
	        
	        nSueldo = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de sueldos: "));
	        
	        for(int i=1;i<=nSueldo;i++){
	            sueldo = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el "+i+"º sueldo: "));
	            
	            if(sueldo > sueldoMax){
	                sueldoMax = sueldo;
	            }
	        }
	        System.out.println("El mayor suldo es: "+sueldoMax);
	    }
	    
}
