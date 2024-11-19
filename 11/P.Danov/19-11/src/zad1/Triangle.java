package zad1;

public class Triangle extends Figure {
    double c;
    double h;

    public Triangle(double a, double b, double c, double h) {
        super(a, b);
        this.c = c;
        this.h = h;
    }

    @Override
    public double getArea() {
        return (b * h) / 2;
    }

    @Override
    public double getParameter() {
        return a + b + c;
    }
}
