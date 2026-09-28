import java.util.Scanner;

public class ComparacionProduccion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1. Entrada de datos
        System.out.print("Ingrese producción de la fábrica 1: ");
        int f1 = scanner.nextInt();

        System.out.print("Ingrese producción de la fábrica 2: ");
        int f2 = scanner.nextInt();

        System.out.println(); // Salto de línea

        // 2. Comparaciones relacionales
        System.out.println(f1 + " es mayor que " + f2 + ": " + (f1 > f2));
        System.out.println(f1 + " es menor que " + f2 + ": " + (f1 < f2));
        System.out.println(f1 + " es mayor o igual que " + f2 + ": " + (f1 >= f2));
        System.out.println(f1 + " es menor o igual que " + f2 + ": " + (f1 <= f2));
        System.out.println(f1 + " es igual a " + f2 + ": " + (f1 == f2));
        System.out.println(f1 + " es diferente de " + f2 + ": " + (f1 != f2));

        System.out.println(); // Salto de línea

        // 3. Determinar cuál produjo más y calcular la diferencia
        if (f1 > f2) {
            int diferencia = f1 - f2;
            System.out.println("La fábrica 1 produjo más.");
            System.out.println("Diferencia de producción: " + diferencia + " unidades.");
        } else if (f2 > f1) {
            int diferencia = f2 - f1;
            System.out.println("La fábrica 2 produjo más.");
            System.out.println("Diferencia de producción: " + diferencia + " unidades.");
        } else {
            System.out.println("Ambas fábricas produjeron la misma cantidad.");
            System.out.println("Diferencia de producción: 0 unidades.");
        }

        scanner.close();
    }
}