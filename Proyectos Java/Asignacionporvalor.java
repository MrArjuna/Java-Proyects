public class Main {
	
	public static void Valor (int Numero){
		
		Numero += 10;
		
		System.out.println(Numero);
		
		}
	
	
	public static void main(String[] args) {
		
		int ReferenciaValor = 100;
		
		//Metodo + Variable
		Valor(ReferenciaValor);
		
	}
}