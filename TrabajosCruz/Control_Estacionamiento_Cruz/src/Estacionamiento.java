import java.util.Scanner;
public class Estacionamiento {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int totalAutos = 0;
        double totalDinero = 0;
        int conDescuento = 0;

        System.out.println("---- Control De Estacionamiento - Cruz ----");
        System.out.print("Ingrese Las Horas A Registrar (Presiona 0 Para Terminar): ");
        double horas = teclado.nextDouble();

        while (horas != 0) {
            if (horas < 0) {
                System.out.println("Las Horas NO Pueden Ser Negativas.");
            } else {
                double pago = horas * 15;

                if (horas > 5) {
                    pago = pago - 10;
                    conDescuento = conDescuento + 1;
                }
                System.out.println("El Auto Pagara: $" + pago);

                totalAutos = totalAutos + 1;
                totalDinero = totalDinero + pago;
            }

            System.out.print("\nIngrese Las Horas A Registrar (Presiona 0 Para Terminar): ");
            horas = teclado.nextDouble();
        }

        System.out.println("\n--- RESULTADOS ---");
        System.out.println("Total De Autos: " + totalAutos);
        System.out.println("Total De Dinero: $" + totalDinero);
        System.out.println("Autos Con Descuento: " + conDescuento);

        if (totalAutos > 0) {
            double promedio = totalDinero / totalAutos;
            System.out.println("Promedio Pagado: $" + promedio);
        } else {
            System.out.println("Promedio Pagado: $0");
        }
    }
}