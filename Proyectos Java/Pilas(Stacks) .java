import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Stack<Integer> pila = new Stack<>();
        
        pila.push(10); // Agregar elementos
        pila.push(20);
        pila.push(30);
        
        System.out.println("Último elemento: " + pila.peek()); // Muestra 30
        
        System.out.println("Eliminado: " + pila.pop()); // Elimina 30
        
        System.out.println("Pila después de pop: " + pila);
    }
}