package zad1;

public class Main_1 {
    public static void main(String[] args) {
        Laptop[] laptop = { new Laptop(140, "AMD", 16, 512),
                            new Laptop(140, "AMD", 8, 256)};
        System.out.println(laptop[0].isBetter(laptop[1]));
        System.out.println(laptop[0].toString());
        laptop[0].start();
        laptop[1].stop();
    }
}
