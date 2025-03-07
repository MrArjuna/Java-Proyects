import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        Queue<String> cola = new LinkedList<>();
        
        cola.offer("A");
        cola.offer("B");
        cola.offer("C");
        
        System.out.println("Primer elemento: " + cola.peek()); // Muestra "A"
        
        System.out.println("Eliminado: " + cola.poll()); // Elimina "A"
        
        System.out.println("Cola después de poll: " + cola);
    }
}