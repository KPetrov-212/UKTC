import java.time.LocalDate;
import java.util.List;

public class Product {
    private String name;
    private double price;
    private LocalDate expirationDate;
    private List<Manufacturer> manufacturers;

    public Product(String name, double price, LocalDate expirationDate, List<Manufacturer> manufacturers) {
        this.name = name;
        this.price = price;
        this.expirationDate = expirationDate;
        this.manufacturers = manufacturers;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public LocalDate getExpirationDate() {
        return expirationDate;
    }

    public List<Manufacturer> getManufacturers() {
        return manufacturers;
    }

    @Override
    public String toString() {
        return "Product: " + name + ", Price: " + price + ", Expiration Date: " + expirationDate + ", Manufacturers: " + manufacturers;
    }
}
