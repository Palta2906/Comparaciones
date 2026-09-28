import java.util.Scanner;

public class ComparacionSaldos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1. Entrada de datos
        System.out.print("Ingrese saldo de la cuenta 1: ");
        int c1 = scanner.nextInt();

        System.out.print("Ingrese saldo de la cuenta 2: ");
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

        // 3. Determinar qué cuenta tiene mayor saldo y la diferencia
        if (c1 > c2) {
            int diferencia = c1 - c2;
            System.out.println("La cuenta 1 tiene mayor saldo.");
            System.out.println("La diferencia es: S/ " + diferencia);
        } else if (c2 > c1) {
            int diferencia = c2 - c1;
            System.out.println("La cuenta 2 tiene mayor saldo.");
            System.out.println("La diferencia es: S/ " + diferencia);
        } else {
            System.out.println("Ambas cuentas tienen el mismo saldo.");
            System.out.println("La diferencia es: S/ 0");
        }

        scanner.close();
    }
}