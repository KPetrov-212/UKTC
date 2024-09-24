package chapter_3;

public class main12 {
    public static void main(String[] args) {
        int n = 35; 
        int p = 5; 
        int v = 0; 

        int mask = 1 << p;

        if (v == 1) {
            n = n | mask;
        } else {
            n = n & ~mask;
        }

        System.out.println("Променената стойност на числото е: " + n);
    }
}
