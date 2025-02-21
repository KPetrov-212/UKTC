import java.util.Scanner;

class Film {
    private String name;
    private String producer;
    private double budget;
    private int year;
    private int uniqueId;

    // constructor - keyboard
    public Film() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter film name: ");
        this.name = scanner.nextLine();
        System.out.print("Enter producer: ");
        this.producer = scanner.nextLine();
        System.out.print("Enter budget: ");
        this.budget = scanner.nextDouble();
        System.out.print("Enter release year: ");
        this.year = scanner.nextInt();
        System.out.print("Enter unique ID: ");
        this.uniqueId = scanner.nextInt();
    }

    // Constructor - parameters
    public Film(String name, String producer, double budget, int year, int uniqueId) {
        this.name = name;
        this.producer = producer;
        this.budget = budget;
        this.year = year;
        this.uniqueId = uniqueId;
    }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getProducer() { return producer; }
    public void setProducer(String producer) { this.producer = producer; }

    public double getBudget() { return budget; }
    public void setBudget(double budget) { this.budget = budget; }

    public int getYear() { return year; }
    public void setYear(int year) { this.year = year; }

    public int getUniqueId() { return uniqueId; }
    public void setUniqueId(int uniqueId) { this.uniqueId = uniqueId; }

    public void printFilmInfo() {
        System.out.println("Film: " + name + ", Producer: " + producer + ", Budget: " + budget + ", Year: " + year + ", ID: " + uniqueId);
    }
}
