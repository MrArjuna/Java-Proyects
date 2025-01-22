import java.util.HashMap;
import java.util.Scanner;

public class FUNCIONES {


    public static void Buscar(HashMap<String, String> contactos, Scanner scan) {
        System.out.println("Introduce el nombre para buscar");
        String nombre = scan.nextLine();

        if (contactos.containsKey(nombre)) {
            System.out.println("Teléfono: " + contactos.get(nombre));
        } else {
            System.out.println("El contacto no existe.");
        }
    }

    private static boolean NumeroValido(String telefono) {
        return telefono.matches("\\d{1,11}");
    }

    public static void Insertar(HashMap<String, String> contactos, Scanner scan) {
        System.out.println("Introduce el nombre:");
        String nombre = scan.nextLine();

        System.out.println("Introduce el teléfono:");
        String telefono = scan.nextLine();

        if (!NumeroValido(telefono)) {
            System.out.println("Número con más de 11 dígitos.");
            return;
        }

        if (contactos.containsKey(nombre)) {
            System.out.println("El contacto ya existe.");
        } else {
            contactos.put(nombre, telefono);
            System.out.println("Contacto añadido.");
        }
    }

    public static void Borrar(HashMap<String, String> contactos, Scanner scan) {
        System.out.println("Introduce el nombre a borrar:");
        String nombre = scan.nextLine();
        if (contactos.remove(nombre) != null) {
            System.out.println("Contacto borrado exitosamente.");
        } else {
            System.out.println("El contacto no existe.");
        }
    }

    public static void Modificar(HashMap<String, String> contactos, Scanner scan) {
        System.out.println("Introduce el contacto a modificar:");
        String nombre = scan.nextLine();

        if (contactos.containsKey(nombre)) {
            System.out.println("Introduce el nuevo número de teléfono:");
            String nTelefono = scan.nextLine();

            if (!NumeroValido(nTelefono)) {
                System.out.println("Teléfono inválido, intenta de nuevo.");
                return;
            }
            contactos.put(nombre, nTelefono);
            System.out.println("Teléfono actualizado con éxito.");
        } else {
            System.out.println("El contacto no existe.");
        }
    }

    public static void MostrarContactos(HashMap<String, String> contactos, Scanner scan) {
        if (contactos.isEmpty()) {
            System.out.println("Lista vacía.");
        } else {
            contactos.forEach((nombre, telefono) ->
                System.out.println("Nombre: " + nombre + " | Teléfono: " + telefono));


            }
}
}