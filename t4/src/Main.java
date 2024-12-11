public class Main {
    public static void main(String[] args) {
        

        switch (menu.exercisesMenu()) {
            case 1:
                switch (menu.indexHomework()) {
                    case 1:
                        ejercicios.condicionales9();                
                        break;
                    case 2:
                        ejercicios.loops5();
                        break;
                    case 3:
                        ejercicios.loops9();
                        break;
                    case 4:
                        ejercicios.repaso21();
                        break;
                    default:
                        System.out.println("Not yet implemented.");
                        break;
            }
            break;

            case 2:
                switch (menu.indexClass()) {
                    case 1:
                        ejerciciosClase.arraySort();
                        break;
                    case 2:
                        ejerciciosClase.arraySortTwo();
                        break;
                    case 3:
                        ejerciciosClase.printMatrix();
                        break;
                    case 4:
                        ejerciciosClase.maxPosition();
                        break;
                    case 5:
                        ejerciciosClase.maxSum();
                        break;
                    case 6:
                        ejerciciosClase.vehicles();
                        break;
                    default:
                        System.out.println("Not yet implemented.");
                        break;
                }
                break;
        
            case 3:
                switch (menu.indexUT4()) {
                    case 1:
                        ejerciciosUT4.ejercicio1();
                        break;
                    case 2:
                        ejerciciosUT4.ejercicio2();
                        break;
                    case 3:
                        ejerciciosUT4.ejercicio3();
                        break;
                    case 4:
                        ejerciciosUT4.ejercicio4();
                        break;
                    case 5:
                        ejerciciosUT4.ejercicio5();
                        break;
                    case 6:
                        ejerciciosUT4.ejercicio6();
                        break;
                    case 7:
                        ejerciciosUT4.ejercicio7();
                        break;
                    case 8:
                        ejerciciosUT4.ejercicio8();
                        break;
                    case 9:
                        ejerciciosUT4.ejercicio9();
                        break;
                    case 10:
                        ejerciciosUT4.ejercicio10();
                        break;
                    case 11:
                        ejerciciosUT4.ejercicio11();
                        break;
                    case 12:
                        ejerciciosUT4.ejercicio12();
                        break;
                    case 13:
                        UT4EJ13.ejercicio13complex();
                        break;
                    case 14:
                        ejerciciosUT4.ejercicio14();
                        break;
                    case 15:
                        ejerciciosUT4.ejercicio15();
                        break;
                    case 16:
                        ejerciciosUT4.ejercicio16();
                        break;
                    case 17:
                        ejerciciosUT4.ejercicio17();
                        break;
                    case 18:
                        ejerciciosUT4.ejercicio18();
                        break;
                    default:
                        System.out.println("Out of Range.");
                        break;
                }
                break;

            default:
                break;

        }
                
                
    }

}