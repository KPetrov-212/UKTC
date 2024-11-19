package zad1;

public class Electronic {
    private int wh;
    private String cpu;

    public Electronic(int wh, String cpu){
        this.wh = wh;
        this.cpu = cpu;
    }

    public void setWh(int newWh){this.wh = newWh;}
    public void setCput(String newCput){this.cpu = newCput;}

    public int getWh(){return this.wh;}
    public String getCpu(){return this.cpu;}

    public void turnOn(){
        System.out.println("Laptop is on");
    }

    public void turnOff(){
        System.out.println("Laptop is off");
    }
}
