package zad1;
import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        double a;
        double b;
        double c;
        double h;

        System.out.println("Enter figure: ");
        String figure = s.nextLine();

        switch (figure){
            case "T":
                System.out.println("a: ");
                a = s.nextDouble();
                System.out.println("b: ");
                b = s.nextDouble();
                System.out.println("c: ");
                c = s.nextDouble();
                System.out.println("h: ");
                h = s.nextDouble();
                Triangle t = new Triangle(a, b, c, h);
                System.out.println("Area: " + t.getArea());
                System.out.println("Parameter: " + t.getParameter());
            case "R":
                System.out.println("a: ");
                a = s.nextDouble();
                System.out.println("b: ");
                b = s.nextDouble();
                Rectangular r = new Rectangular(a, b);
                System.out.println("Area: " + r.getArea());
                System.out.println("Parameter: " + r.getParameter());
        }
    }
}
