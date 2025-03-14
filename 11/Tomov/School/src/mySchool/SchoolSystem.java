package mySchool;
import java.util.Scanner;

public class SchoolSystem {
    private static Scanner scanner = new Scanner(System.in);
    private static AuthService authService = new AuthService();

    public static void main(String[] args) {
        while (true) {
            System.out.println("\nWelcome to School System");
            System.out.println("1. Create New User");
            System.out.println("2. Login");
            System.out.println("3. Exit");
            System.out.print("Choice: ");
            
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline
            
            switch (choice) {
                case 1 -> createNewUser();
                case 2 -> login();
                case 3 -> {
                    System.out.println("Exiting...");
                    return;
                }
                default -> System.out.println("Invalid choice!");
            }
        }
    }

    private static void createNewUser() {
        System.out.print("Enter username: ");
        String username = scanner.nextLine();
        System.out.print("Enter password: ");
        String password = scanner.nextLine();
        System.out.print("Enter role (admin/teacher/student): ");
        String role = scanner.nextLine().toLowerCase();

        switch (role) {
            case "admin" -> authService.addUser(new AdminUser(username, password));
            case "teacher" -> authService.addUser(new TeacherUser(username, password));
            case "student" -> authService.addUser(new StudentUser(username, password));
            default -> {
                System.out.println("Invalid role!");
                return;
            }
        }
        System.out.println("User created successfully!");
    }

    private static void login() {
        System.out.print("Username: ");
        String username = scanner.nextLine();
        System.out.print("Password: ");
        String password = scanner.nextLine();
        System.out.print("Role (admin/teacher/student): ");
        String role = scanner.nextLine().toLowerCase();

        User user = authService.login(username, password, role);
        
        if (user != null) {
            System.out.println("Login successful!");
            showRoleMenu(user);
        } else {
            System.out.println("Invalid credentials or role!");
        }
    }

    private static void showRoleMenu(User user) {
        switch (user.getRole()) {
            case "admin" -> adminMenu((Admin) user);
            case "teacher" -> teacherMenu((Teacher) user);
            case "student" -> studentMenu((Student) user);
        }
    }

    private static void adminMenu(Admin admin) {
        while (true) {
            System.out.println("\nAdmin Menu");
            System.out.println("1. Approve Funding");
            System.out.println("2. Manage Staff");
            System.out.println("3. Logout");
            System.out.print("Choice: ");
            
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline
            
            switch (choice) {
                case 1 -> admin.approveFunding();
                case 2 -> admin.manageStaff();
                case 3 -> { return; }
                default -> System.out.println("Invalid choice!");
            }
        }
    }

    private static void teacherMenu(Teacher teacher) {
        while (true) {
            System.out.println("\nTeacher Menu");
            System.out.println("1. Submit Grade");
            System.out.println("2. View Students");
            System.out.println("3. Logout");
            System.out.print("Choice: ");
            
            int choice = scanner.nextInt();
            scanner.nextLine();
            
            switch (choice) {
                case 1 -> teacher.submitGrade();
                case 2 -> teacher.viewStudents();
                case 3 -> { return; }
                default -> System.out.println("Invalid choice!");
            }
        }
    }

    private static void studentMenu(Student student) {
        while (true) {
            System.out.println("\nStudent Menu");
            System.out.println("1. View Grades");
            System.out.println("2. Submit Assignment");
            System.out.println("3. Logout");
            System.out.print("Choice: ");
            
            int choice = scanner.nextInt();
            scanner.nextLine();
            
            switch (choice) {
                case 1 -> student.viewGrades();
                case 2 -> student.submitAssignment();
                case 3 -> { return; }
                default -> System.out.println("Invalid choice!");
            }
        }
    }
}