package chapter_6;

import java.util.Scanner;

public class main07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Въвеждане на числата N и K
        System.out.print("Въведете числото N: ");
        int N = scanner.nextInt();

        System.out.print("Въведете числото K: ");
        int K = scanner.nextInt();

        
        // Пресмятане на факториелите
        long factorialN = factorial(N);
        long factorialK = factorial(K);
        long factorialNminusK = factorial(N - K);

        // Пресмятане на израза
        long result = (factorialN * factorialK) / factorialNminusK;

        // Отпечатване на резултата
        System.out.println("Резултатът от N!*K!/(N-K)! е: " + result);
        

        scanner.close();
    }

    // Метод за пресмятане на факториел
    public static long factorial(int num) {
        long result = 1;
        for (int i = 1; i <= num; i++) {
            result *= i;
        }
        return result;
    }
}

