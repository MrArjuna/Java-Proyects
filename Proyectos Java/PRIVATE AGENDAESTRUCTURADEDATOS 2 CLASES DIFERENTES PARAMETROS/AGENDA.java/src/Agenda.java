import java.util.Scanner;
import java.util.HashMap;

public class Agenda {
    private static HashMap<String, String> contactos = new HashMap<>();
    private static Scanner scan = new Scanner(System.in);

    static boolean exit = true;

    public static void main(String[] args) {
        while (exit) {
            System.out.println("\n** Agenda de Contactos **");
            System.out.println("1. Insertar contacto");
            System.out.println("2. Buscar contacto");
            System.out.println("3. Actualizar contacto");
            System.out.println("4. Eliminar contacto");
            System.out.println("5. Mostrar Todos Los Contactos");
            System.out.println("6. Salir");
            System.out.print("Selecciona una opción: ");
            String opcion = scan.nextLine();

            switch (opcion) {
                case "1":
                    FUNCIONES.Insertar(contactos, scan);
                    break;

                case "2":
                    FUNCIONES.Buscar(contactos, scan); // Llamada al método Buscar en FUNCIONES
                    break;

                case "3":
                    FUNCIONES.Modificar(contactos, scan);
                    break;

                case "4":
                    FUNCIONES.Borrar(contactos, scan);
                    break;

                case "5":
                    FUNCIONES.MostrarContactos(contactos, scan);
                    break;

                case "6":
                    System.out.println("Estás saliendo del programa.");
                    exit = false;
                    break;

                default:
                    System.out.println("Opción incorrecta, intenta de nuevo.");
            }
        }
    }

 }