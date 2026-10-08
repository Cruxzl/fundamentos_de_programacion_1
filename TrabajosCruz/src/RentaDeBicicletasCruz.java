import java.util.Scanner;

public class RentaDeBicicletasCruz {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("--- Sistema de Renta de Bicicletas - Cruz ---");
        System.out.println("1. Bicicleta Urbana ($40 por hora)");
        System.out.println("2. Bicicleta de Montaña ($60 por hora)");
        System.out.println("3. Bicicleta Eléctrica ($90 por hora)");

        System.out.print("Ingrese la opcion de bicicleta que deseas rentar: ");
        int tipoBici = teclado.nextInt();

        System.out.print("Ingrese la cantidad de horas de rentaras: ");
        int horas = teclado.nextInt();

        System.out.print("¿Tiene membresía? (true=Si / false=No): ");
        boolean tieneMembresia = teclado.nextBoolean();

        double tarifa = 0;
        String nombreBici = "";
        boolean opcionValida = true;

        switch (tipoBici) {
            case 1:
                tarifa = 40.0;
                nombreBici = "Bicicleta Urbana.";
                break;
            case 2:
                tarifa = 60.0;
                nombreBici = "Bicicleta de Montaña.";
                break;
            case 3:
                tarifa = 90.0;
                nombreBici = "Bicicleta Eléctrica.";
                break;
            default:
                opcionValida = false;
                System.out.println("\nOpción no Válida.");
                break;
        }

        if (opcionValida) {
            if (horas > 0) {
                double subtotal = tarifa * horas;
                double descuento = 0;

                if (tieneMembresia) {
                    descuento = subtotal * 0.20;
                }
                double totalPagar = subtotal - descuento;

                System.out.println("\n--- Resumen de la Renta ---");
                System.out.println("Tipo de bicicleta: " + nombreBici);
                System.out.println("Subtotal: $" + subtotal);
                System.out.println("Descuento aplicado: $" + descuento);
                System.out.println("Total a pagar: $" + totalPagar);
            } else {
                System.out.println("\nError: La cantidad de horas debe ser mayor a cero.");
            }
        }
    }
}