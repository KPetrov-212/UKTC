package chapter_4;

import java.util.Scanner;

public class main05 {

    public static void main(String[] args) {
    	Scanner input = new Scanner(System.in);
        System.out.printf("Enter a = ");
        int a = input.nextInt();
        System.out.printf("Enter b = ");
        int b = input.nextInt();
        int z, i, max;
        z = a - b;
        i = (z >> 31) & 0x1;
        max = a - i * z;
        System.out.println(max + " е по-голямото число!");
    }
 }

