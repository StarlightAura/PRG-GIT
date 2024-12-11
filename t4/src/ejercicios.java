
import java.util.Scanner;

public class ejercicios {

    private static Scanner rc = new Scanner(System.in);

    public static void condicionales9(){

        //Que lea una hora en hora:minutos:segundos y diga la hora que es un segundo después.
        
        System.out.println("Introduce la hora (hora:minuto:segundo)");
        Scanner rc = new Scanner(System.in);
        String time = rc.next();
        rc.close();

        String[] timeArray = time.split(":");

        //timeArray[0] -> hours
        //timeArray[1] -> minutes
        //timeArray[2] -> seconds

        int hours = Integer.parseInt(timeArray[0]);
        int minutes = Integer.parseInt(timeArray[1]);
        int seconds = Integer.parseInt(timeArray[2]);

        if (seconds == 59) {
            seconds = 0;
            minutes++;
            if (minutes == 60) {
                minutes = 0;
                hours++;
                if (hours == 24) {
                    hours = 0;
                }
            }
        }

        timeArray[0] = Integer.toString(hours);
        timeArray[1] = Integer.toString(minutes);
        timeArray[2] = Integer.toString(seconds);

        if (hours < 10)
            timeArray[0] = "0" + timeArray[0];
        if (minutes < 10)
            timeArray[1] = "0" + timeArray[1];
        if (seconds < 10)
            timeArray[2] = "0" + timeArray[2];

        System.out.println(timeArray[0] + ":" + timeArray[1] + ":" + timeArray[2]);

    }

    public static void loops5(){

        int workers = 0;
        int sueldo = 0;

        System.out.println("Número de trabajadores:");
        workers = rc.nextInt();

        int rich = 0;
        int total = 0;

        for(int i = 0; i < workers; i++){
            System.out.println("Escribe el sueldo del trabajador nº " + (i+1));

            sueldo = rc.nextInt();

            if (sueldo >= 500) {
                rich++;
            }
            total += sueldo;
        }

        rc.close();
        System.out.println(rich + " trabajadores cobran 500€ o más.");
        System.out.println(workers - rich + " trabajadores cobran menos de 500€");
        System.out.println("La empresa se gasta " + total + "€ en trabajadores");

    }

    public static void loops9(){

        //9. Realizar un programa que pida ingresar dos datos enteros (coordenadas x e y). Al comenzar
        //el programa se pedirá ingresar el total de puntos a procesar. Informar de cuantos puntos se
        //han ingresado en cada uno de los cuatro cuadrantes.

        // Q2 | Q1
        // ---+---
        // Q3 | Q4

        System.out.println("Número de puntos:");
        Scanner rc = new Scanner(System.in);
        int n = rc.nextInt();
        int[][] points = new int[n][2];

        int[] quadrants = new int[9];

        //x -> number of points
        //2 -> x and y coordinates

        //0 -> Q1 (X+,Y+)
        //1 -> Q2 (X-,Y+)
        //2 -> Q3 (X-,Y-)
        //3 -> Q4 (X+,Y-)
        //4 -> X+ (X+,0)
        //5 -> X- (X-,0)
        //6 -> Y+ (0,Y+)
        //7 -> Y- (0,Y-)
        //8 -> (0,0)

        
        for(int i = 0; i < n; i++){

            System.out.println("Coordenada X del punto " + (i+1));
            points[i][0] = rc.nextInt();
            System.out.println("Coordenada Y del punto " + (i+1));
            points[i][1] = rc.nextInt();

        }

        rc.close();

        for(int i = 0; i < n; i++){

            if (points[i][0] > 0 && points[i][1] > 0)
                quadrants[0]++;
            else if (points[i][0] < 0 && points[i][1] > 0) 
                quadrants[1]++;
            else if (points[i][0] < 0 && points[i][1] < 0) 
                quadrants[2]++;
            else if (points[i][0] > 0 && points[i][1] < 0) 
                quadrants[3]++;
            else if (points[i][0] > 0 && points[i][1] == 0) 
                quadrants[4]++;
            else if (points[i][0] < 0 && points[i][1] == 0) 
                quadrants[5]++;
            else if (points[i][0] == 0 && points[i][1] > 0) 
                quadrants[6]++;
            else if (points[i][0] == 0 && points[i][1] < 0) 
                quadrants[7]++;
            else if (points[i][0] == 0 && points[i][1] == 0) {
                quadrants[8]++;
            }
        }
        
        System.out.println("Se han ingresado " + quadrants[0] + " puntos en el primer cuadrante.");
        System.out.println("Se han ingresado " + quadrants[1] + " puntos en el segundo cuadrante.");
        System.out.println("Se han ingresado " + quadrants[2] + " puntos en el tercer cuadrante.");
        System.out.println("Se han ingresado " + quadrants[3] + " puntos en el cuarto cuadrante.");

        System.out.println("Se han ingresado " + quadrants[4] + " puntos en el eje X positivo.");
        System.out.println("Se han ingresado " + quadrants[5] + " puntos en el eje X negativo.");
        System.out.println("Se han ingresado " + quadrants[6] + " puntos en el eje Y positivo.");
        System.out.println("Se han ingresado " + quadrants[7] + " puntos en el eje Y negativo.");

        System.out.println("Se han ingresado " + quadrants[8] + " puntos en el origen de coordenadas.");
    }

    public static void repaso21(){

        System.out.println("Introduce la fecha a comprobar (día/mes/año):");
        Scanner rc = new Scanner(System.in);
        String date = rc.next();
        rc.close();

        String[] dateArray = date.split("/");

        //dateArray[0] -> day
        //dateArray[1] -> month
        //dateArray[2] -> year

        int baseYear = 1583;
        int day = 0;
        int counter = 0;

        while (baseYear < Integer.parseInt(dateArray[2])) {
            if (baseYear % 400 == 0 || (baseYear % 4 == 0 && baseYear % 100 != 0))
                counter += 366;
            else
                counter += 365;
            baseYear++;
        }

        switch (Integer.parseInt(dateArray[1])) {
            case 1:
                break;
            case 2:
                counter += 31;
                break;
            case 3:
                counter += 31 + 28;
                break;
            case 4:
			    counter += 31 + 28 + 31;
                break;
		    case 5:
			    counter += 31 + 28 + 31 + 30;
                break;
		    case 6:
			    counter += 31 + 28 + 31 + 30 + 31;
                break;
 		    case 7:
			    counter += 31 + 28 + 31 + 30 + 31 + 30;
                break;
		    case 8:
			    counter += 31 + 28 + 31 + 30 + 31 + 30 + 31;
                break;
		    case 9:
			    counter += 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31;
                break;
		    case 10:
			    counter += 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + 30;
                break;
		    case 11:
			    counter += 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31;
                break;
		    case 12:
			    counter += 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31 + 30;
                break;
            default:
                System.out.println("Whut.");
                break;
        }

        if (baseYear % 400 == 0 || (baseYear % 4 == 0 && baseYear % 100 != 0))
            counter++;

        counter += Integer.parseInt(dateArray[0]) - 1;

        day = counter%7;

        switch (day) {
            case 0:
                System.out.println("Sábado");
                break;
            case 1:
                System.out.println("Domingo");
                break;
            case 2:
                System.out.println("Lunes");
                break;
            case 3:
                System.out.println("Martes");
                break;
            case 4:
                System.out.println("Miércoles");
                break;
            case 5:
                System.out.println("Jueves");
                break;
            case 6:
                System.out.println("Viernes");
                break;
            default:
                System.out.println("The Secret Eighth Day.");
                break;
        }

    }
    
}
