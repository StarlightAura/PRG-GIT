package examples;

import java.util.Scanner;    // Para leer entradas del usuario
import java.util.Random;     // Para generar números aleatorios
import java.util.Date;       // Para trabajar con fechas
import java.text.SimpleDateFormat; // Para formatear fechas
import java.util.ArrayList;  // Para trabajar con listas dinámicas
public class EjemploBasico {
    public static void main(String[] args) {
        // Usando Scanner para leer datos del usuario
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese su nombre:");
        String nombre = scanner.nextLine();
        System.out.println("Ingrese su edad:");
        int edad = scanner.nextInt();
        
        // Usando Date y SimpleDateFormat para mostrar la fecha actual
        Date fechaActual = new Date();
        SimpleDateFormat formateador = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        System.out.println("Fecha y hora actual: " + formateador.format(fechaActual));
        
        // Usando Random para generar un número aleatorio
        Random random = new Random();
        int numeroAleatorio = random.nextInt(100) + 1; // Genera un número entre 1 y 100
        System.out.println("Número aleatorio generado: " + numeroAleatorio);
        
        // Usando ArrayList para almacenar una lista de nombres
        ArrayList<String> listaNombres = new ArrayList<>();
        listaNombres.add("Carlos");
        listaNombres.add("Ana");
        listaNombres.add("Pedro");
        listaNombres.add(nombre);
        
        System.out.println("Lista de nombres:");
        for (String n : listaNombres) {
            System.out.println(n);
        }
        // Finalizando el scanner
        scanner.close();
    }
}