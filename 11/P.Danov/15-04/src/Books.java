public class Books extends Releases {
    private String ISBN;

    public Books(String ISBN, String title, String price, int quantity) {
        super.setTitle(title);
        super.setPrice(price);
        super.setQuantity(quantity);
        this.ISBN = ISBN;
    }

    @Override
    public String getId() {
        return ISBN;
    }
    
}
