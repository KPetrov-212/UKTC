import java.util.ArrayList;
import java.util.Scanner;

class User {
    private String username;
    private String password;

    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }
}

public class RegisterLoginSystem {
    private ArrayList<User> users = new ArrayList<>();
    private Scanner scanner = new Scanner(System.in);

    // Register a new user
    public void register() {
        System.out.print("Enter a new username: ");
        String username = scanner.nextLine();
        System.out.print("Enter a password: ");
        String password = scanner.nextLine();

        // Check if username already exists
        for (User user : users) {
            if (user.getUsername().equals(username)) {
                System.out.println("Username already exists. Try a different username.");
                return;
            }
        }

        // Add the new user
        users.add(new User(username, password));
        System.out.println("Registration successful!");
    }

    // Log in an existing user
    public void login() {
        System.out.print("Enter username: ");
        String username = scanner.nextLine();
        System.out.print("Enter password: ");
        String password = scanner.nextLine();

        // Check credentials
        for (User user : users) {
            if (user.getUsername().equals(username) && user.getPassword().equals(password)) {
                System.out.println("Login successful! Welcome, " + username + "!");
                return;
            }
        }

        System.out.println("Invalid username or password.");
    }

    public static void main(String[] args) {
        RegisterLoginSystem system = new RegisterLoginSystem();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n1. Register");
            System.out.println("2. Login");
            System.out.println("3. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    system.register();
                    break;
                case 2:
                    system.login();
                    break;
                case 3:
                    System.out.println("Exiting program.");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
