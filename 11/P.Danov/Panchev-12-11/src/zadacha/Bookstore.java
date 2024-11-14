package zadacha;

public class Bookstore {
    private int id;
    private String name;
    private int quantity;
    private double price;

    public Bookstore(int id, String name, int quantity, double price){
        this.id = id;
        this.name = name;
        this.quantity = quantity;
        this.price = price;
    }

    //gets
    public int getId() {return id;}
    public String getName() {return name;}
    public int getQuantity() {return quantity;}
    public double getPrice() {return price;}

    //sets
    public void setId(int id) {this.id = id;}
    public void setName(String name) {this.name = name;}
    public void setQuantity(int quantity) {this.quantity = quantity;}
    public void setPrice(double price) {this.price = price;}

    //methods
    public void printInfo() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Quantity: " + quantity);
        System.out.println("Price: $" + price);
    }

    public void removeQuantity(Bookstore book, int quantityRemoved){
        int checker = book.getQuantity();
        if (checker >= quantityRemoved) {
            book.setQuantity(checker - quantityRemoved);
        } else {
            System.out.println("Недостатъчна наличност! '\n'Оставащи: " + checker);
        }
    }

}

/* Задача:
 * клас Книжарница
 * полета id, name, quantity, price
 * конструктор, get set
 * методи:
 * 1. printInfo() - цялата информация
 * 2. removeQuantity(object, removedQuant/Scanner)
 * /ако няма достатъчно print("Недостатъчна наличност" + quantity)
 * --извън класа
 * масив с 3 обекта
 * searchByID() - Scanner -> вика printInfo()*/