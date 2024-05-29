package tarea_1;

import java.util.LinkedList;
import java.util.Scanner;
import java.util.Stack;

public class Pilas {

    public static void main(String[] args) {
        Pilas pilas = new Pilas();
        pilas.mainMenu2();
    }

    public void mainMenu2() {
        Scanner entrada = new Scanner(System.in);
        Stack<Numero> pila = new Stack<>();
        Stack<Numero> pila2 = new Stack<>();
        int Cant, i = 0, Op = 0;
        String Num;
        while (Op != 4) {
            System.out.println("Menu:");
            System.out.println("1) Ingresar Numero");
            System.out.println("2) Ver Numero");
            System.out.println("3) Eliminar Numero");
            System.out.println("4) Salir");
            System.out.print("Seleccione una opcion: ");
            Op = entrada.nextInt();
            switch (Op) {
                case 1:
                    System.out.println("Cuantos  numero va a ingresar?");
                    Cant = entrada.nextInt();

                    while (i < Cant) {
                        i = i + 1;
                        System.out.println("Ingrese el Numero " + i + " : ");
                        Num = entrada.next();
                        Numero numero = new Numero(Num);
                        pila.push(numero);
                        pila2.push(numero);
                    }
                    break;
                case 2:
                    System.out.println("Contenido de la pila:");
                    while (!pila.isEmpty()) {
                        Numero numero = pila.pop();
                        System.out.print(numero.getNumero());
                        System.out.print(" ");

                    }
                    System.out.println(" ");
                    break;
                case 3:
                    while (!pila2.empty()) {
                        System.out.println("Sacando el Numero de la pila...");
                        System.out.println("Sacando...  " + pila2.peek().toString());
                        try {
                            Thread.sleep(4000);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        pila2.pop();
                    }

                    System.out.println("La pila esta vacia: " + pila2);
                    break;

            }
        }
    }
}
