public class Provider {
    private String name;
    private String phoneNumber;

    // Constructor
    public Provider(String name, String phoneNumber) throws WrongPhoneNumberException {
        if (ValidatePhone.validatePhoneNumber(phoneNumber)) {
            this.name = name;
            this.phoneNumber = phoneNumber;
        }
    }

    // Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) throws WrongPhoneNumberException {
        if (ValidatePhone.validatePhoneNumber(phoneNumber)) {
            this.phoneNumber = phoneNumber;
        }
    }
}
