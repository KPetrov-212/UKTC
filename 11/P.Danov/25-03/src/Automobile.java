public class Automobile {
    private String brand;
    private String model;
    private double price;
    private int yearOfManufacture;
    private String fuelType;
    private String engineSerialNumber;

    public Automobile(String brand, String model, double price, int yearOfManufacture, String fuelType, String engineSerialNumber) {
        this.brand = brand;
        this.model = model;
        this.price = price;
        this.yearOfManufacture = yearOfManufacture;
        this.fuelType = fuelType;
        this.engineSerialNumber = engineSerialNumber;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
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

    public String getFuelType() {
        return fuelType;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }

    public String getEngineSerialNumber() {
        return engineSerialNumber;
    }

    public void setEngineSerialNumber(String engineSerialNumber) {
        this.engineSerialNumber = engineSerialNumber;
    }

    public void printInfo() {
        System.out.println("Automobile Information:");
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Price: $" + price);
        System.out.println("Year of Manufacture: " + yearOfManufacture);
        System.out.println("Fuel Type: " + fuelType);
        System.out.println("Engine Serial Number: " + engineSerialNumber);
    }
}
