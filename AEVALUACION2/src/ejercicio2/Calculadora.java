package ejercicio2;

public class Calculadora {
	
	private static int ContadorOperaciones = 0;
	
	
	public static int suma(int a, int b) {
		ContadorOperaciones++;
		return a+b;
	}
	public static int resta(int a, int b) {
		ContadorOperaciones++;
		return a-b;
	}
	
	public int multiplica(int a, int b) {
		ContadorOperaciones++;
		return a*b;
	}
	
	public double divide(int a, int b) {
		ContadorOperaciones++;
		return a/b;
	}
	
	public static int ObtenerNumeroOperaciones() {
		return ContadorOperaciones;
	}
	
}
