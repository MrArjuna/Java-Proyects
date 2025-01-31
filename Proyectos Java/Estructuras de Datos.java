
import java.util.*;
public class AFOXJONES{
    public static void main(String[] args){

          // 1. Array
        System.out.println("Array:");
        int[] array = {5, 3, 8, 1};
        String [] arrayL = {"Letras","Letra1"};
        System.out.println("Original: " + Arrays.toString(array));
        array[0] = 10; // Actualización
        System.out.println("Actualizado: " + Arrays.toString(array));
        Arrays.sort(array); // Ordenación
        System.out.println("Ordenado: " + Arrays.toString(array ));
        System.out.println("Ordenado: " + Arrays.toString(arrayL));
        for (int num : array ){
        	System.out.println("for: " + num);
        		System.out.println();
        	}
        		System.out.println();
        	
        for (String qwer: arrayL){
        	System.out.println("ForLetra: " + qwer); 
        		System.out.println();
        	}

        // 2. ArrayList (Lista)
        System.out.println("\nArrayList:");
        List<Integer> arrayList = new ArrayList<>(Arrays.asList(5, 3, 8, 1));
        System.out.println("Original: " + arrayList);
        arrayList.add(7); // Inserción
        System.out.println("Añadido 7: " + arrayList);
        arrayList.remove(Integer.valueOf(8)); // Borrado
        System.out.println("Borrado 8: " + arrayList);
        arrayList.set(0, 10000); // Actualización
        System.out.println("Actualizado: " + arrayList);
        arrayList.sort(Comparator.naturalOrder()); // Ordenación
        System.out.println("Ordenado: " + arrayList);

        // 3. HashSet (Conjunto)
        System.out.println("\nHashSet:");
        Set<Integer> hashSet = new HashSet<>(Arrays.asList(5, 3, 8, 1));
        System.out.println("Original: " + hashSet);
        hashSet.add(7); // Inserción
        System.out.println("Añadido 7: " + hashSet);
        hashSet.remove(3); // Borrado
        System.out.println("Borrado 3: " + hashSet);
        // No admite ordenación directamente; convertir a lista
        List<Integer> sortedSet = new ArrayList<>(hashSet);
        Collections.sort(sortedSet);
        System.out.println("Ordenado: " + sortedSet);

        // 4. HashMap (Mapa)
        System.out.println("\nHashMap:");
        Map<String, Integer> hashMap = new HashMap<>();
        hashMap.put("A", 5); // Inserción
        hashMap.put("B", 3);
        hashMap.put("C", 8);
        System.out.println("Original: " + hashMap);
        hashMap.put("B", 10); // Actualización
        System.out.println("Actualizado B: " + hashMap);
        hashMap.remove("A"); // Borrado
        System.out.println("Borrado A: " + hashMap);
        // No admite ordenación directamente; usar TreeMap
        Map<String, Integer> sortedMap = new TreeMap<>(hashMap);
        System.out.println("Ordenado: " + sortedMap);

        // 5. Queue (Cola)
        System.out.println("\nQueue:");
        Queue<Integer> queue = new LinkedList<>(Arrays.asList(5, 3, 8, 1));
        System.out.println("Original: " + queue);
        queue.add(7); // Inserción
        System.out.println("Añadido 7: " + queue);
        queue.poll(); // Borrado (primer elemento)
        System.out.println("Borrado primer elemento: " + queue);

        // 6. Stack (Pila)
        System.out.println("\nStack:");
        Stack<Integer> stack = new Stack<>();
        stack.push(5); // Inserción
        stack.push(3);
        stack.push(8);
        stack.push(1);
        System.out.println("Original: " + stack);
        stack.pop(); // Borrado (último elemento)
        System.out.println("Borrado último elemento: " + stack);
        stack.push(7); // Inserción
        System.out.println("Añadido 7: " + stack);
    
    }

    }