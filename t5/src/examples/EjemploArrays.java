package examples;

public class EjemploArrays {
    public static void main(String[] args) {
        // Declarar un array de enteros
        int[] numeros = {1, 2, 3, 4, 5};
 
        // Imprimir los elementos del array usando un bucle for
        System.out.println("Elementos del array:");
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Elemento en el índice " + i + ": " + numeros[i]);
        }
 
        // Cambiar el valor de un elemento en el array
        numeros[2] = 10;
 
        // Imprimir el array después de modificar un valor
        System.out.println("\nArray después de modificar el valor en el índice 2:");
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Elemento en el índice " + i + ": " + numeros[i]);
        }
        
        // Crear un array de cadenas (Strings)
        String[] frutas = {"Manzana", "Banano", "Cereza"};
        
        // Imprimir los elementos del array de frutas
        System.out.println("\nFrutas:");
        for (String fruta : frutas) {
            System.out.println(fruta);
        }
    }
}