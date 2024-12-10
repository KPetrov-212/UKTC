import java.util.Scanner;

public class Building {
    private int height;
    private double area;
    private String address;

    public Building(int height, double area, String address){
        this.height = height;
        this.area = area;
        this.address = address;
    }

    public int getHeight() {return height;}
    public double getArea() {return area;}
    public String getAddress() {return address;}

    public void setArea(double area) {this.area = area;}
    public void setHeight(int height) {this.height = height;}
    public void setAddress(String address) {this.address = address;}

    public void inputData(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("height");
        setHeight(scanner.nextInt());

        System.out.println("area");
        setArea(scanner.nextDouble());

        scanner.nextLine();
        System.out.println("address");
        setAddress(scanner.nextLine());
    }

    public void display() {
        System.out.println("Building:");
        System.out.println("height: " + height + " m");
        System.out.println("Area: " + area + " kb.m");
        System.out.println("address: " + address);
    }
}
