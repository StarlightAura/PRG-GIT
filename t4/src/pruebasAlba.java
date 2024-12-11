import bibliotecas.*;
public class pruebasAlba { //librería de Alba

    public static void main(String[] args) {
        ejercicio7();
    }

    public static void ejercicio1(){ //funciona correctamente, pero no pide un int como argumento
        if(Libreria.esPrimo()) System.out.println("Es primo.");
        else System.out.println("No es primo");
    }

    public static void ejercicio2(){ //funciona correctamente, devuelve un 0 si da error (al introducir un carácter, por ejemplo)
        System.out.println(Libreria.leerEnteroPositivo());
    }

    public static void ejercicio3(){ //funciona correctamente, devuelve un 0 si está fuera del rango
        System.out.println(Libreria.leerEntreLimites(0, 9));
    }

    public static void ejercicio4(){ //funciona correctamente
        if(Libreria.esBisiesto()) System.out.println("Es bisiesto."); //el método funciona correctamente, pero no pide un int como argumento
        else System.out.println("No es bisiesto");
    }

    public static void ejercicio5(){ //funciona correctamente
        System.out.println(Libreria.generarAleatorio(-100, 100));
    }

    public static void ejercicio6(){ //funciona correctamente
        String[] s = Libreria.crearArrayString();
        int counter = 0;
        for(int i = 0; i<s.length; i++) counter++;
        System.out.println(counter);
    }

    public static void ejercicio7(){ //funciona correctamente
        int[] s = Libreria.crearArrayInt();
        int counter = 0;
        for(int i = 0; i<s.length; i++) counter++;
        System.out.println(counter);
    }
}