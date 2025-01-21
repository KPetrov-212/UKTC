package zad;
import java.util.Scanner;

public class Car {
    private String model;
    private String brand;
    private double price;
    private int yearOfManufacture;
    private int id;

    public Car() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter model: ");
        this.model = scanner.nextLine();
        System.out.print("Enter brand: ");
        this.brand = scanner.nextLine();
        System.out.print("Enter price: ");
        this.price = scanner.nextDouble();
        System.out.print("Enter year of manufacture: ");
        this.yearOfManufacture = scanner.nextInt();
        System.out.print("Enter id: ");
        this.id = scanner.nextInt();
    }

    public Car(String model, String brand, double price, int yearOfManufacture, int id) {
        this.model = model;
        this.brand = brand;
        this.price = price;
        this.yearOfManufacture = yearOfManufacture;
        this.id = id;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getPrice() {
        return price;
    }
    

    public void setPrice(double price) {
        this.price = price;
    }

    public int getYearOfManufacture() {
        return yearOfManufacture;
    }

    public void setYearOfManufacture(int yearOfManufacture) {
        this.yearOfManufacture = yearOfManufacture;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void printCarInfo() {
        System.out.println("\nCar Information:");
        System.out.println("Model: " + model);
        System.out.println("Brand: " + brand);
        System.out.println("Price: " + price);
        System.out.println("Year of Manufacture: " + yearOfManufacture);
        System.out.println("ID: " + id);
    }
}
