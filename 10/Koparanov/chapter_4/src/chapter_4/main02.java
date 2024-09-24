package chapter_4;

import java.util.Scanner;

public class main02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Въведете радиус на кръга (r): ");
        double radius = scanner.nextDouble();

        scanner.close();

        double perimeter = 2 * Math.PI * radius;

        double area = Math.PI * radius * radius;

        System.out.println("Периметър (обиколка) на кръга: " + perimeter);
        System.out.println("Област (лице) на кръга: " + area);
    }
}
