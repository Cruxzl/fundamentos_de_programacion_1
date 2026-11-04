import java.util.Scanner;

public class ExamenU2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int totalAceptados = 0;
        int totalRechazados = 0;
        double dineroRecaudado = 0;
        int totalFragiles = 0;
        double costoMasAlto = 0;

        System.out.println("--- Examen U2 - Cruz ---");

        System.out.print("\nIngrese el peso en KG (0 para terminar): ");
        int peso = teclado.nextInt();

        while (peso != 0) {

            if (peso < 0) {
                System.out.println("Peso Invalido. Ingresalo de Nuevo.");

            } else {

                int tipoEnvio = 0;
                boolean tipoValido = false;

                while (!tipoValido) {
                    System.out.print("Elija tipo de envio (1: Local, 2: Nacional, 3: Express): ");
                    tipoEnvio = teclado.nextInt();

                    if (tipoEnvio >= 1 && tipoEnvio <= 3) {
                        tipoValido = true;
                    } else {
                        System.out.println("Opcion no valida. Ingresala De Nuevo.");
                    }
                }

                boolean rechazado = false;
                if (tipoEnvio == 1 && peso > 12) {
                    rechazado = true;
                } else if (tipoEnvio == 2 && peso > 20) {
                    rechazado = true;
                } else if (tipoEnvio == 3 && peso > 5) {
                    rechazado = true;
                }

                if (rechazado) {
                    System.out.println("Paquete Rechazado. Exceso de Peso.");
                    totalRechazados++;

                } else {

                    double costoTotal = 0;
                    String nombreEnvio = "";

                    if (tipoEnvio == 1) {
                        costoTotal = 30 + (8 * peso);
                        nombreEnvio = "Local.";

                    } else if (tipoEnvio == 2) {
                        costoTotal = 50 + (12 * peso);
                        nombreEnvio = "Nacional.";

                    } else if (tipoEnvio == 3) {
                        costoTotal = 80 + (20 * peso);
                        nombreEnvio = "Express.";
                    }

                    int fragil = 0;
                    boolean fragilValido = false;

                    while (!fragilValido) {
                        System.out.print("¿Es frágil? (1: Sí, 2: No): ");
                        fragil = teclado.nextInt();

                        if (fragil == 1 || fragil == 2) {
                            fragilValido = true;
                        } else {
                            System.out.println("Opcion no valida. Repetir.");
                        }
                    }

                    if (fragil == 1) {
                        costoTotal += 25;
                        totalFragiles++;
                    }

                    totalAceptados++;
                    dineroRecaudado += costoTotal;

                    System.out.println("\n---- Resultado del Paquete ----");
                    System.out.println("Tipo de envío: " + nombreEnvio);
                    System.out.println("Peso en kg: " + peso);
                    System.out.println("Total a pagar: $" + costoTotal);

                    if (costoTotal > costoMasAlto) {
                        costoMasAlto = costoTotal;
                    }
                }
            }

            System.out.print("\nIngrese el peso en KG (0 para terminar): ");
            peso = teclado.nextInt();
        }

        System.out.println("\n---- Resultados ----");
        System.out.println("Total de aceptados: " + totalAceptados);
        System.out.println("Total de rechazados: " + totalRechazados);
        System.out.println("Dinero recaudado: $" + dineroRecaudado);
        System.out.println("Frágiles aceptados: " + totalFragiles);
        System.out.println("Costo más alto: $" + costoMasAlto);
    }
}