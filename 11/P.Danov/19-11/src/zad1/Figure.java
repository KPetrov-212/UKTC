package zad1;

public abstract class Figure {
    double a;
    double b;

    public Figure(double a, double b){
        this.a = a;
        this.b = b;
    }

    public abstract double getArea();
    public abstract double getParameter();
}
