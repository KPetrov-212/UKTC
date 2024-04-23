package chapter_4;

import java.util.Scanner;

public class main04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Въведете първото число (a): ");
        int a = scanner.nextInt();

        System.out.print("Въведете второто число (b): ");
        int b = scanner.nextInt();

        scanner.close();

        int start = a + (5 - a % 5) % 5;
        int end = b - (b % 5);
        int count = (end - start) / 5 + 1;

        System.out.println("Брой на числата, които се делят на 5 в интервала [" + a + ", " + b + "]: " + count);

        /*
        int count = 0;
        for (int i = a; i <= b; i++) {
            if (i % 5 == 0) {
                count++;
            }
        }
        System.out.println("Брой на числата, които се делят на 5 в интервала [" + a + ", " + b + "]: " + count);
        */
    }
}
