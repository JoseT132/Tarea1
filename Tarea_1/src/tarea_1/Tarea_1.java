package tarea_1;

import static java.lang.System.exit;
import java.util.Scanner;

public class Tarea_1 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int op;
        System.out.println("Bienvenido que desea hacer?");
        System.out.println("1) Listas");
        System.out.println("2) Pilas");
        System.out.println("3) Colas");
        System.out.println("4) Arbol binario");
        System.out.println("5) Salir");
        System.out.print("Ingrese su opcion: ");
        op = entrada.nextInt();
        switch (op) {
            case 1:
                Listas listas = new Listas(0);
                listas.mainMenu();
                break;
            case 2:
                Pilas Pilas = new Pilas();
                Pilas.mainMenu2();
                break;
            case 3:
                Colas Colas = new Colas();
                Colas.mainMenu3();
                break;
            case 4:
                A_Binario A_Binario = new A_Binario();
                A_Binario.mainMenu4();
                break;
            case 5:
                exit(0);
                break;
            default:
                System.out.println("Opcion no valida");
                break;
        }
    }
}
