package ejercicio1;

import java.util.ArrayList;

public class Coche {
    private String marca;
    private String modelo;
    private int anio;
    private String color;

    public Coche(String brand, String model, int year, String color){
        this.marca = brand;
        this.modelo = model;
        this.anio = year;
        this.color = color;
    }

    public void mostrarInformacion(){
        System.out.println("Marca: " + this.marca);
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Año: " + this.anio);
        System.out.println("Color: " + this.color);
        System.out.println();
    }

    public static void mostrarListaCoches(ArrayList<Coche> listaCoches){
        for(Coche index: listaCoches){
            index.mostrarInformacion();
        }
    }
}
