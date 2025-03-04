public class PriceException extends Exception {
    @Override
    public String getMessage() {
        return "Invalid price value!";
    }
}
