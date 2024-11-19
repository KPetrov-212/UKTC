package zad1;

public class Laptop extends Electronic{
    private int ram;
    private int hdd;

    public Laptop(int wh, String cpu, int ram, int hdd) {
        super(wh, cpu);
        this.ram = ram;
        this.hdd = hdd;
    }

    public int getRam() {return ram;}
    public int getHdd() {return hdd;}

    public void setRam(int ram) {this.ram = ram;}
    public void setHdd(int hdd) {this.hdd = hdd;}

    public String isBetter(Laptop laptop){
        if(ram > laptop.ram && hdd > laptop.hdd){
            return "Yes";
        } else {
            return "no";
        }
    }

    public String toString(){
        return "wh: " + getWh() + " cpu: " + getCpu() + " ram: " + getRam() + " hdd: " + getHdd();
    }
}
