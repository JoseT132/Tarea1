package tarea_1;

import static java.lang.System.exit;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class A_Binario {

    int dato;
    A_Binario right, left;

    public static void main(String[] args) {
        A_Binario aBinario = new A_Binario();
        aBinario.mainMenu4();
    }

    A_Binario() {
        this.dato = 0;
        this.right = null;
        this.left = null;
    }

    public void mainMenu4() {
        Scanner entrada = new Scanner(System.in);
        Queue<A_Binario> cola = new LinkedList<>();
        int Cant, i = 0, Op = 0;
        A_Binario raiz = null;

        while (Op != 4) {
            System.out.println("Menu:");
            System.out.println("1) Ingresar numeros");
            System.out.println("2) Mostrar ordenes");
            System.out.println("3) Eliminar numero");
            System.out.println("4) Salir");
            System.out.println("Seleccione una opcion: ");
            Op = entrada.nextInt();
            switch (Op) {
                case 1:
                    System.out.println("Cuantos nunmeros va a ingresar?");
                    Cant = entrada.nextInt();
                    i = 0;
                    while (i < Cant) {
                        i++;
                        System.out.println("Ingrese el nunmero " + i + " : ");
                        int num = entrada.nextInt();
                        A_Binario nuevoNodo = new A_Binario();
                        nuevoNodo.dato = num;
                        cola.add(nuevoNodo);
                    }

                    raiz = cola.poll();

                    while (!cola.isEmpty()) {
                        A_Binario nodo = cola.poll();
                        if (nodo.dato < raiz.dato) {
                            if (raiz.left == null) {
                                raiz.left = nodo;
                            } else {
                                insertarNodo(raiz.left, nodo);
                            }
                        } else {
                            if (raiz.right == null) {
                                raiz.right = nodo;
                            } else {
                                insertarNodo(raiz.right, nodo);
                            }
                        }
                    }
                    break;
                case 2:
                    if (raiz != null) {
                        System.out.println("Recorrido en preorden:");
                        preorden(raiz);
                        System.out.println("Recorrido en postorden:");
                        postorden(raiz);
                        System.out.println("Recorrido en inorden:");
                        inorden(raiz);
                    } else {
                        System.out.println("No hay numeros ingresados.");
                    }
                    break;
                case 3:

                    break;
                case 4:
                    exit(0);
                    break;
                default:
                    System.out.println("Opción no valida");
                    break;
            }

        }
    }

    private void insertarNodo(A_Binario raiz, A_Binario nodo) {
        if (nodo.dato < raiz.dato) {
            if (raiz.left == null) {
                raiz.left = nodo;
            } else {
                insertarNodo(raiz.left, nodo);
            }
        } else {
            if (raiz.right == null) {
                raiz.right = nodo;
            } else {
                insertarNodo(raiz.right, nodo);
            }
        }
    }

    private void preorden(A_Binario nodo) {
        if (nodo != null) {
            System.out.print(nodo.dato + " ");
            preorden(nodo.left);
            preorden(nodo.right);
            System.out.print(nodo.dato + " ");
        }
    }

    private void postorden(A_Binario nodo) {
        if (nodo != null) {
            postorden(nodo.left);
            postorden(nodo.right);
            System.out.print(nodo.dato + " ");
        }
    }

    private void inorden(A_Binario nodo) {
        if (nodo != null) {
            inorden(nodo.left);
            System.out.print(nodo.dato + " ");
            inorden(nodo.right);
        }
    }

}
