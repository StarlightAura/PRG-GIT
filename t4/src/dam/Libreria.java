package dam;
import java.util.Scanner;

public class Libreria {

    private static Scanner rc = new Scanner(System.in);

    public static boolean esPrimo(int n){
        if (n <= 1)
            return false;

        // Check from 2 to sqrt(n)
        for (int i = 2; i <= Math.sqrt(n); i++)
            if (n % i == 0)
                return false;

        return true;
    }

    public static int leerEnteroPositivo(){
        int n;
        do{
            n = rc.nextInt();
        }while(n <= 0);
        return n;
    }

    public static int leerEntreLimites(int min, int max){
        int n = leerEnteroPositivo();
        if (n >= min && n <= max)
            return n;
        else
            return 0;
    }

    public static boolean esBisiesto (int year){
        return ((year % 4 == 0 && !(year % 100 == 0)) || year % 400 == 0);
    }

    public static int generarAleatorio(int min, int max){
        return (int) (Math.random() * (max-min)) + min;
    }

    public static String[] crearArrayString(){
        System.out.println("¿Longitud del array?");
        int l = rc.nextInt();
        String[] s = new String[l];
        return s;
    }

    public static int[] crearArrayInt(){
        System.out.println("¿Longitud del array?");
        int l = rc.nextInt();
        int[] s = new int[l];
        return s;
    }

}
