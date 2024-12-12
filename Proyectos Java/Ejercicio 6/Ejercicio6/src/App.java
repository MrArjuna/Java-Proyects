import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        int Dia;

        do {

            Scanner scanner = new Scanner(System.in);

            System.out.println("Introduce un numero del 1 al 7");

            Dia = scanner.nextInt();

        } while (Dia > 7);

        switch (Dia) {
            case 1:

                System.out.println("Monday");

                break;

            case 2:

                System.out.println("Wedsnday");

            default:

                System.out.println("Selecciona un numero del 1 al 7  solamente");
                break;
        }

    }
}
