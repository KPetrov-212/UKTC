package chapter_6;

import java.util.Scanner;

public class main12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Въведете десетично число: ");
        int decimal = scanner.nextInt();
        String binary = decimalToBinary(decimal);
        System.out.println("Двоичното представяне на числото е: " + binary);
    }
    
    public static String decimalToBinary(int decimal) {
        if (decimal == 0) {
            return "0";
        }
        
        StringBuilder binary = new StringBuilder();
        while (decimal > 0) {
            int remainder = decimal % 2;
            binary.insert(0, remainder);
            decimal = decimal / 2;
        }
        
        return binary.toString();
    }
}

