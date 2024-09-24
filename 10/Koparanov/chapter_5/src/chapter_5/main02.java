package chapter_5;

public class main02 {
    public static void main(String[] args) {
        double a = 20.0;
        double b = 3.0;

        if (a > 0 && b > 0) {
            System.out.println("Знакът на частното a / b е +");
        } else if (a < 0 && b < 0) {
            System.out.println("Знакът на частното a / b е +");
        } else if ((a > 0 && b < 0) || (a < 0 && b > 0)) {
            System.out.println("Знакът на частното a / b е -");
        } else if (a == 0 || b == 0) {
            System.out.println("Частното a / b е нула (0)");
        } else {
            System.out.println("Не можем да определим знака на частното a / b");
        }
    }
}
