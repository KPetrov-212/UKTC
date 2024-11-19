package zad1;

public class CompanyET extends Company{
    private String owner;
    private double startingCapital;
    private double activeCapital;

    public CompanyET(String name, String date, String stand, String owner, double startingCapital, double activeCapital){
        super(name, date, stand);
        this.owner = owner;
        this.startingCapital = startingCapital;
        this.activeCapital = activeCapital;
    }

    public String getOwner() {return owner;}
    public double getStartingCapital() {return startingCapital;}
    public double getActiveCapital() {return activeCapital;}

    public void setOwner(String owner) {this.owner = owner;}
    public void setStartingCapital(double startingCapital) {this.startingCapital = startingCapital;}
    public void setActiveCapital(double activeCapital) {this.activeCapital = activeCapital;}

    public double profit(){
        return activeCapital - startingCapital;
    }
}
