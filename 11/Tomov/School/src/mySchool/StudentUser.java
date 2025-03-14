package mySchool;
public class StudentUser implements Student {
    private String username;
    private String password;

    public StudentUser(String username, String password) {
        this.username = username;
        this.password = password;
    }

    @Override public String getUsername() { return username; }
    @Override public String getRole() { return "student"; }

    @Override public void viewGrades() {
        System.out.println("Viewing grades...");
    }

    @Override public void submitAssignment() {
        System.out.println("Submitting assignment...");
    }

    public String getPassword() {
        return password;
    }
}