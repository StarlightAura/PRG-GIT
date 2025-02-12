package idek;

class EjemploParametros {
     // Método que intenta cambiar un tipo primitivo
    public static void modificarValor(int numero) {
        numero = 20; // Cambiamos el valor dentro del método
        System.out.println("Dentro del método (primitivo): " + numero);
    }
     // Método que modifica un atributo de un objeto
    public static void modificarReferencia(Objeto obj) {
        obj.valor = 50; // Modificamos el atributo del objeto
        System.out.println("Dentro del método (objeto): " + obj.valor);
    }
     // Método que intenta reasignar la referencia del objeto
    public static void reasignarReferencia(Objeto obj) {
        obj = new Objeto(); // Creamos una nueva referencia
        obj.valor = 100; // Cambiamos el valor del nuevo objeto
  2



        System.out.println("Dentro del método (nueva referencia): " + obj.valor);
    }

    public static void main(String[] args) {
        // Ejemplo con tipo primitivo
        int numero = 10;
        System.out.println("Antes del método (primitivo): " + numero);
        modificarValor(numero);
        System.out.println("Después del método (primitivo): " + numero);

        // Ejemplo con objeto
        Objeto obj = new Objeto();
        obj.valor = 30;
        System.out.println("\nAntes del método (objeto): " + obj.valor);
        modificarReferencia(obj);
        System.out.println("Después del método (objeto): " + obj.valor);

        // Intento de reasignar la referencia
        System.out.println("\nAntes del método (reasignar referencia): " + obj.valor);
        reasignarReferencia(obj);
        System.out.println("Después del método (reasignar referencia): " +
obj.valor);
    }
}
