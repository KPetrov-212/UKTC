package chapter_3;

import java.util.Scanner;

public class main9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Въведете координата x на точката O: ");
        double x = scanner.nextDouble();
        System.out.print("Въведете координата y на точката O: ");
        double y = scanner.nextDouble();

        scanner.close();

        double distanceToCenter = Math.sqrt(x * x + y * y);

        boolean isInCircle = distanceToCenter < 5;

        boolean isOutsideRectangle = x <= -1 || x >= 5 || y <= 1 || y >= 5;

        if (isInCircle && isOutsideRectangle) {
            System.out.println("Точката О (" + x + ", " + y + ") е вътре в окръжността и извън правоъгълника.");
        } else {
            System.out.println("Точката О (" + x + ", " + y + ") не отговаря на условието.");
        }
    }
}
