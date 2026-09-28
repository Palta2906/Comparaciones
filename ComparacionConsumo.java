import java.util.Scanner;

public class ComparacionConsumo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1. Entrada de datos
        System.out.print("Ingrese consumo del hogar 1: ");
        int h1 = scanner.nextInt();

        System.out.print("Ingrese consumo del hogar 2: ");
        int h2 = scanner.nextInt();

        System.out.println(); // Salto de línea

        // 2. Comparaciones relacionales
        System.out.println(h1 + " es mayor que " + h2 + ": " + (h1 > h2));
        System.out.println(h1 + " es menor que " + h2 + ": " + (h1 < h2));
        System.out.println(h1 + " es mayor o igual que " + h2 + ": " + (h1 >= h2));
        System.out.println(h1 + " es menor o igual que " + h2 + ": " + (h1 <= h2));
        System.out.println(h1 + " es igual a " + h2 + ": " + (h1 == h2));
        System.out.println(h1 + " es diferente de " + h2 + ": " + (h1 != h2));

        System.out.println(); // Salto de línea

        // 3. Determinar qué hogar consumió más y la diferencia
        if (h1 > h2) {
            int diferencia = h1 - h2;
            System.out.println("El hogar 1 consumió más energía.");
            System.out.println("La diferencia es de " + diferencia + " kWh.");
        } else if (h2 > h1) {
            int diferencia = h2 - h1;
            System.out.println("El hogar 2 consumió más energía.");
            System.out.println("La diferencia es de " + diferencia + " kWh.");
        } else {
            System.out.println("Ambos hogares consumieron la misma cantidad de energía.");
            System.out.println("La diferencia es de 0 kWh.");
        }

        scanner.close();
    }
}