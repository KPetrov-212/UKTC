import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter side 1: ");
            int side1 = scanner.nextInt();

            System.out.print("Enter side 2: ");
            int side2 = scanner.nextInt();

            System.out.print("Enter side 3: ");
            int side3 = scanner.nextInt();

            if (canFormTriangle(side1, side2, side3)) {
                System.out.println("The sides can form a triangle.");
            } else {
                throw new IllegalArgumentException("The sides cannot form a triangle.");
            }
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        } finally {
            scanner.close();
        }
    }

    public static boolean canFormTriangle(int a, int b, int c) {
        return (a + b > c) && (a + c > b) && (b + c > a);
    }
}