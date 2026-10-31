public class Paquetes {

    public static void main(String[] args) {
        mostrarEtiqueta("ABC-123", "Bogotá", 3.5);
        mostrarEtiqueta("XYZ-789", "Medellín", 7.2);
    }

    public static void mostrarEtiqueta(String guia, String destino, double peso) {
        System.out.println("Guía: " + guia + " | Destino: " + destino + " | Peso: " + peso + " kg");
    }

}