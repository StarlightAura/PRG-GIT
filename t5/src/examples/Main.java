package examples;


// Clase padre: Vehiculo
class Vehiculo {
private String marca;
private String modelo;
 
// Constructor
public Vehiculo(String marca, String modelo) {
this.marca = marca;
this.modelo = modelo;
}
 
// Método que puede ser sobrescrito
public void mostrarDetalles() {
System.out.println("Vehículo marca: " + marca + ", modelo: " + modelo);
}
}
 
// Clase hija: Turismo
class Turismo extends Vehiculo {
private int numeroPuertas;
 
// Constructor
public Turismo(String marca, String modelo, int numeroPuertas) {
super(marca, modelo);
this.numeroPuertas = numeroPuertas;
}
 
@Override
public void mostrarDetalles() {
super.mostrarDetalles();
System.out.println("Es un turismo con " + numeroPuertas + " puertas.");
}
}
 
// Clase hija: Camion
class Camion extends Vehiculo {
private double capacidadCarga;
 
// Constructor
public Camion(String marca, String modelo, double capacidadCarga) {
super(marca, modelo);
this.capacidadCarga = capacidadCarga;
}
 
@Override
public void mostrarDetalles() {
super.mostrarDetalles();
System.out.println("Es un camión con capacidad de carga de " + capacidadCarga + " toneladas.");
}
}
 
// Clase hija: Moto
class Moto extends Vehiculo {
private boolean tieneSidecar;
 
// Constructor
public Moto(String marca, String modelo, boolean tieneSidecar) {
super(marca, modelo);
this.tieneSidecar = tieneSidecar;
}
 
@Override
public void mostrarDetalles() {
super.mostrarDetalles();
System.out.println("Es una moto" + (tieneSidecar ? " con sidecar." : " sin sidecar."));
}
}
 
// Clase principal para demostrar polimorfismo dinámico
 
public class Main {
 
public static void main(String[] args) {
// TODO Auto-generated method stub
Vehiculo vehiculo1 = new Turismo("Toyota", "Corolla", 4);
Vehiculo vehiculo2 = new Camion("Volvo", "FH16", 18.0);
Vehiculo vehiculo3 = new Moto("Harley-Davidson", "Sportster", false);
 
// Uso de polimorfismo dinámico
Vehiculo[] vehiculos = {vehiculo1, vehiculo2, vehiculo3};
 
for (Vehiculo vehiculo : vehiculos) {
vehiculo.mostrarDetalles();
System.out.println();
}
}
 
}