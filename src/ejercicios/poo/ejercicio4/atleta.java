package ejercicios.poo.ejercicio4;

public class atleta {
	
	private int numero;
	private String nombre;
	private float tiempo;

	public atleta(int numero, String nombre, float tiempo) {
		this.numero = numero;
		this.nombre = nombre;
		this.tiempo = tiempo;
	}
	
	public float getTiempo() {
		return tiempo;
	}

	public void setTiempo(float tiempo) {
		this.tiempo = tiempo;
	}

	public String mostrarDatos() {
		return "N° Atleta: "+numero+
				"\nNombre: "+nombre+
				"\nTiempo: "+tiempo;
	}	
}
