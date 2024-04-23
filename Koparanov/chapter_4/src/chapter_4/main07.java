package chapter_4;

import java.util.Scanner;

public class main07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int max = Integer.MIN_VALUE; 

        for (int i = 1; i <= 5; i++) {
            System.out.print("Въведете число " + i + ": ");
            int number = scanner.nextInt();

            if (number > max) {
                max = number; 
            }
        }

        System.out.println("Най-голямото число е: " + max);

        scanner.close();
    }
}
