public class Main{
    public static void main(String[] args) {
        Car myCar = new Car("Mazda", 2122);
        System.out.println(myCar.model);
        myCar.startEngine();
    }
}


class Car {
    String model;
    int year;

    Car(String model, int year){
        this.model = model;
        this.year = year;
    }

    void startEngine(){
        System.out.println("Brum brum");
    }
}