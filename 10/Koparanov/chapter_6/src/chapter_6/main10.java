package chapter_6;

import java.util.Scanner;

public class main10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Въвеждане на числото N
        System.out.print("Въведете положително цяло число N (N < 20): ");
        int N = scanner.nextInt();

        // Проверка дали входното число е валидно
        if (N <= 0 || N >= 20) {
            System.out.println("Моля, въведете число между 1 и 19 включително.");
        } else {
            // Генериране и отпечатване на матрицата
            generateAndPrintMatrix(N);
        }

        scanner.close();
    }

    // Метод за генериране и отпечатване на матрицата
    public static void generateAndPrintMatrix(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print((i + j) + " ");
            }
            System.out.println();
        }
    }
}
