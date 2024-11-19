package zad1;

public class Company {
    private String name;
    private String date;
    private String stand;

    public Company(String name, String date, String stand) {
        this.name = name;
        this.date = date;
        this.stand = stand;
    }

    public String getName() {return name;}
    public String getDate() {return date;}
    public String getStand() {return stand;}

    public void setName(String name) {this.name = name;}
    public void setDate(String date) {this.date = date;}
    public void setStand(String stand) {this.stand = stand.substring(0,10);}


}
