
import java.util.Scanner;

public class Vector1 {

    public static void main(String[] args) {


        int [] vec1 = new int [3];


        Scanner X = new Scanner (System.in);


        for (int K = 0; K < 3; K++){


        System.out.println("Introduce un Numero: ");

        vec1 [K] = X.nextInt();

        
        }
        
         for (int K = 0; K < 3; K++){

            System.out.print(vec1[K]);

            if (K < 2){
                System.out.print(", ");
            }
       
            
         }

        X.close();

        
    }


    
}
