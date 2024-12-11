import java.util.Scanner;
import java.util.Arrays;

public class ejerciciosClase {

    private static Scanner rc = new Scanner(System.in);

    public static void arraySort(){

        System.out.println("Introduzca la longitud del vector:");
        int length = rc.nextInt();

        int[] vector = new int[length];

        for (int i = 0; i < length; i++){
            System.out.println("Introduzca el valor de la posición " + (i+1));
            vector[i] = rc.nextInt();
        }

        rc.close();

        Arrays.sort(vector);

        for(int i = 0; i<length; i++)
            System.out.println(vector[i]);
        

    }

    public static void arraySortTwo(){

        System.out.println("Introduzca la longitud del vector:");
        int length = rc.nextInt();

        int[] vector = new int[length];

        for (int i = 0; i < length; i++){
            System.out.println("Introduzca el valor de la posición " + (i+1));
            vector[i] = rc.nextInt();
        }

        rc.close();

        int min;

        for(int i = 0; i<length; i++){
            for(int j = 0; j<length; j++){
                if (vector[i] < vector[j]) {
                    min = vector[i];
                    vector[i] = vector[j];
                    vector[j] = min;
                }
            }
        }
        for(int i = 0; i<length; i++)
            System.out.println(vector[i]);
    }

    

    public static void printMatrix(){
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 5; j++){
                System.out.print(Integer.toString(i+1)+Integer.toString(j+1)+" ");
            }
            System.out.println();
        }
    }

    public static void maxPosition(){
        
        System.out.println("Introduzca la longitud del vector:");
        int length = rc.nextInt();

        int max = 0;
        int[] vector = new int[length];

        for (int i = 0; i < length; i++){
            System.out.println("Introduzca el valor de la posición " + (i+1));
            vector[i] = rc.nextInt();
            max = i;
        }
        rc.close();
        System.out.println("El número más alto está en la posición " + max);
    }

    public static void maxSum(){
        System.out.println("Introduzca la longitud del vector:");
        int length = rc.nextInt();

        int[] vector = new int[length];
        int sumI = 0;
        int max = 0;

        for (int i = 0; i < length; i++){
            System.out.println("Introduzca el valor de la posición " + (i+1));
            vector[i] = rc.nextInt();
        }
        rc.close();

        for (int i = 0; i<length; i++){
            sumI = 0;
            for(int j = 0; j<Integer.toString(vector[i]).length(); j++){
                sumI += Integer.parseInt(Integer.toString(vector[i]).substring(j, j+1)); //for fucks sake. substring needs the index for the start and the index+1 for the end
            }
            if (i == 0)
                max = sumI;
            else
                if (sumI > max)
                    max = i;
        }

        System.out.println("La posición cuya suma de dígitos es mayor es: " + (max+1));
    }

    public static void vehicles(){
        // Escribir un algoritmo que, a partir de leer y almacenar en vectores el valor comercial de 5 vehículos y su tipo
        // (familiar (1), público (2), de carga (3)), calcule y muestre el valor final basándonos en:

        // Para vehículos de valor superior a 100.000, cobrar IVA de 20%, para los demás el IVA es del 16%
        // Para vehículos tipo 1, con valor hasta 50.000, aplicar descuento equivalente al 50% del IVA cobrado
        // Para vehículos tipo 2 y 3, con valor superior a 80.000, aplicar sobrecosto por impuesto de rodamiento del 5%
        // Para todos los vehículos, si el valor final es inferior a 80.000, aplicar descuento adicional del 5% del valor comercial


        float[][] vehicles = new float[2][5];

        System.out.println("");

        for(int i = 0; i<5; i++){
            System.out.println("Introduce el tipo de vehículo:");
            vehicles[0][i] = rc.nextInt();
            System.out.println("Introduce el precio de vehículo:");
            vehicles[1][i] = rc.nextInt();
        }


    }
}
