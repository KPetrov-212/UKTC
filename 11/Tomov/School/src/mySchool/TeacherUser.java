package mySchool;
public class TeacherUser implements Teacher {
    private String username;
    private String password;

    public TeacherUser(String username, String password) {
        this.username = username;
        this.password = password;
    }

    @Override public String getUsername() { return username; }
    @Override public String getRole() { return "teacher"; }

    @Override public void submitGrade() {
        System.out.println("Submitting student grade...");
    }

    @Override public void viewStudents() {
        System.out.println("Viewing student list...");
    }

    public String getPassword() {
        return password;
    }
}