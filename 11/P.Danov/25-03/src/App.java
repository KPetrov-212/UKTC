public class App {
    public static void main(String[] args) {
        Adverts adverts = new Adverts();

        try {
            // Добавяне на автомобили
            adverts.addAutomobile(new Automobile("Toyota", "Corolla", 15000, 2020, "Petrol", "12345"));
            adverts.addAutomobile(new Automobile("Honda", "Civic", 18000, 2019, "Diesel", "67890"));
            adverts.addAutomobile(new Automobile("BMW", "X5", 50000, 2021, "Petrol", "54321"));

            // Опит за добавяне на дублиращ автомобил
            adverts.addAutomobile(new Automobile("Toyota", "Corolla", 15000, 2020, "Petrol", "12345"));
        } catch (DuplicateAutomobileException e) {
            System.out.println(e.getMessage());
        }

        // Печат на всички автомобили
        System.out.println("\nСписък с автомобили:");
        adverts.printAdverts();

        try {
            // Премахване на автомобил
            adverts.removeAutomobileByEngineSerialNumber("67890");

            // Опит за премахване на несъществуващ автомобил
            adverts.removeAutomobileByEngineSerialNumber("99999");
        } catch (AutomobileNotFoundException e) {
            System.out.println(e.getMessage());
        }

        // Печат на най-скъпия автомобил
        System.out.println("\nНай-скъпият автомобил:");
        adverts.printMostExpensiveAutomobile();

        // Филтриране по марка и модел
        System.out.println("\nАвтомобили с марка 'Toyota':");
        adverts.printAutomobilesByBrandAndModel("Toyota", "");

        System.out.println("\nВсички автомобили:");
        adverts.printAutomobilesByBrandAndModel("", "");
    }
}
