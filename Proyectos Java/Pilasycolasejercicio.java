import java.util.Scanner;
import java.util.Stack;
import java.util.Queue;
import java.util.LinkedList;

public class Simulaciones {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Stack<String> historial = new Stack<>();
        Stack<String> adelante = new Stack<>();
        Queue<String> colaImpresion = new LinkedList<>();

        String actual = "Inicio";
        boolean ejecutando = true;
        
        while (ejecutando) {
            System.out.println("\n--- Menú ---");
            System.out.println("1. Navegador Web (Pilas)");
            System.out.println("2. Impresora Compartida (Colas)");
            System.out.println("3. Salir");
            System.out.print("Seleccione una opción: ");
            
            int opcion = scanner.nextInt();
            scanner.nextLine();
            
            switch (opcion) {
                case 1:
                    System.out.println("\nIngrese un nombre de página para navegar, 'atrás' para volver o 'adelante' para ir adelante:");
                    String entrada = scanner.nextLine();
                    
                    if (entrada.equalsIgnoreCase("atrás")) {
                        if (!historial.isEmpty()) {
                            adelante.push(actual);
                            actual = historial.pop();
                        } else {
                            System.out.println("No hay páginas atrás.");
                        }
                    } else if (entrada.equalsIgnoreCase("adelante")) {
                        if (!adelante.isEmpty()) {
                            historial.push(actual);
                            actual = adelante.pop();
                        } else {
                            System.out.println("No hay páginas adelante.");
                        }
                    } else {
                        historial.push(actual);
                        actual = entrada;
                        adelante.clear();
                    }
                    
                    System.out.println("Página actual: " + actual);
                    break;
                
                case 2:
                    System.out.println("\nIngrese un documento para agregar a la cola o 'imprimir' para imprimir un documento:");
                    String doc = scanner.nextLine();
                    
                    if (doc.equalsIgnoreCase("imprimir")) {
                        if (!colaImpresion.isEmpty()) {
                            System.out.println("Imprimiendo: " + colaImpresion.poll());
                        } else {
                            System.out.println("No hay documentos en la cola.");
                        }
                    } else {
                        colaImpresion.offer(doc);
                        System.out.println("Documento agregado a la cola.");
                    }
                    break;
                
                case 3:
                    ejecutando = false;
                    break;
                
                default:
                    System.out.println("Opción no válida.");
            }
        }
        
        scanner.close();
    }
}
