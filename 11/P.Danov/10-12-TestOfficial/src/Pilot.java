import java.util.Scanner;

public class Pilot {
    private String name;
    private String number;
    private int bird_year;
    private int flight_hours;

    public Pilot(String name, String number, int birdYear, int flightHours) {
        this.name = name;
        this.number = number;
        this.bird_year = birdYear;
        this.flight_hours = flightHours;
    }

    public void setName(String name) {this.name = name;}
    public void setNumber(String number) {this.number = number;}
    public void setBird_year(int bird_year) {this.bird_year = bird_year;}
    public void setFlight_hours(int flight_hours) {this.flight_hours = flight_hours;}

    public String getName() {return name;}
    public String getNumber() {return number;}
    public int getBird_year() {return bird_year;}
    public int getFlight_hours() {return flight_hours;}

    public void inputPilotData(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("name: ");
        setName(scanner.nextLine());
        System.out.println("number: ");
        setNumber(scanner.nextLine());
        System.out.println("bird_year: ");
        setBird_year(scanner.nextInt());
        System.out.println("flight hours: ");
        setFlight_hours(scanner.nextInt());
    }

    public String toString(){
        return "Name:" + getName() + " Number:" + getNumber() + " Bird year:" + getBird_year() + " Flight hours:" + getFlight_hours();
    }

    public int howOld(int year){
        return year - getBird_year();
    }


}