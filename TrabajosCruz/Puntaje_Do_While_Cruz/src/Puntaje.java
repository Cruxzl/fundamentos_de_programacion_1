import java.util.Scanner;

public class Puntaje{
        public static void main(String[] args) {
            Scanner teclado = new Scanner(System.in);
            int puntos = 100;
            int opc;

            do {
                System.out.println("\n--- Menu Puntaje - Cruz ---");
                System.out.println("1. Ganar 20 puntos");
                System.out.println("2. Gastar 15 puntos");
                System.out.println("3. Consultar puntos");
                System.out.println("4. Salir");
                System.out.print("Selecciona una opción: ");

                opc = teclado.nextInt();

                switch (opc) {
                    case 1:
                        puntos += 20;
                        System.out.println("Has ganado un total de: 20 puntos");
                        break;
                    case 2:
                        if (puntos >= 15) {
                            puntos -= 15;
                            System.out.println("Has gastado un total de: 15 puntos.");
                        } else {
                            System.out.println("Error: No tienes suficientes puntos para gastar (mínimo 15).");
                        }
                        break;
                    case 3:
                        System.out.println("Tienes actualmente: " + puntos + " puntos.");
                        break;
                    case 4:
                        System.out.println("Saliendo.");
                        break;
                    default:
                        System.out.println("Opción inválida. Intenta de nuevo.");
                }
            } while (opc != 4);

            System.out.println("\nJuego terminado. Puntos restantes finales: " + puntos);
        }
    }