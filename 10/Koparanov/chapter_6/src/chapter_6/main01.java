package chapter_6;

import java.util.Scanner;

public class main01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter N: ");
        int n = scanner.nextInt();
        for (int i = 1; i <= n; i++) {
        	
            System.out.println(i);
        }
    }
}
