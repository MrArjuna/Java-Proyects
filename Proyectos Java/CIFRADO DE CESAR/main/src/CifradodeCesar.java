import java.util.Scanner;

public class CifradodeCesar {
    public static void main(String[] args) {
    
    Scanner S = new Scanner(System.in);
    String A;  
    
    String frase1, frase2;
    int desplazamiento;

    frase2 = "";
    
    String min = "abcdefghijklmnopqrstuvwxyz ";
    String may = "ABCDEFGHIJKLMNOPQRSTUVWXYZ ";

    System.out.println("Introduce");
    frase1 = S.nextLine();

    System.out.println("Clave de Desplazamiento");
    desplazamiento = S.nextInt();

    for (int i = 0; i < frase1.length(); i++ ){
        for (int j = 0; j < min.length(); j++){
            if (frase1.charAt(i) == min.charAt(j)){
                 if (j + desplazamiento >= min.length()){
                    frase2 += min.charAt((j + desplazamiento) % min.length());

                 }
                 else{
                    frase2 += min.charAt(j+desplazamiento);
                 } 


            }

            else if (frase1.charAt(i) == may.charAt(j)){
                if (j + desplazamiento >= may.length()){
                   frase2 += may.charAt((j + desplazamiento) % may.length());

                }
                else{
                   frase2 += may.charAt(j+desplazamiento);
                } 


           }

        }

    }


    System.out.println(frase1);
    System.out.println(frase2);
     }
}