import java.util.Scanner;

public class menu {

    private static Scanner rc = new Scanner(System.in);

    public static int exercisesMenu(){

        System.out.println("¿Ejercicios de deberes o de clase?");
        System.out.println("Ejercicios de deberes: [1]");
        System.out.println("Ejercicios de clase: [2]");
        System.out.println("Ejercicios tema 4: [3]");;

        return option();

    }

    public static int indexHomework(){
        System.out.println("Elige ejercicio:");
        System.out.println("Condicionales, ejercicio 9: [1]");
        System.out.println("Repetitivas, ejercicio 5: [2]");
        System.out.println("Repetitivas, ejercicio 9: [3]");
        System.out.println("Repaso, ejercicio 21: [4]");

        return option();
    }

    public static int indexClass(){

        System.out.println("Ejercicio de clase, Arrays Sort: [1]");
        System.out.println("Ejercicio de clase, Arrays Sort sin función: [2]");
        System.out.println("Ejercicio de clase, Arrays Imprimir Matriz: [3]");
        System.out.println("Ejercicio de clase, Arrays Número Mayor: [4]");
        System.out.println("Ejercicio de clase, Arrays Suma Dígitos: [5]");
        System.out.println("Ejercicio de clase, Arrays Vehículos: [6]");
        System.out.println("---------------------------------");

        return option();
        
    }

    public static int indexUT4(){
        System.out.println("Número de ejercicio (1-18):");
        System.out.println("---------------------------------");

        return option();
    }

    public static int option(){
        String optionString = rc.next();

        try {
            Integer.parseInt(optionString);
            return Integer.parseInt(optionString);
        } catch (Exception e) {
            return -1;
        }
    }

}
