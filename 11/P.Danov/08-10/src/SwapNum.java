import java.util.Scanner;

public class SwapNum {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);  // Create a Scanner object
        System.out.print("Въведете стойност за a: ");
        double a = scanner.nextDouble();

        System.out.print("Въведете стойност за b: ");
        double b = scanner.nextDouble();
        if (a > b) {
            double temp = a;
            a = b;
            b = temp;
        }

        // Извеждане на резултатите
        System.out.println("Стойности след проверка:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        }
    }
