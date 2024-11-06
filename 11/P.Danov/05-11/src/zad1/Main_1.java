package zad1;

public class Main_1 {
    public static void main(String[] args) {
        Laptop laptop1 = new Laptop(140, "AMD", 16, 512);
        Laptop laptop2 = new Laptop(140, "AMD", 8, 256);
        boolean better = Laptop.isBetter(laptop1, laptop2);
        System.out.println("Laptop 1 is better tha Laptop 2: " + better);
        System.out.println(Laptop.toString(laptop1));
    }
}
