import java.util.Scanner;

public class PuntajePartida {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int puntosAcumulados = 0;
        int masDeMil = 0;
        int milOmenos = 0;

        System.out.println("---- Acumulador de Puntaje - Cruz ----");

        for (int i = 1; i <= 7; i++) {
            try {
                System.out.print("Ingrese los puntos de la partida " + i + ": ");
                String puntos = teclado.nextLine();

                int numero = Integer.parseInt(puntos);
                puntosAcumulados += numero;

                if (numero > 1000) {
                    masDeMil++;
                } else {
                    milOmenos++;
                }

            } catch (Exception e) {
                System.out.println("Datos inválidos. Intente de nuevo en la siguiente partida.");
            }
        }

        double promedio = (double) puntosAcumulados / 7;

        System.out.println("\n---- RESULTADOS FINALES ----");
        System.out.println("Puntos acumulados: " + puntosAcumulados);
        System.out.println("Promedio de puntuación: " + promedio);
        System.out.println("Partidas con más de 1000 puntos: " + masDeMil);
        System.out.println("Partidas con 1000 puntos o menos: " + milOmenos);

    }
}