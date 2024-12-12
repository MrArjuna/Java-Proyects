import java.util.Scanner;

public class Primo {

    public static void main(String[] args) {

        int numero;

        boolean resultado = true;

        Scanner IntroducePrimo = new Scanner(System.in);

        System.out.println("Introduce un numero el cual posteriormente se determinara si es primo o no :");

        numero = IntroducePrimo.nextInt();

        for (int i = 2; i < numero; i++) {
            if (numero % i == 0) {
                resultado = false;
                break;
            }
        }

        if (resultado = true) {

            System.err.println(numero + " Es primo");
        }

        else {
            System.out.println(numero + " No es primo");
        }

    }

}
