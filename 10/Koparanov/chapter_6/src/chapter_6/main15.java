package chapter_6;

import java.util.Scanner;

public class main15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Въведете шестнайсетично число: ");
        String hexadecimal = scanner.nextLine();
        int decimal = hexadecimalToDecimal(hexadecimal);
        System.out.println("Десетичното представяне на числото е: " + decimal);
    }
    
    public static int hexadecimalToDecimal(String hexadecimal) {
        int decimal = 0;
        for (int i = 0; i < hexadecimal.length(); i++) {
            char digit = hexadecimal.charAt(i);
            int value;
            if (Character.isDigit(digit)) {
                value = digit - '0';
            } else {
                value = 10 + digit - 'A';
            }
            decimal = decimal * 16 + value;
        }
        return decimal;
    }
}
