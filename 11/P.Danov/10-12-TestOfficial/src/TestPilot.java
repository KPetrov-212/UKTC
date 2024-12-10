import java.util.Scanner;

public class TestPilot {
    public static void main(String[] args) {
        Pilot[] pilots = new Pilot[2];
        RetiredPilot[] retired_pilot = new RetiredPilot[2];

        pilots[0] = new Pilot("Ivan", "1", 1982, 100);
        pilots[1] = new Pilot("Petkan", "2", 1992, 90);

//        pilot[0] = new Pilot("", "", 0, 0);
//        pilot[0].inputPilotData();
        System.out.println(pilots[0].toString() + " year old:" + pilots[0].howOld(2024));

        retired_pilot[0] = RetiredPilot.retirement(pilots[0]);
        System.out.println(retired_pilot[0].toString());

        String numberSearched = "1";
        System.out.println("pilot with num " + numberSearched + " :" + findPilotByNumber(pilots, numberSearched));

        System.out.println("Update pilot 0");
        updatePilot(pilots[0]);
        System.out.println(pilots[0].toString());

        System.out.println("Most exprerienced: \n" + withMostFlightHours(pilots).toString());

    }

    public static boolean findPilotByNumber(Pilot[] pilots, String number) {
        for (Pilot p : pilots) {
            if (p.getNumber().equals(number)){
                return true;
            }
        }
        return false;
    }

    public static void updatePilot(Pilot pilot){
        Scanner scanner = new Scanner(System.in);
        System.out.println("New name: ");
        pilot.setName(scanner.nextLine());
        System.out.println("New number: ");
        pilot.setNumber(scanner.nextLine());
        System.out.println("New bird_year: ");
        pilot.setBird_year(scanner.nextInt());
        System.out.println("New flight hours: ");
        pilot.setFlight_hours(scanner.nextInt());
    }

    public static Pilot withMostFlightHours(Pilot[] pilots) {
        Pilot mostExperienced = null;
        int maxHours = 0;
        for (Pilot pilot : pilots) {
            if (pilot.getFlight_hours() > maxHours) {
                maxHours = pilot.getFlight_hours();
                mostExperienced = pilot;
            }
        }
        return mostExperienced;
    }
}