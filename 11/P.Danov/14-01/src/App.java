import java.time.LocalDate;
import java.util.Arrays;

public class App {
    public static void main(String[] args) {
        Manufacturer man1 = new Manufacturer("BrandA", "USA");
        Manufacturer man2 = new Manufacturer("BrandB", "Germany");

        Product prod1 = new Product("Milk", 2.50, LocalDate.of(2025, 2, 1), Arrays.asList(man1));
        Product prod2 = new Product("Chocolate", 3.00, LocalDate.of(2025, 3, 15), Arrays.asList(man1, man2));

        Department dep1 = new Department("Dairy", "Alice Johnson", Arrays.asList("Worker1", "Worker2"));
        Department dep2 = new Department("Confectionery", "Bob Smith", Arrays.asList("Worker3", "Worker4"));

        Hypermarket hypermarket = new Hypermarket();
        hypermarket.addDepartment(dep1);
        hypermarket.addDepartment(dep2);
        hypermarket.addProduct(prod1);
        hypermarket.addProduct(prod2);

        hypermarket.displayDepartments();
        hypermarket.displayProducts();
    }
}
