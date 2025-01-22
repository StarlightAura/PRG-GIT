package examples;

public class EjemploCadenas {
    public static void main(String[] args) {
        // Crear una cadena de texto
        String saludo = "Hola, Mundo!";
        
        // Imprimir la cadena
        System.out.println(saludo);
        
        // Obtener la longitud de la cadena
        int longitud = saludo.length();
        System.out.println("Longitud de la cadena: " + longitud);
        
        // Convertir la cadena a mayúsculas
        String saludoMayusculas = saludo.toUpperCase();
        System.out.println("En mayúsculas: " + saludoMayusculas);
        
        // Convertir la cadena a minúsculas
        String saludoMinusculas = saludo.toLowerCase();
        System.out.println("En minúsculas: " + saludoMinusculas);
        
        // Obtener un carácter específico de la cadena (índice 0)
        char primerCaracter = saludo.charAt(0);
        System.out.println("Primer carácter: " + primerCaracter);
        
            // Verificar si la cadena contiene una palabra específica
            boolean contiene = saludo.contains("Mundo");
            System.out.println("¿Contiene 'Mundo'? " + contiene);
                
            // Comparar dos cadenas
            String otroSaludo = "Hola, Mundo!";
            boolean sonIguales = saludo.equals(otroSaludo);
            System.out.println("¿Son iguales las cadenas? " + sonIguales);
        }
    }