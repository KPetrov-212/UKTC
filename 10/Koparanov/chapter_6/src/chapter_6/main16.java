package chapter_6;

import java.util.Random;
import java.util.Scanner;

public class main16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Въведете число N: ");
        int N = scanner.nextInt();
        
        int randomNumber = generateRandomNumber(N);
        System.out.println("Случайно число между 1 и " + N + " е: " + randomNumber);
    }
    
    public static int generateRandomNumber(int N) {
        Random random = new Random();
        return random.nextInt(N) + 1;
    }
}
