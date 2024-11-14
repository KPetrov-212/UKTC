public class Product {
    private String brand;
    private String type;
    private double price;
    private int quantity;

    public Product(String brand, String type, double price, int quantity) {
        this.brand = brand;
        this.type = type;
        this.price = price;
        this.quantity = quantity;
    }

    public String getBrand() {
        return brand;
    }

    public String getType() {
        return type;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void reduceQuantity(int amount) {
        if (amount <= quantity) {
            quantity -= amount;
        } else {
            System.out.println("Недостатъчно количество!");
        }
    }

    public void increaseQuantity(int amount) {
        quantity += amount;
    }
}
