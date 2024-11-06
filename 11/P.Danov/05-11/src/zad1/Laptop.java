package zad1;

public class Laptop extends Electronic {
    private int ram;
    private int hdd;

    Laptop(double watts, String cpu_model, int ram, int hdd) {
        super(watts, cpu_model);
        this.ram = ram;
        this.hdd = hdd;
    }

    public static boolean isBetter(Laptop laptop1, Laptop laptop2) {
        return laptop1.getRam() > laptop2.getRam() && laptop1.getHdd() > laptop2.getHdd();
    }

    public static String toString(Laptop laptop){
        return "Watts:" + laptop.getWatts() + " Cpu:" + laptop.getCpu_model() + " Ram:" + laptop.getRam() + " Hdd:" + laptop.getHdd();
    }

    //    gets and sets
    public int getRam(){
        return ram;
    }

    public int getHdd(){
        return hdd;
    }

    public void setRam(int newRam){
        this.ram = newRam;
    }

    public void setHdd(int newHdd){
        this.hdd = newHdd;
    }

}
