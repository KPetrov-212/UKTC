package chapter_6;

public class main04 {
    public static void main(String[] args) {
        String[] suits = {"Спатия", "Каро", "Купа", "Пика"};
        String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Вале", "Дама", "Поп", "Асо"};
        
        for (String suit : suits) {
            for (String rank : ranks) {
                System.out.println(rank + " " + suit);
            }
        }
    }
}