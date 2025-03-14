import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        EventLog eventLog = new EventLog();
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        while (running) {
            System.out.println("\nChoose an operation:");
            System.out.println("1. Add event");
            System.out.println("2. Edit event");
            System.out.println("3. Remove event");
            System.out.println("4. Print events");
            System.out.println("5. Exit");

            if (!scanner.hasNextInt()) {
                System.out.println("Invalid input. Please enter a number.");
                scanner.next(); // Clear invalid input
                continue;
            }

            int choice = scanner.nextInt();
            scanner.nextLine();

            try {
                switch (choice) {
                    case 1:
                        System.out.println("Enter event description:");
                        String event = scanner.nextLine();
                        eventLog.addEvent(event);
                        break;
                    case 2:
                        System.out.println("Enter event index to edit:");
                        if (!scanner.hasNextInt()) {
                            System.out.println("Invalid index.");
                            scanner.next();
                            continue;
                        }
                        int editIndex = scanner.nextInt();
                        scanner.nextLine();
                        System.out.println("Enter new event description:");
                        String newEvent = scanner.nextLine();
                        eventLog.editEvent(editIndex, newEvent);
                        break;
                    case 3:
                        System.out.println("Enter event index to remove:");
                        if (!scanner.hasNextInt()) {
                            System.out.println("Invalid index.");
                            scanner.next();
                            continue;
                        }
                        int removeIndex = scanner.nextInt();
                        eventLog.removeEvent(removeIndex);
                        break;
                    case 4:
                        eventLog.print();
                        break;
                    case 5:
                        running = false;
                        break;
                    default:
                        System.out.println("Invalid choice. Please try again.");
                }
            } catch (EventLogFullException | InvalidEventIndexException e) {
                System.out.println("Error: " + e.getMessage());
            }
        }
        scanner.close();
    }
}
