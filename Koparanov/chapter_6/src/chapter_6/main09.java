package chapter_6;

import java.util.Scanner;

public class main09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Въвеждане на числото N
        System.out.print("Въведете числото N: ");
        int N = scanner.nextInt();

        // Изчисляване на N-тото число на Каталан
        long catalanNumber = calculateCatalanNumber(N);

        // Отпечатване на резултата
        System.out.println("N-тото число на Каталан е: " + catalanNumber);

        scanner.close();
    }

    // Метод за изчисляване на факториел
    public static long factorial(int num) {
        long result = 1;
        for (int i = 1; i <= num; i++) {
            result *= i;
        }
        return result;
    }

    // Метод за изчисляване на N-тото число на Каталан
    public static long calculateCatalanNumber(int n) {
        long numerator = factorial(2 * n);
        long denominator = factorial(n + 1) * factorial(n);
        return numerator / denominator;
    }
}

