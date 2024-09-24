package chapter_2;

public class EmployeeRecord {
    public static void main(String[] args) {
        String firstName = "Иван";
        String lastName = "Петров";
        int age = 35;
        char gender = 'м';
        int idNumber = 27560001;
        int uniqueEmployeeNumber = 27560000 + (int)(Math.random() * ((9999 - 0) + 1));
        
        System.out.println("Име: " + firstName);
        System.out.println("Фамилия: " + lastName);
        System.out.println("Възраст: " + age);
        System.out.println("Пол: " + gender);
        System.out.println("ID номер: " + idNumber);
        System.out.println("Уникален номер на служителя: " + uniqueEmployeeNumber);
    }
}
