package ejercicio4;

public abstract class Animal {
	private String nombre;
	
	public Animal(String nombre) {
		this.setNombre(nombre);
	}
	
	public abstract void hacerSonido();

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
}
