public class Electronics extends Product {
    private String manufacturer;
    private String model;

    // Constructor
    public Electronics(int inventoryNumber, double price, int quantity, Provider provider, String manufacturer, String model) {
        super(inventoryNumber, price, quantity, provider);
        this.manufacturer = manufacturer;
        this.model = model;
    }

    @Override
    public double getPromotionalPrice() {
        return getPrice() * 0.9; // 10% discount
    }

    @Override
    public boolean sellProduct(int piece) throws NoMoreProductsException {
        if (getQuantity() < piece) {
            throw new NoMoreProductsException("Not enough products in stock!");
        }
        setQuantity(getQuantity() - piece);
        return true;
    }

    // Getters and Setters
    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
}