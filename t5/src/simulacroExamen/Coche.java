package simulacroExamen;

import java.util.ArrayList;

public class Coche {
    private String marca;
    private String modelo;
    private int anio;
    private String color;
    private static int contadorCoches = 0;

    public Coche(String brand, String model, int year, String color){
        this.marca = brand;
        this.modelo = model;
        this.anio = year;
        this.color = color;

        contadorCoches++;
    }

    public void mostrarInformacion(){
        System.out.println("Marca: " + this.marca + ", Modelo: " + this.modelo + ", Año: " + this.anio + ", Color: " + this.color);
    }

    public void mostrarListaCoches(ArrayList<Coche> listaCoches){
        for(Coche index: listaCoches){
            index.mostrarInformacion();
        }
    }

    public static int obtenerNumeroCoches(){
        return contadorCoches;
    }
}
