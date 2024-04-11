package chapter_3;

import java.util.Scanner;

public class main8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Въведете координата x на точката O: ");
        double x = scanner.nextDouble();
        System.out.print("Въведете координата y на точката O: ");
        double y = scanner.nextDouble();

        scanner.close();

        double distanceToCenter = Math.sqrt(x * x + y * y);

        if (distanceToCenter < 5) {
            System.out.println("Точката О (" + x + ", " + y + ") е вътре в окръжността с център (0,0) и радиус 5.");
        } else if (distanceToCenter == 5) {
            System.out.println("Точката О (" + x + ", " + y + ") лежи на окръжността с център (0,0) и радиус 5.");
        } else {
            System.out.println("Точката О (" + x + ", " + y + ") е извън окръжността с център (0,0) и радиус 5.");
        }
    }
}


