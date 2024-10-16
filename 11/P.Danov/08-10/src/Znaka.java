import java.util.Scanner;

public class Znaka {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);  // Create a Scanner object
        System.out.print("Въведете стойност за a, b, c: ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        if (a == 0 || b == 0 || c == 0){
            System.out.println("Произведението e '0'");
        }else {
            int negativeCount = 0;

            if (a < 0) {
                negativeCount++;
            }
            if (b < 0) {
                negativeCount++;
            }
            if (c < 0) {
                negativeCount++;
            }

            if (negativeCount % 2 == 0) {
                System.out.println("Знакът на произведението е '+'");
            } else {
                System.out.println("Знакът на произведението е '-'");
            }
            
        }
    }
}
