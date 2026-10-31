import java.util.Scanner;

public class Bateria {

    public static int calcularMinutos(int porcentajeInicial) {
        int minutos = 0;
        int bateria = porcentajeInicial;

        while (bateria < 100) {
            bateria += 8;
            if (bateria > 100) {
                bateria = 100;
            }
            minutos++;
        }

        return minutos;
    }

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int opcion;
        System.out.println("---- Carga de Bateria - Cruz ----");

        do {
            System.out.print("Ingrese el porcentaje inicial de bateria (0 a 100): ");
            int porcentaje = teclado.nextInt();

            if (porcentaje < 0 || porcentaje > 100) {
                System.out.println("Error: El porcentaje debe estar entre 0 y 100.");
            } else {
                int minutos = calcularMinutos(porcentaje);
                System.out.println("Minutos necesarios para completar la carga: " + minutos);
            }

            System.out.println("\nDesea realizar otra simulacion? (1. Si / 2. No): ");
            opcion = teclado.nextInt();

        } while (opcion == 1);

    }
}