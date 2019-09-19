package ejercicios.poo.ejercicio5;

public class triangulo {
	private double base;
	private double lado;
	
	public triangulo(double base, double lado) {
		this.base = base;
		this.lado = lado;
	}

	public double obtenerPerimetro() {
		// TODO Auto-generated constructor stub
		double perimetro=((2*lado)+base);
		return perimetro;
	}
	
	public double obtenerArea() {
		// TODO Auto-generated constructor stub
		double area=(base*Math.sqrt((lado*lado)-((base*base)/4)))/2;
		return area;
	}
	public String mostrarDatos() {
		// TODO Auto-generated constructor stub
		return "Base: "+base+
			   "\nLado: "+lado+
			   "\nPerimetro: "+obtenerPerimetro()+
			   "\nArea: "+obtenerPerimetro()+
			   "\n";
	}
}
