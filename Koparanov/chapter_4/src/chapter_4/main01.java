package chapter_4;

import java.util.Scanner;

public class main01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Въведете първото число: ");
        int firstNumber = scanner.nextInt();

        System.out.print("Въведете второто число: ");
        int secondNumber = scanner.nextInt();

        System.out.print("Въведете третото число: ");
        int thirdNumber = scanner.nextInt();

        scanner.close();

        int sum = firstNumber + secondNumber + thirdNumber;

        System.out.println("Сумата на въведените числа е: " + sum);
    }
}
