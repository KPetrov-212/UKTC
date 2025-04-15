public class Magazines extends Releases {
    private String ISSN;

    public Magazines(String ISSN, String title, String price, int quantity) {
        super.setTitle(title);
        super.setPrice(price);
        super.setQuantity(quantity);
        this.ISSN = ISSN;
    }

    @Override
    public String getId() {
        return ISSN;
    }
}
