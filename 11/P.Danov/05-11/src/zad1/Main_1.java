package zad1;

public class Main_1 {
    public static void main(String[] args) {
        Laptop[] laptop = { new Laptop(140, "AMD", 16, 512),
                            new Laptop(140, "AMD", 8, 256)};
        boolean better = Laptop.isBetter(laptop[0], laptop[1]);
        System.out.println("Laptop 1 is better tha Laptop 2: " + better);
        System.out.println(Laptop.toString(laptop[0]));
    }
}
