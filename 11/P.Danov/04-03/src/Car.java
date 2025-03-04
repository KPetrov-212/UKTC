public class Car extends Vehicle implements IsLandVehicle {
    private int kW;

    public Car(int maxSpeed, String model, double price, int kW) throws PriceException, SpeedException {
        super(maxSpeed, model, price);
        if (price < 0) throw new PriceException();
        if (maxSpeed < 0) throw new SpeedException();
        this.kW = kW;
    }

    public int getKW() {
        return kW;
    }

    public void setKW(int kW) {
        this.kW = kW;
    }

    @Override
    public void enterLand() {
        System.out.println("The car is entering land.");
    }

    @Override
    public double checkPromo(double discountPercentage) {
        return getPrice() * (1 - discountPercentage / 100);
    }
}
