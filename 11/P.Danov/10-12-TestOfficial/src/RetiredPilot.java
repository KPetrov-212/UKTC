import java.util.Scanner;

public class RetiredPilot extends Pilot{
    private int retire_year;

    public RetiredPilot(String name, String number, int birdYear, int flightHours, int retire_year) {
        super(name, number, birdYear, flightHours);
        this.retire_year = retire_year;
    }

    public int getRetire_year() {return retire_year;}
    public void setRetire_year(int retire_year) {this.retire_year = retire_year;}

    public static RetiredPilot retirement(Pilot pilot){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Retire year:");
        return new RetiredPilot(pilot.getName(), pilot.getNumber(), pilot.getBird_year(), pilot.getFlight_hours(), scanner.nextInt());
    }

    @Override
    public String toString(){
        return super.toString() + " retire year:" + getRetire_year();
    }
}



