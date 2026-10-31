import java.util.Scanner;

public class ProduccionAudiovisual {

    public static double calcularRenta(double tarifa, double horas) {
        return tarifa * horas;
    }

    public static void mostrarComprobante(double total) {
        System.out.println("El costo total que deberá pagar el cliente es: $" + total);
    }

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("---- Produccion Audiovisual - Cruz ----");
        System.out.print("Ingrese la tarifa de alquiler por hora: ");
        double tarifa = teclado.nextDouble();

        System.out.print("Ingrese la cantidad de horas de uso: ");
        double horas = teclado.nextDouble();

        if (tarifa <= 0 || horas <= 0) {
            System.out.println("Error: La tarifa y las horas deben ser mayores que cero.");
        } else {
            double total = calcularRenta(tarifa, horas);
            mostrarComprobante(total);
        }

    }
}