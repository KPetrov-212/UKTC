public abstract class Vehicle {
    private int maxSpeed;
    private String model;
    private double price;

    // Конструктор с параметри
    public Vehicle(int maxSpeed, String model, double price) {
        this.maxSpeed = maxSpeed;
        this.model = model;
        this.price = price;
    }

    // Get методи
    public int getMaxSpeed() {
        return maxSpeed;
    }

    public String getModel() {
        return model;
    }

    public double getPrice() {
        return price;
    }

    // Set методи
    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }   

    public void setModel(String model) {
        this.model = model;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public abstract double checkPromo(double discountPercentage);
}