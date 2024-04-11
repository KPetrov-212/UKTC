package chapter_3;

public class main13 {
    public static void main(String[] args) {
        int n = 73;

        boolean isPrime = true;

        if (n < 2) {
            isPrime = false;
        } else {
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }

        if (isPrime) {
            System.out.println(n + " е просто число.");
        } else {
            System.out.println(n + " не е просто число.");
        }
    }
}
