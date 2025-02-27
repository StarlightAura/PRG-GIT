package ejercicio4;

public class Cuidador {
	
	Perro DAM = new Perro("DAM");
	Gato DAW = new Gato("DAW");
	
	public void cuidarAnimales(){
		System.out.println("Cuidando a los animales...");
		DAM.hacerSonido();
		DAW.hacerSonido();
	}
}
