import java.util.Scanner;

public class House extends Building{
    private int floors;
    private String owner_name;
    private String owner_number;

    public House(int height, double area, String address, int floors, String owner_name, String owner_number) {
        super(height, area, address);
        this.floors = floors;
        this.owner_name = owner_name;
        this.owner_number = owner_number;
    }

    public int getFloors() {return floors;}
    public String getOwner_name() {return owner_name;}
    public String getOwner_number() {return owner_number;}

    public void setFloors(int floors) {this.floors = floors;}
    public void setOwner_name(String owner_name) {this.owner_name = owner_name;}
    public void setOwner_number(String owner_number) {this.owner_number = owner_number;}

    @Override
    public void inputData(){
        super.inputData();

        Scanner scanner = new Scanner(System.in);

        System.out.println("floors");
        setFloors(scanner.nextInt());

        scanner.nextLine();
        System.out.println("owner_name");
        setOwner_name(scanner.nextLine());

        System.out.println("owner_number");
        setOwner_number(scanner.nextLine());
    }

    @Override
    public void display(){
        super.display();
        System.out.println("House:");
        System.out.println("Floors: " + floors);
        System.out.println("owner: " + owner_name);
        System.out.println("phone: " + owner_number);
    }

    public static House findBiggestHouse(House[] array) {
        House bestHouse = array[0];
        for (House h : array) {
            if ((h.getHeight() / h.getFloors()) > (bestHouse.getHeight() / bestHouse.getFloors())){
                bestHouse = h;
            }
        }
        return bestHouse;
    }
}
