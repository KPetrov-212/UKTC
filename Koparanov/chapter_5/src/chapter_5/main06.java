package chapter_5;

import java.util.Scanner;

public class main06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Въведете 5 числа:");
        int largestNumber = Integer.MIN_VALUE;

        for (int i = 0; i < 5; i++) {
            System.out.print("Число " + (i + 1) + ": ");
            int number = scanner.nextInt();

            if (number > largestNumber) {
                largestNumber = number;
            }
        }

        System.out.println("Най-голямото число е: " + largestNumber);

        scanner.close();
    }
}
