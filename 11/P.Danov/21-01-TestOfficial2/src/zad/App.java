package zad;
public class App {
    public static void main(String[] args) throws Exception {
        Cars cars = new Cars();
        cars.addCar(new Car("Astra", "Opel", 10000, 2005, 1));
        cars.addCar(new Car("Astra", "Opel", 10000, 2005, 2));
        cars.addCar(new Car("Model S", "Tesla", 50000, 2020, 3));
        cars.addCar(new Car("Civic", "Honda", 15000, 2018, 4));
        cars.addCar(new Car("Mustang", "Ford", 30000, 2019, 5));
        
        System.out.println("Search cars:");
        cars.printCarsByBrand();

        cars.printHighestPriceCar();

        String brand = "Opel";
        double averagePrice = cars.getAveragePrice(brand);
        System.out.println("\nAverage price of " + brand + " cars: " + averagePrice);
    }
}
