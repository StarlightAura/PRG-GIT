package ejercicio3;
import java.util.ArrayList;

public class TestProducto {

	public static void main(String[] args) {
		
		ArrayList<Producto> inventario = new ArrayList<Producto>(); 
		
		Producto p1 = new Producto("Camiseta", 20.0, 50);
		inventario.add(p1);
		
		p1.mostrarInfo();
		System.out.println();
		p1.setNombre("Pantalón");
		p1.setPrecio(25.0);
		p1.setStock(30);
		p1.aplicarDescuento(10);
		
		System.out.println();
		System.out.println("Productos en el inventario:");
		System.out.println(inventario);
		
		
		
	}
}
