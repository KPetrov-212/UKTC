package zadacha;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Bookstore[] books = {new Bookstore(0, "White nights", 10, 9.99),
                            new Bookstore(1, "Black night", 15, 5.99),
                            new Bookstore(2, "Yellow night", 20, 12.99)};
        System.out.print("Search by id: ");
        int searchedId = scanner.nextInt();
        searchByID(books, searchedId);
    }

    public static void searchByID(Bookstore[] books, int searchedId) {
        for (Bookstore book : books) {
            if (book.getId() == searchedId) {
                book.printInfo();
                return;
            }
        }
        System.out.println("Book with ID " + searchedId + " not found.");
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