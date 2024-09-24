package chapter_3;

public class main11 {
    public static void main(String[] args) {
        int n = 255; 
        int p = 5; 

        int mask = 1 << p;

        int bitValue = (n & mask) != 0 ? 1 : 0;

        System.out.println("Стойността на бита на позиция " + p + " в числото " + n + " е: " + bitValue);
    }
}
