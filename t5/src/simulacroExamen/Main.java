package simulacroExamen;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Coche> listaCoches = new ArrayList<Coche>();

        Coche coche1 = new Coche("a", "a", 2025, "a");
        Coche coche2 = new Coche("b", "b", 2025, "b");
        Coche coche3 = new Coche("c", "c", 2025, "c");

        listaCoches.add(coche1);
        listaCoches.add(coche2);
        listaCoches.add(coche3);

        Coche auxCoche = new Coche(null, null, 0, null);
        auxCoche.mostrarListaCoches(listaCoches);

        System.out.println("Se han creado " + Coche.obtenerNumeroCoches());
    }
}
