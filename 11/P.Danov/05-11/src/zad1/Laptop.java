package zad1;

public class Laptop extends Electronic {
    private int ram;
    private int hdd;

    Laptop(double watts, String cpu_model, int ram, int hdd) {
        super(watts, cpu_model);
        this.ram = ram;
        this.hdd = hdd;
    }

    public boolean isBetter(Laptop laptop) {
        return hdd > laptop.hdd && ram > laptop.ram;
    }

    public String toString(){
        return "Watts:" + getWatts() + " Cpu:" + getCpu_model() + " Ram:" + getRam() + " Hdd:" + getHdd();
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
