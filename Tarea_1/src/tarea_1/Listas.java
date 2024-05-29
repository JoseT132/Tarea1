package tarea_1;

import static java.lang.System.exit;
import java.util.Scanner;

public class Listas {

    int dato;
    Listas right;
    static Listas start, end;

    public static void main(String[] args) {
        Listas node = new Listas(0);
        node.mainMenu();
    }

    Listas(int data) {
        this.dato = data;
        this.right = null;
    }

    public void add(int dato) {
        Listas node = new Listas(dato);
        if (end == null) {
            end = node;
            start = node;
        } else {
            end.right = node;
            end = node;
        }
    }

    public void display() {
        Listas Inicio = start;
        System.out.println("Datos de los nodos:");
        while (Inicio != null) {
            System.out.print(Inicio.dato + " ");
            Inicio = Inicio.right;
        }
        System.out.println();

    }

    public void addNode() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el dato del nuevo nodo: ");
        int newData = scanner.nextInt();
        add(newData);
        System.out.println();
    }

    public void deleteNode(int data) {
        if (start == null) {
            System.out.println("La lista esta vacia");
            return;
        }
        Listas Inicio = start;
        Listas End = null;
        while (Inicio != null) {
            if (Inicio.dato == data) {
                if (End == null) {
                    start = Inicio.right;
                    if (start == null) {
                        end = null;
                    }
                } else {
                    End.right = Inicio.right;
                    if (Inicio.right == null) {
                        end = End;
                    }
                }
                System.out.println("Nodo con dato " + data + " eliminado correctamente");
                return;
            }
            End = Inicio;
            Inicio = Inicio.right;
        }
        System.out.println("Nodo con dato " + data + " no encontrado.");
    }

    public void mainMenu() {
        Scanner scanner = new Scanner(System.in);
        int op = 0, dataToDelete;
        while (op != 4) {
            System.out.println("Menu:");
            System.out.println("1) Mostrar nodos");
            System.out.println("2) Agregar un nuevo nodo");
            System.out.println("3) Eliminar un nodo");
            System.out.println("4) Salir");
            System.out.print("Seleccione una opcion: ");
            op = scanner.nextInt();
            switch (op) {
                case 1:
                    System.out.println();
                    System.out.println();
                    display();
                    break;
                case 2:
                    System.out.println();
                    addNode();
                    break;
                case 3:
                    System.out.println();
                    display();
                    System.out.println();
                    System.out.print("Ingrese el dato del nodo que desea eliminar: ");
                    dataToDelete = scanner.nextInt();
                    deleteNode(dataToDelete);
                    break;
                case 4:
                    exit(0);
                    break;
                default:
                    System.out.println("Opcion no existe en el menu");
                    exit(0);
                    break;

            }
        }
    }
}
