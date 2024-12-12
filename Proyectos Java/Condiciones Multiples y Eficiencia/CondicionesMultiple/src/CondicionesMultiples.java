public class CondicionesMultiples {

       public static void main(String[] args) {
        
        boolean resultado = true;

        for (int i = 100; i < 200; i++){

            resultado = true;
            for (int j = 2; j < i && resultado;  j+=2){
                 if (i % j == 0){
                    resultado = false;
                    break;

                }
                

           
            }
            if (resultado) {
            
                System.out.println(i + " , ");
                    
                }     
        }
       }
}
