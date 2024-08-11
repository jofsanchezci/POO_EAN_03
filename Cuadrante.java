import java.util.Scanner;

public class Cuadrante {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la coordenada x: ");
        int x = scanner.nextInt();

        System.out.print("Ingrese la coordenada y: ");
        int y = scanner.nextInt();

        if (x > 0 && y > 0) {
            System.out.println("El punto (" + x + ", " + y + ") está en el primer cuadrante.");
        } else if (x < 0 && y > 0) {
            System.out.println("El punto (" + x + ", " + y + ") está en el segundo cuadrante.");
        } else if (x < 0 && y < 0) {
            System.out.println("El punto (" + x + ", " + y + ") está en el tercer cuadrante.");
        } else if (x > 0 && y < 0) {
            System.out.println("El punto (" + x + ", " + y + ") está en el cuarto cuadrante.");
        } else if (x == 0 && y != 0) {
            System.out.println("El punto (" + x + ", " + y + ") está en el eje Y.");
        } else if (y == 0 && x != 0) {
            System.out.println("El punto (" + x + ", " + y + ") está en el eje X.");
        } else {
            System.out.println("El punto (" + x + ", " + y + ") está en el origen.");
        }
    }
}
