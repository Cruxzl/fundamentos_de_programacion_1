import java.util.Scanner;

public class Dron{
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("\n--- Bateria del Dron Restante - Cruz ---");
        System.out.print("Ingresa el porcentaje de la batería inicial: ");
        int bateria = teclado.nextInt();

        System.out.println("\n--- Bateria Restante --");

        int minuto = 1;
        while (bateria >= 7) {
            bateria -= 7;
            System.out.println("Minuto: " + minuto + "  " + bateria + "%");
            minuto++;
        }

        System.out.println("\nEl dron debe de aterrizar.");

    }
}