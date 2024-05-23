package chapter_6;

import java.util.Scanner;

public class main11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Въвеждане на числото N
        System.out.print("Въведете числото N: ");
        int N = scanner.nextInt();

        // Пресмятане на броя нули в края на N!
        int countZeros = countTrailingZeros(N);

        // Отпечатване на резултата
        System.out.println("Броят на нулите в края на " + N + "! е: " + countZeros);

        scanner.close();
    }

    // Метод за пресмятане на броя нули в края на N!
    public static int countTrailingZeros(int n) {
        int count = 0;
        for (int i = 5; n / i >= 1; i *= 5) {
            count += n / i;
        }
        return count;
    }
}
