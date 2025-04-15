public interface ValidatePhone {
    static boolean validatePhoneNumber(String phoneNumber) throws WrongPhoneNumberException {
        if (phoneNumber == null || !phoneNumber.matches("\\d+")) {
            throw new WrongPhoneNumberException("Invalid phone number: " + phoneNumber);
        }
        return true;
    }
}