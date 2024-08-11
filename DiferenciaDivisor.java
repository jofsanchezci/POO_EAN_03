import java.util.Scanner;

public class DiferenciaDivisor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el primer número: ");
        int num1 = scanner.nextInt();

        System.out.print("Ingrese el segundo número: ");
        int num2 = scanner.nextInt();

        int diferencia = Math.abs(num1 - num2);

        if (num1 % diferencia == 0 || num2 % diferencia == 0) {
            System.out.println("La diferencia " + diferencia + " es un divisor exacto de alguno de los dos números.");
        } else {
            System.out.println("La diferencia " + diferencia + " no es un divisor exacto de ninguno de los dos números.");
        }
    }
}
