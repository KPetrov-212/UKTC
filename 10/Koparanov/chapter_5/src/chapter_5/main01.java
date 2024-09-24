package chapter_5;

public class main01 {
    public static void main(String[] args) {
        int a = 5;
        int b = 10;

        System.out.println("Първоначални стойности: a = " + a + ", b = " + b);

        if (a > b) {
            int temp = a;
            a = b;
            b = temp;

            System.out.println("Стойности след размяната: a = " + a + ", b = " + b);
        } else {
            System.out.println("Стойностите не се разменят, защото a <= b");
        }
    }
}
