import java.util.Scanner;

public class ComparacionKilometros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1. Entrada de datos
        System.out.print("Ingrese kilómetros del conductor 1: ");
        int c1 = scanner.nextInt();

        System.out.print("Ingrese kilómetros del conductor 2: ");
        int c2 = scanner.nextInt();

        System.out.println(); // Salto de línea

        // 2. Comparaciones relacionales
        System.out.println(c1 + " es mayor que " + c2 + ": " + (c1 > c2));
        System.out.println(c1 + " es menor que " + c2 + ": " + (c1 < c2));
        System.out.println(c1 + " es mayor o igual que " + c2 + ": " + (c1 >= c2));
        System.out.println(c1 + " es menor o igual que " + c2 + ": " + (c1 <= c2));
        System.out.println(c1 + " es igual a " + c2 + ": " + (c1 == c2));
        System.out.println(c1 + " es diferente de " + c2 + ": " + (c1 != c2));

        System.out.println(); // Salto de línea

        // 3. Determinar quién recorrió más y calcular la diferencia
        if (c1 > c2) {
            int diferencia = c1 - c2;
            System.out.println("El conductor 1 recorrió más kilómetros.");
            System.out.println("Diferencia: " + diferencia + " km.");
        } else if (c2 > c1) {
            int diferencia = c2 - c1;
            System.out.println("El conductor 2 recorrió más kilómetros.");
            System.out.println("Diferencia: " + diferencia + " km.");
        } else {
            System.out.println("Ambos conductores recorrieron la misma cantidad de kilómetros.");
            System.out.println("Diferencia: 0 km.");
        }

        scanner.close();
    }
}