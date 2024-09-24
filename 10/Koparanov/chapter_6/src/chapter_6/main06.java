package chapter_6;

import java.util.Scanner;

public class main06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Въвеждане на числата N и K
        System.out.print("Въведете числото N (N > K > 1): ");
        int N = scanner.nextInt();

        System.out.print("Въведете числото K (1 < K < N): ");
        int K = scanner.nextInt();

        // Проверка на валидността на входа
        if (K <= 1 || K >= N) {
            System.out.println("Моля, въведете валидни стойности за N и K (1 < K < N).");
        } else {
            // Пресмятане на N!/K!
            long result = 1;
            for (int i = K + 1; i <= N; i++) {
                result *= i;
            }

            // Отпечатване на резултата
            System.out.println("Резултатът от N!/K! е: " + result);
        }

        scanner.close();
    }
}
