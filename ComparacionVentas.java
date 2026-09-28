import java.util.Scanner;

public class ComparacionVentas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1. Entrada de datos
        System.out.print("Ingrese ventas del vendedor 1: ");
        int v1 = scanner.nextInt();

        System.out.print("Ingrese ventas del vendedor 2: ");
        int v2 = scanner.nextInt();

        System.out.println(); // Salto de línea

        // 2. Comparaciones relacionales
        System.out.println(v1 + " es mayor que " + v2 + ": " + (v1 > v2));
        System.out.println(v1 + " es menor que " + v2 + ": " + (v1 < v2));
        System.out.println(v1 + " es mayor o igual que " + v2 + ": " + (v1 >= v2));
        System.out.println(v1 + " es menor o igual que " + v2 + ": " + (v1 <= v2));
        System.out.println(v1 + " es igual a " + v2 + ": " + (v1 == v2));
        System.out.println(v1 + " es diferente de " + v2 + ": " + (v1 != v2));

        System.out.println(); // Salto de línea

        // 3. Resultado final y cálculo de la diferencia
        if (v1 > v2) {
            int diferencia = v1 - v2;
            System.out.println("El vendedor 1 realizó más ventas.");
            System.out.println("La diferencia es: S/ " + diferencia);
        } else if (v2 > v1) {
            int diferencia = v2 - v1;
            System.out.println("El vendedor 2 realizó más ventas.");
            System.out.println("La diferencia es: S/ " + diferencia);
        } else {
            System.out.println("Ambos vendedores realizaron la misma cantidad de ventas.");
            System.out.println("La diferencia es: S/ 0");
        }

        scanner.close();
    }
}