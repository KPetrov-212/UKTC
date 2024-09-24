import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Number of N: ");
        int N = scanner.nextInt();

        int[] numbers = new int[N];

        for (int i = 0; i < N; i++) {
            System.out.print("Enter N[" + (i + 1) + "]: ");
            numbers[i] = scanner.nextInt();
        }

        int maxNumber = numbers[0];
        int maxIndex = 0;

        for (int i = 1; i < N; i++) {
            if (numbers[i] > maxNumber) {
                maxNumber = numbers[i];
                maxIndex = i;
            }
        }

        System.out.println("Max num: " + maxNumber + " position[" + (maxIndex + 1) + "]");
    }
}