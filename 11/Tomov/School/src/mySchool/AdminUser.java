package mySchool;
public class AdminUser implements Admin {
    private String username;
    private String password;

    public AdminUser(String username, String password) {
        this.username = username;
        this.password = password;
    }

    @Override public String getUsername() { return username; }
    @Override public String getRole() { return "admin"; }

    @Override public void approveFunding() {
        System.out.println("Funding approved by admin");
    }

    @Override public void manageStaff() {
        System.out.println("Managing staff...");
    }

    public String getPassword() {
        return password;
    }
}