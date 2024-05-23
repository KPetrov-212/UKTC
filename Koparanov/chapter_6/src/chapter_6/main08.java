package chapter_6;

import java.util.Scanner;

public class main08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Въвеждане на числата N и x
        System.out.print("Въведете числото N: ");
        int N = scanner.nextInt();

        System.out.print("Въведете числото x: ");
        double x = scanner.nextDouble();

        // Пресмятане на сумата S
        double sum = 1.0; // започваме със сумата 1
        long factorial = 1; // факториелът на 0 е 1

        for (int i = 1; i <= N; i++) {
            factorial *= i; // пресмятаме i!
            sum += factorial / Math.pow(x, i); // добавяме текущия член към сумата
        }

        // Отпечатване на резултата
        System.out.println("Сумата S е: " + sum);

        scanner.close();
    }
}
