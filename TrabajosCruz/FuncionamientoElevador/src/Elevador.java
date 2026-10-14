import java.util.Scanner;

public class Elevador {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("--- Funcionamiento Elevador - Cruz ---");
        System.out.print("Ingrese el numero de piso en el que se encuentra (1-10): ");
        int pisoActual = teclado.nextInt();

        System.out.print("Ingrese el numero de piso al que se dirige (1-10): ");
        int pisoDestino = teclado.nextInt();

        if (pisoActual < 1 || pisoActual > 10 || pisoActual == 0 || pisoDestino < 1 || pisoDestino > 10 ||  pisoDestino == 0) {
            System.out.println("Error: Los pisos válidos son del 1 al 10. Intentalo de nuevo.");

        } else if (pisoActual == pisoDestino) {
            System.out.println("Ya te encuentras en ese piso.");

        } else if (pisoActual > pisoDestino) {
            System.out.println("Descendiendo pisos...");
            while (pisoActual > pisoDestino) {
                pisoActual--;
                System.out.println("Piso " + pisoActual);
            }
            System.out.println("¡Has llegado a tu destino!");

        } else {
            System.out.println("Subiendo pisos...");
            while (pisoActual < pisoDestino) {
                pisoActual++;
                System.out.println("Piso " + pisoActual);
            }
            System.out.println("¡Has llegado a tu destino!");
        }
    }
}