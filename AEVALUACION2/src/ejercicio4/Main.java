package ejercicio4;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		
		ArrayList<Animal> lista = new ArrayList<>();
		
		Cuidador Villablanca = new Cuidador();
		Perro DAM = new Perro("DAM");
		Gato DAW = new Gato("DAW");
		lista.add(DAM);
		lista.add(DAW);
		
		DAM.hacerSonido();
		DAW.hacerSonido();
		
		Villablanca.cuidarAnimales();
		
		System.out.println("Lista de animales haciendo sonidos:");
		for(Animal a: lista) {
			a.hacerSonido();
		}

	}

}
