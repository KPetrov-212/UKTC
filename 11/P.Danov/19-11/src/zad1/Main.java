package zad1;

public class Main {
    public static void main(String[] args){
        Laptop laptop1 = new Laptop(200, "AMD", 16, 512);
        Laptop laptop2 = new Laptop(300, "Intel", 8, 256);
        System.out.println(laptop1.isBetter(laptop2));
        System.out.println(laptop2.toString());
    }
}