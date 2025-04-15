public class Book extends Product {
    private String author;
    private String title;

    // Constructor
    public Book(int inventoryNumber, double price, int quantity, Provider provider, String author, String title) {
        super(inventoryNumber, price, quantity, provider);
        this.author = author;
        this.title = title;
    }

    @Override
    public double getPromotionalPrice() {
        return getPrice() * 0.5; // 50% discount
    }

    @Override
    public boolean sellProduct(int piece) throws NoMoreProductsException {
        if (getQuantity() < piece) {
            throw new NoMoreProductsException("Not enough books in stock!");
        }
        setQuantity(getQuantity() - piece);
        return true;
    }

    // Getters and Setters
    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}