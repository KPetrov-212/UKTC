package chapter_3;

import java.util.Scanner;

public class main10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Въведете четирицифрено число (abcd): ");
        int number = scanner.nextInt();
        scanner.close();

        int sumOfDigits = 0;
        int tempNumber = number;
        while (tempNumber != 0) {
            int digit = tempNumber % 10;
            sumOfDigits += digit;
            tempNumber /= 10;
        }
        System.out.println("Сумата от цифрите на числото е: " + sumOfDigits);

        int reversedNumber = 0;
        tempNumber = number;
        while (tempNumber != 0) {
            int digit = tempNumber % 10;
            reversedNumber = reversedNumber * 10 + digit;
            tempNumber /= 10;
        }
        System.out.println("Числото в обратен ред е: " + reversedNumber);

        int lastDigit = number % 10;
        int restOfNumber = number / 10;
        int movedDigitToFront = lastDigit * 1000 + restOfNumber;
        System.out.println("Числото с последната цифра на първо място е: " + movedDigitToFront);

        int a = number / 1000;
        int b = (number / 100) % 10;
        int c = (number / 10) % 10;
        int d = number % 10;
        int swappedDigits = a * 1000 + c * 100 + b * 10 + d;
        System.out.println("Числото с разменени втора и трета цифра е: " + swappedDigits);
    }
}
