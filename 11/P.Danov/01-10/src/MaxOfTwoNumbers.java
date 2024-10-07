import java.util.Scanner;

public class MaxOfTwoNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter two integers:");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();

        int max = Math.max(num1, num2);
        System.out.println(max + " is bigger");
    }
}
