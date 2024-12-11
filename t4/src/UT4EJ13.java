import daw.com.Teclado;

public class UT4EJ13 {

    public static void ejercicio13complex(){ //5*4*5*6
        //timeslots exists in 20 minutes intervals (like the exam)
        //or not. let's try it first

        int o;
        String[][][][] sistema = new String[5][4][5][6];
        fillEmpty(sistema);
        
        do{
            o = menuUPM();
            switch (o) {
                case 1:
                    turns(sistema);
                    printSistema(sistema);
                    /*vuelos[flightCount][1] = Teclado.leerString();
                    vuelos[flightCount][2] = Integer.toString(flightCount+1);
                    vuelos[flightCount][3] = timeLogic(Integer.parseInt(vuelos[flightCount][2]));
                    flightCount++;*/
                    break;
                case 2:
                    computerPerRoom(sistema);
                    break;
                case 3:
                    totalTurnsReserved(sistema);
                    break;
                case 4:
                    System.out.println("Gracias por usar el programa.");
                    break;
                default:
                    System.out.println("La opción introducida no existe.");
                    break;
            }
        }while(o != 4);
    }

    public static void turns(String[][][][] sistema){
        System.out.println("1. Reservar turno");
        System.out.println("2. Cancelar reserva");

        int option = Teclado.leerInt();

        if (option == 1) {
            System.out.println("Introduzca la sala en la que quiere reservar turno:");
            int room = Teclado.leerInt()-1;
            printRoomTimeslots(sistema, room);
            System.out.println("Introduzca la fila en la que quiere reservar turno:");
            int row = Teclado.leerInt()-1;
            System.out.println("Introduzca el asiento de la fila en el que quiere reservar turno:");
            int column = Teclado.leerInt()-1;
            System.out.println("¿Cuántos turnos quieres reservar? (máximo " + getTimeslots(sistema, room, row, column) + ")");
            int turns = Teclado.leerInt();
            System.out.println("Introduce tu ID de estudiante, por favor.");
            String ID = Teclado.leerString();

            for(int i = 0; i<turns; i++){
                if (sistema[room][row][column][i] == "Empty") {
                    sistema[room][row][column][i] = ID;
                } else{
                    i++;
                }
            }


        } else if (option == 2) {
            System.out.println("Introduce tu ID de estudiante, por favor.");
            String ID = Teclado.leerString();
            for(int i = 0; i<5; i++){
                for(int j = 0; j<4; j++){
                    for(int k = 0; k<5; k++){
                        for(int l = 0; l<6; l++){
                            if (sistema[i][j][k][l].equals(ID)) {
                                sistema[i][j][k][l] = "Empty";
                            }
                        }
                    }
                }
            }
        }
    }

    public static void computerPerRoom(String[][][][] sistema){
        int freePC = 0;
        int timeslot = 0;

        for(int i = 0; i<5; i++){
            freePC = 0;
            for(int j = 0; j<4; j++){
                for(int k = 0; k<5; k++){
                    timeslot = 0;
                    for(int l = 0; l<6; l++){
                        if (sistema[i][j][k][l] == "Empty") {
                            timeslot++;
                        }
                    }
                    if (timeslot > 0) {
                        freePC++;
                    }
                }
            }
            System.out.println("En la sala " + (i+1) + " hay " + freePC + " ordenadores con un slot o más disponibles.");
        }
    }

    public static void totalTurnsReserved(String[][][][] sistema){
        int totalTurns = 0;

        for(int i = 0; i<5; i++){
            for(int j = 0; j<4; j++){
                for(int k = 0; k<5; k++){
                    for(int l = 0; l<6; l++){
                        if (sistema[i][j][k][l] != "Empty") {
                            totalTurns++;
                        }
                    }
                }
            }
        }

        System.out.println("Hay " + totalTurns + " turnos reservados en toda la Universidad");

    }

    public static int menuUPM(){

        System.out.println("1. Asignar o cancelar turno");
        System.out.println("2. Cantidad de equipos disponibles por sala");
        System.out.println("3. Cantidad de turnos asignados en toda la Universidad");
        System.out.println("4. Salir");

        int option = Teclado.leerInt();
        return option;

    }

    public static void printRoomTimeslots(String[][][][] sistema, int room){

        int timeslots;

        for(int i = 0; i<4; i++){
            for(int j = 0; j<5; j++){
                timeslots = 0;
                for(int k = 0; k<6; k++){
                    if (sistema[room-1][i][j][k] == "Empty"){
                        timeslots++;
                    }
                }
                System.out.print(timeslots + " ");
            }
            System.out.println();
        }


    }

    public static void fillEmpty(String[][][][] sistema){
        for(int i = 0; i<5; i++){
            for(int j = 0; j<4; j++){
                for(int k = 0; k<5; k++){
                    for(int l = 0; l<6; l++){
                        sistema[i][j][k][l] = "Empty";
                    }
                }
            }
        }
    }

    public static void printSistema(String[][][][] sistema){
        for(int i = 0; i<5; i++){
            System.out.println("Sala " + (i+1));
            for(int j = 0; j<6; j++){
                System.out.println("Turno " + (j+1));
                for(int k = 0; k<4; k++){
                    for(int l = 0; l<5; l++){
                        System.out.print(sistema[i][k][l][j] + " ");
                    }
                    System.out.println();
                }
            }
        }
    }

    public static int getTimeslots(String[][][][] sistema, int room, int row, int column){
        int timeslots = 0;
        for(int k = 0; k<6; k++){
            if (sistema[room-1][row][column][k] == "Empty"){
                timeslots++;
            }
        }
        return timeslots;
    }

}
