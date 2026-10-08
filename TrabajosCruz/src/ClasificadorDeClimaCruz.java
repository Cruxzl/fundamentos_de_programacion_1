import java.util.Scanner;

public class ClasificadorDeClimaCruz {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("--- Sistema de Clasificación de Temperatura - Cruz ---");
        System.out.print("Ingrese la temperatura en °C: ");
        double temperatura = teclado.nextDouble();

        if (temperatura < 10) {

            System.out.println("Frío Extremo.");

        } else if (temperatura >= 10 && temperatura <= 20) {

            System.out.println("Clima Fresco.");

        } else if (temperatura >= 21 && temperatura <= 30) {

            System.out.println("Clima Agradable.");

        } else {

            System.out.println("Calor Extremo.");

        }
    }
}