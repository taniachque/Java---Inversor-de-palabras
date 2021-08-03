package inversorpalabras;

/**
 * @author Tania
 */
import java.util.Scanner;

public class InversorPalabras {

    private String palabra1, palabraInvertida1;
    private int longitudPalabra1;

    public InversorPalabras(String palabra, String palabraIvertida, int longitudpalabra) {

        this.palabra1 = palabra;
        this.palabraInvertida1 = palabraIvertida;
        this.longitudPalabra1 = longitudpalabra;
    }

    public void Invertir() {
        longitudPalabra1 = palabra1.length();
        while (longitudPalabra1 != 0) {
            palabraInvertida1 += palabra1.substring(longitudPalabra1 - 1, longitudPalabra1);
            longitudPalabra1--;
        }
    }

    public void Imprimir() {
        Invertir();
        System.out.println("Palabra invertida: " + palabraInvertida1);
    }
}
