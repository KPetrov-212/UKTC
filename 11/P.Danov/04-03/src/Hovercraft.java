public class Hovercraft extends Vehicle implements IsLandVehicle, IsSeaVessel {
    private int passengers;

    public Hovercraft(int maxSpeed, String model, double price, int passengers) throws PriceException, SpeedException {
        super(maxSpeed, model, price);
        if (price < 0) throw new PriceException();
        if (maxSpeed < 0) throw new SpeedException();
        this.passengers = passengers;
    }

    public int getPassengers() {
        return passengers;
    }

    public void setPassengers(int passengers) {
        this.passengers = passengers;
    }

    @Override
    public void enterLand() {
        System.out.println("The hovercraft is entering land.");
    }

    @Override
    public void enterSea() {
        System.out.println("The hovercraft is entering sea.");
    }

    @Override
    public double checkPromo(double discountPercentage) {
        return getPrice() * (1 - discountPercentage / 100);
    }
}
