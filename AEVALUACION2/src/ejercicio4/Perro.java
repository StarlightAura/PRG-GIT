package ejercicio4;

public class Perro extends Animal {

	public Perro(String nombre) {
		super(nombre);
	}
	
	@Override
	public void hacerSonido(){
		System.out.println(this.getNombre() + " dice: Guau Guau!");
	}
}
