package chapter_3;

import java.util.Scanner;

public class main7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Въведете тежестта си на Земята (в килограми): ");
        double weightOnEarth = scanner.nextDouble();

        
        double moonGravityFraction = 0.17;

        double weightOnMoon = weightOnEarth * moonGravityFraction;

        
        System.out.println("Тежестта ви на Луната би била: " + weightOnMoon + " килограма");

        scanner.close();
    }
}

