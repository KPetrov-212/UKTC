import java.util.ArrayList;
import java.util.List;

class Hypermarket {
    private List<Department> departments;
    private List<Product> products;

    public Hypermarket() {
        this.departments = new ArrayList<>();
        this.products = new ArrayList<>();
    }

    public void addDepartment(Department department) {
        departments.add(department);
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public void displayProducts() {
        System.out.println("Available Products:");
        for (Product product : products) {
            System.out.println(product);
        }
    }

    public void displayDepartments() {
        System.out.println("Departments:");
        for (Department department : departments) {
            System.out.println(department);
        }
    }
}