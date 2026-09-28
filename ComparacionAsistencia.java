import java.util.Scanner;

public class ComparacionAsistencia {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1. Entrada de datos
        System.out.print("Ingrese asistencia del estudiante 1: ");
        int e1 = scanner.nextInt();

        System.out.print("Ingrese asistencia del estudiante 2: ");
        int e2 = scanner.nextInt();

        System.out.println(); // Salto de línea

        // 2. Comparaciones relacionales
        System.out.println(e1 + " es mayor que " + e2 + ": " + (e1 > e2));
        System.out.println(e1 + " es menor que " + e2 + ": " + (e1 < e2));
        System.out.println(e1 + " es mayor o igual que " + e2 + ": " + (e1 >= e2));
        System.out.println(e1 + " es menor o igual que " + e2 + ": " + (e1 <= e2));
        System.out.println(e1 + " es igual a " + e2 + ": " + (e1 == e2));
        System.out.println(e1 + " es diferente de " + e2 + ": " + (e1 != e2));

        System.out.println(); // Salto de línea

        // 3. Determinar cuál tiene mejor asistencia y la diferencia
        if (e1 > e2) {
            int diferencia = e1 - e2;
            System.out.println("El estudiante 1 tiene mejor asistencia.");
            System.out.println("Diferencia de asistencia: " + diferencia + "%");
        } else if (e2 > e1) {
            int diferencia = e2 - e1;
            System.out.println("El estudiante 2 tiene mejor asistencia.");
            System.out.println("Diferencia de asistencia: " + diferencia + "%");
        } else {
            System.out.println("Ambos estudiantes tienen la misma asistencia.");
            System.out.println("Diferencia de asistencia: 0%");
        }

        scanner.close();
    }
}