package chapter_5;

public class main03 {
    public static void main(String[] args) {
        int num1 = 25;
        int num2 = 10;
        int num3 = 30;
        
        if (num1 >= num2) {
            if (num1 >= num3) {
                System.out.println("Най-голямото число е: " + num1);
            } else {
                System.out.println("Най-голямото число е: " + num3);
            }
        } else {
            if (num2 >= num3) {
                System.out.println("Най-голямото число е: " + num2);
            } else {
                System.out.println("Най-голямото число е: " + num3);
            }
        }
    }
}
