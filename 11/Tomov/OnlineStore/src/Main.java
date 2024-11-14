public class Main {
    public static void main(String[] args) {
        Store store = new Store();

        Product product1 = new Product("Apple", "Phone", 999.99, 10);
        Product product2 = new Product("Samsung", "Phone", 899.99, 5);
        Product product3 = new Product("Sony", "TV", 1199.99, 3);

        store.addProduct(product1);
        store.addProduct(product2);
        store.addProduct(product3);

        store.sellProductByBrand("Apple", 2);
        store.sellProductByType("TV", 2);
        store.deliveryProduct("Samsung", 10);
    }
}