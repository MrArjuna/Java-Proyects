import java.util.Scanner;

public class CifradodeCesarNegativo {
    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        String frase1, frase2;
        int desplazamiento;

        frase2 = "";

        // Abecedarios con espacio incluido
        String min = "abcdefghijklmnopqrstuvwxyz ";
        String may = "ABCDEFGHIJKLMNOPQRSTUVWXYZ ";

        System.out.println("Introduce la frase:");
        frase1 = S.nextLine();

        System.out.println("Clave de Desplazamiento (puede ser negativa):");
        desplazamiento = S.nextInt();

        // Ajuste del desplazamiento para valores negativos
        int longitudMin = min.length();
        int longitudMay = may.length();

        for (int i = 0; i < frase1.length(); i++) {
            char actual = frase1.charAt(i);

            // Procesar minúsculas
            if (min.indexOf(actual) != -1) {
                int posicionActual = min.indexOf(actual);
                int nuevaPosicion = (posicionActual + desplazamiento) % longitudMin;

                // Ajuste para índices negativos
                if (nuevaPosicion < 0) {
                    nuevaPosicion += longitudMin;
                }

                frase2 += min.charAt(nuevaPosicion);
            }
            // Procesar mayúsculas
            else if (may.indexOf(actual) != -1) {
                int posicionActual = may.indexOf(actual);
                int nuevaPosicion = (posicionActual + desplazamiento) % longitudMay;

                // Ajuste para índices negativos
                if (nuevaPosicion < 0) {
                    nuevaPosicion += longitudMay;
                }

                frase2 += may.charAt(nuevaPosicion);
            }
            // Si el carácter no está en los alfabetos, se deja igual
            else {
                frase2 += actual;
            }
        }

        System.out.println("Frase original: " + frase1);
        System.out.println("Frase cifrada: " + frase2);
    }
}
