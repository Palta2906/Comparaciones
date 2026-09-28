import java.util.Scanner;

public class ComparacionSueldos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Lectura de datos
        System.out.print("Ingrese sueldo 1: ");
        double sueldo1 = scanner.nextDouble();

        System.out.print("Ingrese sueldo 2: ");
        double sueldo2 = scanner.nextDouble();

        System.out.println();

        // Formateo visual (imprime como entero si no tiene decimales)
        String s1 = (sueldo1 % 1 == 0) ? String.format("%.0f", sueldo1) : String.valueOf(sueldo1);
        String s2 = (sueldo2 % 1 == 0) ? String.format("%.0f", sueldo2) : String.valueOf(sueldo2);

        // Operadores relacionales
        System.out.println(s1 + " es mayor que " + s2 + ": " + (sueldo1 > sueldo2));
        System.out.println(s1 + " es menor que " + s2 + ": " + (sueldo1 < sueldo2));
        System.out.println(s1 + " es mayor o igual que " + s2 + ": " + (sueldo1 >= sueldo2));
        System.out.println(s1 + " es menor o igual que " + s2 + ": " + (sueldo1 <= sueldo2));
        System.out.println(s1 + " es igual a " + s2 + ": " + (sueldo1 == sueldo2));
        System.out.println(s1 + " es diferente de " + s2 + ": " + (sueldo1 != sueldo2));

        System.out.println();

        // Evaluación de quién gana más y la diferencia
        double diferencia;
        if (sueldo1 > sueldo2) {
            System.out.println("El practicante 1 gana más.");
            diferencia = sueldo1 - sueldo2;
        } else if (sueldo2 > sueldo1) {
            System.out.println("El practicante 2 gana más.");
            diferencia = sueldo2 - sueldo1;
        } else {
            System.out.println("Ambos practicantes ganan lo mismo.");
            diferencia = 0;
        }

        String difStr = (diferencia % 1 == 0) ? String.format("%.0f", diferencia) : String.valueOf(diferencia);
        System.out.println("La diferencia salarial es: S/ " + difStr);

        scanner.close();
    }
}