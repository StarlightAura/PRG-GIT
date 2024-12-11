import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

import daw.com.Teclado;

public class ejerciciosUT4 {

    private static Scanner rc = new Scanner(System.in);
    private static Random rand = new Random();

    public static void fillWithRandom(int[] v, int max, int length){
        for(int i = 0; i<length; i++){
            v[i] = rand.nextInt(max);
        }
    }

    public static void fillWithRandom(int[][] m, int max, int x, int y){
        for(int i = 0; i<x; i++){
            for(int j = 0; j<y; j++){
                m[i][j] = rand.nextInt(max);
            }
        }
    }

    public static void randomOption(int option, int[][] matrix, int x, int y){
        
        int max = 0;
        switch (option) {
            case 0:
                for(int i = 0; i<x; i++){
                    for(int j = 0; j<y; j++){
                        System.out.println("Introduce un numero en la posición (x: " + (i+1) + ", y: " + (j+1) + ")");
                        matrix[i][j] = rc.nextInt();
                    }
                }
                break;
            case 1:
                System.out.println("Introduce el límite superior a generar (el mínimo es 0):");
                max = rc.nextInt()+1;
                fillWithRandom(matrix, max, x, y);
                break;
            default:
                System.out.println("Opción no válida, asignando al azar por defecto.");
                System.out.println("Introduce el límite superior a generar (el mínimo es 0):");
                max = rc.nextInt()+1;
                fillWithRandom(matrix, max, x, y);
                break;
        }
    }

    public static void randomOption(int option, int[] vector, int length){
        int max = 0;
        switch (option) {
            case 0:
                for(int i = 0; i<length; i++){
                    System.out.println("Introduce un numero en la posición " + (i+1));
                    vector[i] = rc.nextInt();
                }
                break;
            case 1:
                System.out.println("Introduce el límite superior a generar (el mínimo es 0):");
                max = rc.nextInt()+1;
                fillWithRandom(vector, max, length);
                break;
            default:
                System.out.println("Opción no válida, asignando al azar por defecto.");
                System.out.println("Introduce el límite superior a generar (el mínimo es 0):");
                max = rc.nextInt()+1;
                fillWithRandom(vector, max, length);
                break;
        }
    }

    public static int randomOption(){
        System.out.println("¿Introducir numeros manualmente o al azar dentro de un rango?:");
        System.out.println("0: Manualmente");
        System.out.println("1: Azar");

        int option = rc.nextInt();
        return option;
    }

    public static int factorial(int n){
        if (n == 0) 
            return 0;
        else if (n == 1) 
            return 1;
        else 
            return n*factorial(n-1);
    }

    public static boolean checkPrime(int n){
        if (n <= 1)
            return false;

        // Check from 2 to sqrt(n)
        for (int i = 2; i <= Math.sqrt(n); i++)
            if (n % i == 0)
                return false;

        return true;
    }

    public static void ejercicio1(){
        for(int i = 0; i<4; i++){
            for(int j = 0; j<4; j++){
                if(i == j)
                    System.out.print(1.0);
                else
                    System.out.print(0.0);
            }
            System.out.println();
        }
    }

    public static void ejercicio2(){

        System.out.println("Introduce las dimensiones de la matriz:");
        int x = rc.nextInt();
        int y = rc.nextInt();
        int index = 0;
        int[][] location = new int[2][x*y];
        int[][] matrix = new int[x][y];

        randomOption(randomOption(), matrix, x, y);

        

        for(int i = 0; i<x; i++){
            for(int j = 0; j<y; j++){
                System.out.print(matrix[i][j]);
            }
            System.out.println();
        }

        System.out.println("Introduce el número a buscar: ");
        int s = rc.nextInt();

        for(int i = 0; i<x; i++){
            for(int j = 0; j<y; j++){
                if (matrix[i][j] == s){
                    location[0][index] = i+1;
                    location[1][index] = j+1;
                    index++;
                }
            }
        }

        for (int i = 0; i<index; i++){
            System.out.println("Se ha encontrado el número en las posiciones:");
            System.out.println("x: " + location[0][i] + ", y: " + location[1][i]);
        }
    }

    public static void ejercicio3(){
        System.out.println("Introduce la dimensión del array");
        int length = rc.nextInt();
        int[] vector = new int[length];
        randomOption(randomOption(), vector, length);
        int max = vector[0];
        int maxPos = 0;

        for (int i = 0; i<length; i++){
            if(vector[i] > max){
                max = vector[i];
                maxPos = i;
            }
        }
        System.out.println("El valor máximo es " + max + " y su posición en el array es: " + maxPos);
    }

    public static void ejercicio4(){
        int length = 5;
        int[] vector = new int[length];
        randomOption(randomOption(), vector, length);
        Arrays.sort(vector);

        System.out.println("El número mayor es " + vector[4] + ", el de en medio es " + vector[2] + " y el mayor es " + vector[0]);
        System.out.println("El array ordenado es: " + vector[0] + ", " + vector[1] + ", " + vector[2] + ", " + vector[3] + ", " + vector[4]);
        
    }

    public static void ejercicio5(){
        
        int length = 10;
        int[] vector = new int[length];
        int index = 0;

        for(int i = 100; i<=300; i++){
            if(checkPrime(i) && index<10){
                System.out.println(i);
                vector[index] = i;
                index++;
            }
        }

        System.out.print("Los 10 primeros números primos del 100 al 300 son: ");
        for(int i = 0; i<10; i++){
            if (i<9)
                System.out.print(vector[i] + ", ");
            else
                System.out.print(vector[i]);
        }
        System.out.println();

    }

    public static void ejercicio6(){
        int length = 10;
        int[] vector = new int[length];
        randomOption(randomOption(), vector, length);

        for(int i = 0; i<10; i++){
            int l = Integer.toString(vector[i]).length();
            if(Integer.parseInt(Integer.toString(vector[i]).substring(l-1, l)) == 4)
                System.out.print("Hay un número acabado en 4 en la posición " + (i+1));
        }
    }

    public static void ejercicio7(){
        int length = 10;
        int[] vector = new int[length];
        randomOption(randomOption(), vector, length);
        int max = vector[0];
        int rep = 0;

        for (int i = 0; i<length; i++){
            if(vector[i] > max)
                max = vector[i];
        }

        for(int i = 0; i<length; i++){
            if(vector[i] == max)
                rep++;
        }

        System.out.println("Se repite " + rep + " el número " + max);
        
    }

    public static void ejercicio8(){
        int length = 10;
        int[] vector = new int[length];
        randomOption(randomOption(), vector, length);
        int prom = 0;

        for(int i = 0; i<length; i++){
            prom += vector[i];
        }

        prom /= 10;

        for(int i = 0; i<length; i++){
            if(vector[i] == prom)
                System.out.println("El promedio está en el vector");
        }

    }

    public static void ejercicio9(){
        int length = 10;
        int[] vector = new int[length];
        randomOption(randomOption(), vector, length);

        int sumI = 0;
        int max = 0;

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

        System.out.println("La posición cuya suma de dígitos es mayor es: " + (max+1) + ", cuyo número es " + vector[max]);
    }

    public static void ejercicio10(){

        System.out.println("Introduce la cantidad de números a factorializar:");
        int length = rc.nextInt();
        int[] vector = new int[length];
        int[] vectorFactorial = new int[length];

        randomOption(randomOption(), vector, length);

        for(int i = 0; i<length; i++){
            vectorFactorial[i] = factorial(vector[i]);
        }

        for(int i = 0; i<length; i++){
            System.out.println("El factorial del número " + vector[i] + " es " + vectorFactorial[i]);
        }

    }

    public static void ejercicio11(){
        int length = 10;
        int[] vector = new int[length];
        randomOption(randomOption(), vector, length);

        for(int i = 0; i<length; i++){
            for(int j = 0; j<vector[i]; j++){
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    public static void ejercicio12(){
        System.out.println("Introduce la cantidad de estudiantes");
        int st = rc.nextInt();
        int[][] m = new int[st][4];
        int H = 0;
        int F = 0;
        int tH = 0;
        int tF = 0;
        float pH = 0;
        float pF = 0;
        float sueldoH = 0;
        float sueldoF = 0;

        for(int i = 0; i<st; i++){
            System.out.println("Introduce el ID");
            m[i][0] = rc.nextInt();
            System.out.println("Introduce el género (1 - masculino, 2 - femenino)");
            m[i][1] = rc.nextInt();
            System.out.println("Introduce si trabaja (1 - trabaja, 2 - no trabaja)");
            m[i][2] = rc.nextInt();
            System.out.println("Introduce el sueldo");
            m[i][3] = rc.nextInt();
        }

        for(int i = 0; i<st; i++){
            if (m[i][1] == 1) {
                H++;
            } else if (m[i][1] == 2){
                F++;
            }
        }

        pH = H/st;
        pF = F/st;

        for(int i = 0; i<st; i++){
            if (m[i][1] == 1 && m[i][2] == 1) {
                tH++;
                sueldoH += m[i][3];
            } else if (m[i][1] == 2 && m[i][2] == 1){
                tF++;
                sueldoF += m[i][3];
            }
        }

        sueldoH /= tH;
        sueldoF /= tF;

        System.out.println("El porcentaje de hombres en la universidad es " + pH);
        System.out.println("El porcentaje de mujeres en la universidad es " + pF);
        System.out.println("El porcentaje de hombres que trabajan es " + tH + " y el sueldo promedio es " + sueldoH);
        System.out.println("El porcentaje de mujeres que trabajan es " + tF + " y el sueldo promedio es " + sueldoF);

    }

    public static void ejercicio14(){
        System.out.println("Introduce las dimensiones del array: ");
        int x = rc.nextInt();
        int y = rc.nextInt();
        int[][] m = new int[x][y];

        System.out.println("Introduce el límite superior a generar (el mínimo es 0):");
        int max = rc.nextInt()+1;
        System.out.println();

        for(int i = 0; i<x; i++){
            for(int j = 0; j<y; j++){
                m[i][j] = rand.nextInt(max/2)*2;
            }
        }

        for(int i = 0; i<x; i++){
            for(int j = 0; j<y; j++){
                System.out.print(m[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("Elige una posicion X e Y: ");
        System.out.println(m[rc.nextInt()-1][rc.nextInt()-1]);

    }

    public static void ejercicio15(){

        System.out.println("Introduce las dimensiones de la matriz:");
        int x = 3;
        int y = 3;
        int[][] matrix = new int[x][y];
        int[][] reverseMatrix = new int[x][y];

        randomOption(randomOption(), matrix, x, y);

        for (int i = 0; i<x; i++){
            for(int j = 0; j<y; j++){
                reverseMatrix[i][j] = matrix[j][i];
            }
        }

        System.out.println("Matriz normal:");
        for (int i = 0; i<x; i++){
            for(int j = 0; j<y; j++){
                System.out.print(matrix[i][j] + " ");;
            }
            System.out.println();
        }

        System.out.println("Matriz traspuesta:");
        for (int i = 0; i<x; i++){
            for(int j = 0; j<y; j++){
                System.out.print(reverseMatrix[i][j] + " ");;
            }
            System.out.println();
        }

    }

    public static void ejercicio16(){
        String s = Teclado.leerString("Introduzca una frase: ");
        char c;
        int vowelCount = 0;
        for(int i = 0; i<s.length(); i++){
            c = s.substring(i, i+1).charAt(0);
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u')
                vowelCount++;
        }
        System.out.println("Hay " + vowelCount + " vocales.");
    }

    public static void ejercicio17(){
        System.out.println("no nos dio tiempo profe");
    }

    public static void ejercicio18(){
        System.out.println("no nos dio tiempo profe");
    }
    

}
