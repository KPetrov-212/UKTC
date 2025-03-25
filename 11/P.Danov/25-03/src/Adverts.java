import java.util.ArrayList;
import java.util.List;

public class Adverts {
    private List<Automobile> automobiles;

    public Adverts() {
        this.automobiles = new ArrayList<>();
    }

    public Adverts(List<Automobile> automobiles) {
        this.automobiles = automobiles;
    }

    public List<Automobile> getAutomobiles() {
        return automobiles;
    }

    public void setAutomobiles(List<Automobile> automobiles) {
        this.automobiles = automobiles;
    }

    public void addAutomobile(Automobile automobile) throws DuplicateAutomobileException {
        for (Automobile a : automobiles) {
            if (a.getEngineSerialNumber().equals(automobile.getEngineSerialNumber())) {
                throw new DuplicateAutomobileException("Автомобилът вече е добавен в списъка!");
            }
        }
        this.automobiles.add(automobile);
    }

    public void removeAutomobileByEngineSerialNumber(String engineSerialNumber) throws AutomobileNotFoundException {
        Automobile toRemove = null;
        for (Automobile a : automobiles) {
            if (a.getEngineSerialNumber().equals(engineSerialNumber)) {
                toRemove = a;
                break;
            }
        }
        if (toRemove != null) {
            this.automobiles.remove(toRemove);
            System.out.println("Автомобилът е премахнат успешно.");
        } else {
            throw new AutomobileNotFoundException("Автомобил със сериен номер " + engineSerialNumber + " не е намерен.");
        }
    }

    public void printAdverts() {
        System.out.println("Automobile Adverts:");
        for (Automobile automobile : automobiles) {
            automobile.printInfo();
            System.out.println("--------------------");
        }
    }

    public void printAutomobilesByBrandAndModel(String brand, String model) {
        boolean found = false;
        for (Automobile automobile : automobiles) {
            if ((brand.isEmpty() || automobile.getBrand().equalsIgnoreCase(brand)) &&
                (model.isEmpty() || automobile.getModel().equalsIgnoreCase(model))) {
                automobile.printInfo();
                System.out.println("--------------------");
                found = true;
            }
        }
        if (!found) {
            System.out.println("Няма намерени автомобили с посочените марка и модел.");
        }
    }

    public void printMostExpensiveAutomobile() {
        if (automobiles.isEmpty()) {
            System.out.println("Няма налични автомобили в списъка.");
            return;
        }

        Automobile mostExpensive = automobiles.get(0);
        for (Automobile automobile : automobiles) {
            if (automobile.getPrice() > mostExpensive.getPrice()) {
                mostExpensive = automobile;
            }
        }

        System.out.println("Най-скъпият автомобил:");
        mostExpensive.printInfo();
    }
}
