public class Ship extends Vehicle implements IsSeaVessel {
    private double deadweight;

    public Ship(int maxSpeed, String model, double price, double deadweight) throws PriceException, SpeedException {
        super(maxSpeed, model, price);
        if (price < 0) throw new PriceException();
        if (maxSpeed < 0) throw new SpeedException();
        this.deadweight = deadweight;
    }

    public double getDeadweight() {
        return deadweight;
    }

    public void setDeadweight(double deadweight) {
        this.deadweight = deadweight;
    }

    @Override
    public void enterSea() {
        System.out.println("The ship is entering sea.");
    }

    @Override
    public double checkPromo(double discountPercentage) {
        return getPrice() * (1 - discountPercentage / 100);
    }
}
