package ejercicio2;

public class TestCalculadora {

	public static void main(String[] args) {
		
		Calculadora aux = new Calculadora();
		
		System.out.println("Suma: " + Calculadora.suma(10, 5));
		System.out.println("Resta: " + Calculadora.resta(10, 5));
		System.out.println("Multiplicación: " + aux.multiplica(10, 5));
		System.out.println("División: " + aux.divide(10, 5));
		System.out.println("Número total de operaciones: " + Calculadora.ObtenerNumeroOperaciones());
	}

}
