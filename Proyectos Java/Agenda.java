import java.util.Scanner;
import java.util.HashMap;

public class Agenda {
    private static HashMap<String, String> contactos = new HashMap<>();
    private static Scanner Scan = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            System.out.println("\n** Agenda de Contactos **");
            System.out.println("1. Insertar contacto");
            System.out.println("2. Buscar contacto");
            System.out.println("3. Actualizar contacto");
            System.out.println("4. Eliminar contacto");
            System.out.println("5. Mostrar contactos");
            System.out.println("6. Salir");
            System.out.print("Selecciona una opción: ");
            String Opcion = Scan.nextLine();

            switch (Opcion) {
                case "1":
                    Insertar();
                    break;
                case "2":
                    Buscar();
                    break;
                case "3":
                    Modificar();
                    break;
                case "4":
                    Borrar();
                    break;
                case "5":
                    MostrarContactos();
                    break;
                case "6":
                    System.out.println("Estás saliendo del programa...");
                    return; // Finaliza el programa
                default:
                    System.out.println("Opción incorrecta, intenta de nuevo.");
            }
        }
    }

    private static boolean NumeroValido(String telefono) {
        return telefono.matches("\\d{11}"); // Ahora requiere exactamente 11 dígitos
    }

    private static void Insertar() {
        System.out.println("Introduce el nombre:");
        String nombre = Scan.nextLine();

        System.out.println("Introduce el teléfono (11 dígitos):");
        String telefono = Scan.nextLine();

        if (!NumeroValido(telefono)) {
            System.out.println("Número inválido. Debe tener exactamente 11 dígitos.");
            return;
        }

        if (contactos.containsKey(nombre)) {
            System.out.println("El contacto ya existe.");
        } else {
            contactos.put(nombre, telefono);
            System.out.println("Contacto añadido.");
        }
    }

    private static void Borrar() {
        System.out.println("Introduce el nombre a borrar:");
        String nombre = Scan.nextLine();
        if (contactos.remove(nombre) != null) {
            System.out.println("Contacto borrado exitosamente.");
        } else {
            System.out.println("El contacto no existe.");
        }
    }

    private static void Modificar() {
        System.out.println("Introduce el nombre del contacto a modificar:");
        String nombre = Scan.nextLine();

        if (contactos.containsKey(nombre)) {
            System.out.println("Introduce el nuevo número de teléfono (11 dígitos):");
            String nuevoTelefono = Scan.nextLine();

            if (!NumeroValido(nuevoTelefono)) {
                System.out.println("Teléfono inválido, intenta de nuevo.");
                return;
            }

            contactos.put(nombre, nuevoTelefono);
            System.out.println("Teléfono actualizado con éxito.");
        } else {
            System.out.println("El contacto no existe.");
        }
    }

    private static void Buscar() {
        System.out.println("Introduce el nombre a buscar:");
        String nombre = Scan.nextLine();

        if (contactos.containsKey(nombre)) {
            System.out.println("Teléfono de " + nombre + ": " + contactos.get(nombre));
        } else {
            System.out.println("El contacto no existe.");
        }
    }

    private static void MostrarContactos() {
        if (contactos.isEmpty()) {
            System.out.println("Lista de contactos vacía.");
        } else {
            System.out.println("\n** Lista de Contactos **");
            contactos.forEach((nombre, telefono) -> System.out.println(nombre + ": " + telefono));
        }
    }
}
