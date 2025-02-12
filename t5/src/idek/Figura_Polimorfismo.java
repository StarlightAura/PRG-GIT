//Clase abstracta Forma
package idek;

abstract class Forma {
 protected double area;

 public double getArea() {
 return area;
 }

 public abstract void calcularArea();
}

//Clase hija Circulo
class Circulo extends Forma {
 private double radio;

 public Circulo(double radio) {
 this.radio = radio;
 }

 @Override
 public void calcularArea() {
 area = Math.PI * Math.pow(radio, 2);
 }
}

//Clase hija Rectangulo
class Rectangulo extends Forma {
 private double largo;
 private double ancho;

 public Rectangulo(double largo, double ancho) {
 this.largo = largo;
 this.ancho = ancho;
 }

 @Override
 public void calcularArea() {
 area = largo * ancho;
 }
}

//Clase hija Cuadrado
class Cuadrado extends Forma {
 private double lado;

 public Cuadrado(double lado) {
 this.lado = lado;
 }

 @Override
 public void calcularArea() {
 area = Math.pow(lado, 2);
 }
}

//Clase principal para probar el código
public class Figura_Polimorfismo {
 public static void main(String[] args) {
 Forma circulo = new Circulo(5);
 circulo.calcularArea();
 System.out.println("Área del círculo: " + circulo.getArea());

 Forma rectangulo = new Rectangulo(4, 7);
 rectangulo.calcularArea();
 System.out.println("Área del rectángulo: " + rectangulo.getArea());

 Forma cuadrado = new Cuadrado(3);
 cuadrado.calcularArea();
 System.out.println("Área del cuadrado: " + cuadrado.getArea());
 }
}
