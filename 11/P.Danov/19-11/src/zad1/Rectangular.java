package zad1;

public class Rectangular extends Figure {

    public Rectangular(double a, double b) {
        super(a, b);
    }

    @Override
    public double getArea() {
        return a * b;
    }

    @Override
    public double getParameter() {
        return 2*(a + b);
    }
}
