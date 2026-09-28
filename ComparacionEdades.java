import java.util.Scanner;

public class ComparacionEdades {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1. Entrada de datos
        System.out.print("Ingrese edad del trabajador 1: ");
        int edad1 = scanner.nextInt();

        System.out.print("Ingrese edad del trabajador 2: ");
        int edad2 = scanner.nextInt();

        System.out.println(); // Salto de línea

        // 2. Comparaciones relacionales
        System.out.println(edad1 + " es mayor que " + edad2 + ": " + (edad1 > edad2));
        System.out.println(edad1 + " es menor que " + edad2 + ": " + (edad1 < edad2));
        System.out.println(edad1 + " es mayor o igual que " + edad2 + ": " + (edad1 >= edad2));
        System.out.println(edad1 + " es menor o igual que " + edad2 + ": " + (edad1 <= edad2));
        System.out.println(edad1 + " es igual a " + edad2 + ": " + (edad1 == edad2));
        System.out.println(edad1 + " es diferente de " + edad2 + ": " + (edad1 != edad2));

        System.out.println(); // Salto de línea

        // 3. Determinar quién es mayor y la diferencia
        if (edad1 > edad2) {
            int diferencia = edad1 - edad2;
            System.out.println("El trabajador 1 es mayor.");
            System.out.println("La diferencia de edad es: " + diferencia + " años.");
        } else if (edad2 > edad1) {
            int diferencia = edad2 - edad1;
            System.out.println("El trabajador 2 es mayor.");
            System.out.println("La diferencia de edad es: " + diferencia + " años.");
        } else {
            System.out.println("Ambos trabajadores tienen la misma edad.");
            System.out.println("La diferencia de edad es: 0 años.");
        }

        scanner.close();
    }
}