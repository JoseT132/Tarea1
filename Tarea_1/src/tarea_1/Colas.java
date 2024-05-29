package tarea_1;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Colas {

    public static void main(String[] args) {
        Colas cola = new Colas();
        cola.mainMenu3();
    }

    public void mainMenu3() {
        Scanner entrada = new Scanner(System.in);
        Queue<Numero> cola = new LinkedList<>();
        Queue<Numero> cola2 = new LinkedList<>();
        int Cant, i = 0, Op = 0;
        String Numero;

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
                    System.out.println("Cuantos Numero va a ingresar?");
                    Cant = entrada.nextInt();

                    while (i < Cant) {
                        i = i + 1;
                        System.out.println("Ingrese el Nombre del Alumno " + i + " : ");
                        Numero = entrada.next();

                        Numero numero = new Numero(Numero);
                        cola.add(numero);
                        cola2.add(numero);
                    }
                    break;
                case 2:
                    System.out.println("Contenido de la cola:");
                    while (!cola.isEmpty()) {
                        Numero numero = cola.poll();
                        System.out.print(numero.getNumero());
                        System.out.print(" ");
                    }
                    System.out.println(" ");
                    break;
                case 3:
                    int tamaniocola = cola2.size();
                    while (!cola2.isEmpty()) {
                        System.out.println("Tamanio cola = " + tamaniocola);
                        System.out.println("Atendiendo a un numero de la cola..." + cola2);
                        System.out.println("Extrayendo... " + cola2.peek().toString());

                        try {
                            Thread.sleep(4000);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }

                        cola2.poll();
                        tamaniocola = cola2.size();
                    }

                    System.out.println("La cola esta vacia: " + cola2);
                    break;
            }
        }
    }
}
