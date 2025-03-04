public class App {
    public static void main(String[] args) {
        try {
            Car car = new Car(200, "Toyota", 30000, 150);
            Hovercraft hovercraft = new Hovercraft(80, "HoverX", 50000, 10);
            Ship ship = new Ship(40, "SeaMaster", 1000000, 50000);

            System.out.println("Car original price: " + car.getPrice());
            System.out.println("Car promo price: " + car.checkPromo(20));

            System.out.println("Hovercraft original price: " + hovercraft.getPrice());
            System.out.println("Hovercraft promo price: " + hovercraft.checkPromo(3));

            System.out.println("Ship original price: " + ship.getPrice());
            System.out.println("Ship promo price: " + ship.checkPromo(0.3));

            car.enterLand();
            hovercraft.enterLand();
            hovercraft.enterSea();
            ship.enterSea();

        } catch (PriceException | SpeedException e) {
            System.out.println(e.getMessage());
        }
    }
}
