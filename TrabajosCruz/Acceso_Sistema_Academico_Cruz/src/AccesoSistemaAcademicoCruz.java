import java.util.Scanner;

public class AccesoSistemaAcademicoCruz {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("--- Acceso Al Sistema Academico - Cruz ---");
        System.out.print("Ingrese el promedio del alumno (Ejemplo. 7.5): ");
        double promedio = teclado.nextDouble();

        if (promedio < 7.0) {
            System.out.println("Reprobado por Calificación.");
        } else {

            System.out.print("Ingrese el porcentaje de asistencia (Ejemplo. 85): ");
            double asistencia = teclado.nextDouble();

            if (asistencia < 80.0) {
                System.out.println("Reprobado por Faltas.");
            } else {
                System.out.println("Aprobado Regular.");
            }
        }
    }
}