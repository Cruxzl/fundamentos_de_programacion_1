import java.util.Scanner;

public class Descarga {

    public static double calcularTiempo(double tamano, double velocidad) {
        return tamano / velocidad;
    }

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("---- Descarga de Archivo - Cruz ----");
        System.out.println("Ingrese el tamaño del archivo en MB: ");
        double tamano = teclado.nextDouble();

        System.out.print("Ingrese la velocidad de descarga en MB/s: ");
        double velocidad = teclado.nextDouble();

        if (tamano < 0 || velocidad <= 0) {
            System.out.println("Datos inválidos. El tamaño no puede ser negativo y la velocidad debe ser mayor a cero.");
        } else {
            double tiempo = calcularTiempo(tamano, velocidad);
            System.out.println("Tiempo estimado: " + tiempo + " segundos.");
        }

    }
}