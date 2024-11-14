import java.util.ArrayList;
import java.util.List;

public class Store {
    private List<Product> products;

    public Store() {
        products = new ArrayList<>();
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public void sellProductByBrand(String brand, int amount) {
        for (Product product : products){
            if (product.getBrand() == brand && product.getQuantity() > 0){
                product.reduceQuantity(amount);
                System.out.println("Sold " + amount + " from product: " + brand);
                return;
            }
        }
        System.out.println("Product not available - " + brand);
    }

    public void sellProductByType(String type, int amount){
        for (Product product : products){
            if (product.getType() == type && product.getQuantity() > 0){
                product.reduceQuantity(amount);
                System.out.print("Sold " + amount + " from product: " + type);
            }
        }
        System.out.println("Product not available - " + type);
    }

    public void deliveryProduct(String brand, int amount){
        for (Product product : products){
            if (product.getBrand() == brand) {
                product.increaseQuantity(amount);
                System.out.println("Доставени " + amount + " броя от марка: " + brand);
                return;
            }
        }
        System.out.println("Продуктът за доставка не е намерен в наличност.");
    }
}