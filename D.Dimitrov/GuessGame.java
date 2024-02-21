import java.util.Scanner;

public class GuessGame{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = 1 + (int)(100 * Math.random());

        int guess = 0;

        while (guess != number) {
            System.out.print("guess: ");
            guess = scanner.nextInt();

            if (guess == number) {
                System.out.println("--Nice!-- You quessed the number");

            }else if (guess < number) {
                System.out.println("Hint: Higher! ");
            }else if (guess > number) {
                System.out.println("Hint: Lower! ");
            }
        }
    }
}