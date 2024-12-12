   public class PrimoMejorado {

        public static void main(String[] args) {
    
            for (int i = 150; i < 200; i++) {
                if (esPrimo(i)) {
                    System.out.print(i + " , ");
                }
            }
        }
    
        public static boolean esPrimo(int n) {
            if (n < 2) return false;
            if (n == 2) return true; // el número 2 es primo
            if (n % 2 == 0) return false; // descarta pares mayores a 2
    
           //for (int j = 3; j <= raiz; j += 2) { // solo iterar por números impares
               // if (n % j == 0) {
                 //   return false;
               // }
          //  }
            return true;
        }
    }
    

