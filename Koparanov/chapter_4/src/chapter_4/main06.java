package chapter_4;

import java.util.Scanner;

public class main06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sum = 0;

        for (int i = 1; i <= 5; i++) {
            System.out.print("Въведете число " + i + ": ");
            int number = scanner.nextInt();
            sum += number; 
        }

        
        System.out.println("Сумата на въведените числа е: " + sum);

        scanner.close();
    }
}
