package ejercicios.poo.ejercicio1;

public class cuadrilatero {
	//Atributos
	private float lado1;
	private float lado2;
	
	//Constructor
	public cuadrilatero(float lado1, float lado2) {
		this.lado1 = lado1;
		this.lado2 = lado2;
	}
	public cuadrilatero(float lado1) {
		this.lado1=this.lado2=lado1;
	}
	
	
	//Metodos
	public float perimetro() {
		float perimetro= 2*(lado1+lado2);
		return perimetro;
				
	}
	public float area() {
		float perimetro= lado1*lado2;
		return perimetro;
	}
	
}
