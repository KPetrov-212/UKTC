package chapter_5;

import java.util.Scanner;

public class main05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Въведете коефициентите на квадратното уравнение ax^2 + bx + c = 0:");
        System.out.print("a = ");
        double a = scanner.nextDouble();
        System.out.print("b = ");
        double b = scanner.nextDouble();
        System.out.print("c = ");
        double c = scanner.nextDouble();

        double discriminant = b * b - 4 * a * c;

        if (discriminant > 0) {
            double root1 = (-b + Math.sqrt(discriminant)) / (2 * a);
            double root2 = (-b - Math.sqrt(discriminant)) / (2 * a);
            System.out.println("Уравнението има два различни реални корена:");
            System.out.println("x1 = " + root1);
            System.out.println("x2 = " + root2);
        } else if (discriminant == 0) {
            double root = -b / (2 * a);
            System.out.println("Уравнението има един двоен реален корен:");
            System.out.println("x = " + root);
        } else {
            System.out.println("Уравнението няма реални корени (корените са комплексни числа)");
        }

        scanner.close();
    }
}
