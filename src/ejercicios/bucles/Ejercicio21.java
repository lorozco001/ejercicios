package ejercicios.bucles;

import javax.swing.JOptionPane;

/*
 * Ejercicio 21: Pedir 10 números, y mostrar al final si se ha introducido alguno negativo.
 */
public class Ejercicio21 {
	 public static void main(String[] args) {
	        
	        int nota, contador=0;
	        boolean suspenso=false; 
	        for(int i=1; i<=5; i++){
	        
	          nota=Integer.parseInt(JOptionPane.showInputDialog("Digita la nota con un rango de 0 a 10"));
	          
	          if(nota<5){
	          
	             suspenso=true;
	             contador++;
	          
	          }
	        }
	        
	        if(suspenso==true){
	        
	            System.out.println("Hay " + contador + " estudiante suspendido");
	        }else{
	        
	            System.out.println("No hay estudiante suspendido");
	        
	        }
	        
	    }
}
