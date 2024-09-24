package chapter_6;

import java.util.Scanner;

public class main13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Въведете двоично число: ");
        String binary = scanner.nextLine();
        int decimal = binaryToDecimal(binary);
        System.out.println("Десетичното представяне на числото е: " + decimal);
    }
    
    public static int binaryToDecimal(String binary) {
        int decimal = 0;
        int power = 0;
        for (int i = binary.length() - 1; i >= 0; i--) {
            int digit = binary.charAt(i) - '0';
            decimal += digit * Math.pow(2, power);
            power++;
        }
        return decimal;
    }
}
