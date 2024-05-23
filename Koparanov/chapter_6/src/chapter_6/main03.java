package chapter_6;

import java.util.Scanner;

public class main03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Въведете поредица от цели числа, разделени с интервал (или завършете с Enter):");
        
        // Четене на входа като един ред
        String input = scanner.nextLine();
        
        // Разделяне на входа на отделни числа
        String[] numbers = input.split(" ");
        
        // Инициализиране на променливите за най-малко и най-голямо число
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        
        // Обхождане на числата и намиране на най-малкото и най-голямото
        for (String numStr : numbers) {
            int num = Integer.parseInt(numStr);
            if (num < min) {
                min = num;
            }
            if (num > max) {
                max = num;
            }
        }
        
        // Отпечатване на резултатите
        System.out.println("Най-малкото число е: " + min);
        System.out.println("Най-голямото число е: " + max);
        
        scanner.close();
    }
}
