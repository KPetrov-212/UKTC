public class SpeedException extends Exception {
    @Override
    public String getMessage() {
        return "Invalid speed value!";
    }
}
