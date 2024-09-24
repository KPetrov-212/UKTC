package chapter_6;

import java.util.Scanner;

public class main14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Въведете десетично число: ");
        int decimal = scanner.nextInt();
        String hexadecimal = decimalToHexadecimal(decimal);
        System.out.println("Шестнайсетичното представяне на числото е: " + hexadecimal);
    }
    
    public static String decimalToHexadecimal(int decimal) {
        if (decimal == 0) {
            return "0";
        }
        
        StringBuilder hexadecimal = new StringBuilder();
        while (decimal > 0) {
            int remainder = decimal % 16;
            if (remainder < 10) {
                hexadecimal.insert(0, remainder);
            } else {
                hexadecimal.insert(0, (char) ('A' + remainder - 10));
            }
            decimal = decimal / 16;
        }
        
        return hexadecimal.toString();
    }
}

