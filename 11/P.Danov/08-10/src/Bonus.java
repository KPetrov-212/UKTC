import java.util.Scanner;

public class Bonus {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);  // Create a Scanner object
        System.out.print("Въведете стойност за a: ");
        int a = scanner.nextInt();

        if (a >= 1 && a <=3) {
            a = a*10;
        }else if (a >= 4 && a <=6) {
                a = a*100;
        }else if (a >= 7 && a <=9) {
            a = a*1000;
        }else {
            System.out.println("Невалиден резултат");
        }

        System.out.println("Точки = " + a);
    }
}
