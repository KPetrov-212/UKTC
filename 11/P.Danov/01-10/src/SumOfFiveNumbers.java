import java.util.Scanner;

public class SumOfFiveNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter five integers:");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();
        int num4 = scanner.nextInt();
        int num5 = scanner.nextInt();

        int sum = num1 + num2 + num3 + num4 + num5;
        System.out.println("The sum is: " + sum);
    }

}
