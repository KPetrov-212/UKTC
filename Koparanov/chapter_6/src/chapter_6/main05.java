package chapter_6;

import java.util.Scanner;

public class main05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Въведете числото N: ");
        int N = scanner.nextInt();
        
        // Проверка дали N е положително число
        if (N <= 0) {
            System.out.println("Моля, въведете положително число.");
        } else {
            long sum = 0;
            long first = 0;
            long second = 1;
            
            for (int i = 1; i <= N; i++) {
                if (i == 1) {
                    sum += first;
                } else if (i == 2) {
                    sum += second;
                } else {
                    long next = first + second;
                    sum += next;
                    first = second;
                    second = next;
                }
            }
            
            System.out.println("Сумата на първите " + N + " члена от редицата на Фибоначи е: " + sum);
        }
        
        scanner.close();
    }
}
