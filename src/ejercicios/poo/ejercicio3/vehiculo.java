package ejercicios.poo.ejercicio3;

public class vehiculo {
	//atributos
	private String marca;
	private String modelo;
	private float precio;
	
	//constructor
	public vehiculo(String marca, String modelo, float precio) {

		this.marca = marca;
		this.modelo = modelo;
		this.precio = precio;
	}

	public float getPrecio() {
		return precio;
	}

	public String mostrarDatos(){
		return "marca : "+marca
			+"\nModelo: "+modelo
			+"\nprecio: "+precio
			+"\n";
	}
}
