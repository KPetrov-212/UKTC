public interface ValidateISSN {
    public static boolean validateISSN(String issn) throws WrongISSNException {
        if (issn.length() != 10) {
            throw new WrongISSNException("ISSN must be exactly 10 characters long.");
        }
        return true;
    }
}
