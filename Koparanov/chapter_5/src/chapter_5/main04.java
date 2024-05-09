package chapter_5;

import java.util.Scanner;

public class main04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Въведете цифра (от 0 до 9): ");
        int digit = scanner.nextInt();

        String digitName;

        switch (digit) {
            case 0:
                digitName = "нула";
                break;
            case 1:
                digitName = "едно";
                break;
            case 2:
                digitName = "две";
                break;
            case 3:
                digitName = "три";
                break;
            case 4:
                digitName = "четири";
                break;
            case 5:
                digitName = "пет";
                break;
            case 6:
                digitName = "шест";
                break;
            case 7:
                digitName = "седем";
                break;
            case 8:
                digitName = "осем";
                break;
            case 9:
                digitName = "девет";
                break;
            default:
                digitName = "невалидна цифра";
                break;
        }

        System.out.println("Името на цифрата е: " + digitName);

        scanner.close();
    }
}

