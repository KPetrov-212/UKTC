package chapter_6;

import java.util.Scanner;

public class main02 {
    public static void main(String[] args) {
    	System.out.print("Enter N: ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i = 1; i <= n; i++) {
            if (i % 3 != 0 && i % 7 != 0) {
                System.out.println(i);
            }
        }
    }
}
