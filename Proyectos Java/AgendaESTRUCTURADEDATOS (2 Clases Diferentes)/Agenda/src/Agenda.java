import java.util.Scanner;
import java.util.HashMap;

public class Agenda {
    public static HashMap<String, String> contactos = new HashMap<>();
    public static Scanner Scan = new Scanner(System.in);

    static boolean exit = true;

    public static void main(String[] args) throws Exception {
        while (exit) {
            System.out.println("\n** Agenda de Contactos **");
            System.out.println("1. Insertar contacto");
            System.out.println("2. Buscar contacto");
            System.out.println("3. Actualizar contacto");
            System.out.println("4. Eliminar contacto");
            System.out.println("5. Mostrar Todos Los Contactos");
            System.out.println("6. Salir");
            System.out.print("Selecciona una opción: ");
            String Opcion = Scan.nextLine();

            switch (Opcion) {
                case "1":
                    FUNCIONES.Insertar();
                    break;

                case "2":
                    FUNCIONES.Buscar();
                    break;

                case "3":
                    FUNCIONES.Modificar();
                    break;

                case "4":
                    FUNCIONES.Borrar();
                    break;

                case "5":
                    FUNCIONES.MostrarContactos();
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