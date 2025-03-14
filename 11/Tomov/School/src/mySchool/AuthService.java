package mySchool;
import java.util.HashMap;
import java.util.Map;

public class AuthService {
    private Map<String, User> users = new HashMap<>();

    public AuthService() {
        // Initialize with sample users
        users.put("admin1", new AdminUser("admin1", "admin123"));
        users.put("teacher1", new TeacherUser("teacher1", "teach123"));
        users.put("student1", new StudentUser("student1", "stud123"));
    }

    public void addUser(User user) {
        users.put(user.getUsername(), user);
    }

    public User login(String username, String password, String role) {
        User user = users.get(username);
        if (user != null && user.getPassword().equals(password) && user.getRole().equals(role)) {
            return user;
        }
        return null;
    }
}