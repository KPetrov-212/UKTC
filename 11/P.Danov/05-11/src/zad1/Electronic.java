package zad1;

public class Electronic {
    private double watts;
    private String cpu_model;

    Electronic(double watts, String cpu_model) {
        this.watts = watts;
        this.cpu_model = cpu_model;
    }

    void start(){
        System.out.println("Electronic started");
    }

    void stop(){
        System.out.println("Electronic stopped");
    }

    //    gets and sets
    public double getWatts(){
        return watts;
    }

    public String getCpu_model(){
        return cpu_model;
    }

    public void setWatts(double newWatts){
        this.watts = newWatts;
    }

    public void setCpu_model(String newCpu_model){
        this.cpu_model = newCpu_model;
    }
}
