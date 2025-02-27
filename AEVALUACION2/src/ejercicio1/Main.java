package ejercicio1;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Coche> listaCoches = new ArrayList<Coche>();

        Coche coche1 = new Coche("Toyota", "Corolla", 2020, "Rojo");
        Coche coche2 = new Coche("Honda", "Civic", 2019, "Azul");
        Coche coche3 = new Coche("Ford", "Focus", 2021, "Negro");

        listaCoches.add(coche1);
        listaCoches.add(coche2);
        listaCoches.add(coche3);

        Coche.mostrarListaCoches(listaCoches);
    }
}
