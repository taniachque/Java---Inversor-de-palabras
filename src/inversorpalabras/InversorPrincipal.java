package inversorpalabras;

/**
 * @author Tania
 */
import java.util.Scanner;

public class InversorPrincipal {

    public static void main(String[] args) {

        String palabra = "", palabraInvertida = "";
        int longitudPalabra = 0;

        Scanner entrada = new Scanner(System.in);

        System.out.println("Escribe una palabra o frase: ");
        palabra = entrada.nextLine();

        InversorPalabras invert = new InversorPalabras(palabra, palabraInvertida, longitudPalabra);
        invert.Imprimir();

    }
}
