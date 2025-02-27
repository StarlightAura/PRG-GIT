package ejercicio3;

public class Producto {
	private String nombre;
	private double precio;
	private int stock;
	
	public Producto(String nombre, double precios, int stock) {
		this.nombre = nombre;
		this.precio = precios;
		this.stock = stock;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
		System.out.println("Producto modificado: " + this.nombre);
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
		System.out.println("Nuevo precio: " + this.precio);
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
		System.out.println("Nuevo stock disponible: " + this.stock);
	}
	
	public void aplicarDescuento(double porcentaje) {
		if(porcentaje > 0 && porcentaje <= 100) {
			this.precio -= this.precio * (porcentaje/100);
			System.out.println("Precio después de aplicar descuento: " + this.precio);
		}
		
	}

	public void mostrarInfo() {
		System.out.println("Producto: " + this.nombre);
		System.out.println("Precio original: " + this.precio);
		System.out.println("Stock disponible: " + this.stock);
	}
	
	@Override
	public String toString() {
		return "Producto: " + nombre + ", precio:" + precio + ", stock:" + stock;
	}
	
}
