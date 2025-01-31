
import java.util.*;
public class Main {
	
	public static boolean Palindromo (){
		
		Scanner Scan = new Scanner (System.in);
		
		
		System.out.println("Introduce la palabra que quieres verificar si es un Palindromo: ");
		
		String Texto = Scan.nextLine();
		
		Texto = Texto.replaceAll ("\\s+","").toLowerCase();
		
		
		StringBuilder TextoB = new StringBuilder (Texto).reverse();
		
		Scan.close();
		
		return
		Texto.equals(TextoB.toString());
		

}
	
	public static void main(String[] args) {
		
				if (Palindromo ()){
		
		System.out.println("Si es Palindromo");
		}
		else {
		System.out.println("No es Palindromo");
		}
		
		
	//	System.out.println( Result);
		
		
	}
}