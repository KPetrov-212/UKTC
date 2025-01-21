package zad;
public class Cars{
    private Car[] cars;
    private int count;

    public Cars() {
        cars = new Car[15];
        count = 0;
    }

    public Car[] getCars() {
        return cars;
    }

    public void setCars(Car[] cars) {
        this.cars = cars;
    }

    public void addCar(Car car) {
        if (count>=15){
            System.out.println("Cars array is full.");
            return;
        }
        
        for (int i = 0; i < count; i++) {
            if (cars[i].getId() == car.getId()) {
                System.out.println("Car with id " + car.getId() + " already exists.");
                return;
            }
        }
        
        cars[count] = car;
        count++;
    }

    public void printCarsByBrand() {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.println("Enter brand:");
        String brand = scanner.nextLine();
        if (brand.isEmpty()) {
            for (int i = 0; i < count; i++) {
                cars[i].printCarInfo();
            }
        }else{ 
            for (int i = 0; i < count; i++) {
                if (cars[i].getBrand().equals(brand)) {
                    cars[i].printCarInfo();
                }
            }
        }
        scanner.close();
    }

    public void printHighestPriceCar() {
        if (count == 0) {
            System.out.println("No cars in the array.");
            return;
        }

        Car highestPriceCar = cars[0];
        for (int i = 1; i < count; i++) {
            if (cars[i].getPrice() > highestPriceCar.getPrice()) {
                highestPriceCar = cars[i];
            }
        }

        System.out.println("\n\nCar with the highest price:");
        highestPriceCar.printCarInfo();
    }

    public double getAveragePrice(String brand) {
        double total = 0;
        int brandCount = 0;

        for (int i = 0; i < count; i++) {
            if (brand.isEmpty() || cars[i].getBrand().equals(brand)) {
                total += cars[i].getPrice();
                brandCount++;
            }
        }

        if (brandCount == 0) {
            return 0;
        }

        return total / brandCount;
    }
}
