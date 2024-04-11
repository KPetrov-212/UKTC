package chapter_4;

import java.util.Scanner;

public class main03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("--Въведете информация за фирмата--");
        System.out.print("Име на фирмата: ");
        String companyName = scanner.nextLine();

        System.out.print("Адрес: ");
        String address = scanner.nextLine();

        System.out.print("Телефонен номер: ");
        String phoneNumber = scanner.nextLine();

        System.out.print("Факс номер: ");
        String faxNumber = scanner.nextLine();

        System.out.print("Уеб сайт: ");
        String website = scanner.nextLine();

        System.out.println("\nВъведете информация за мениджъра на фирмата:");
        System.out.print("Име на мениджъра: ");
        String managerFirstName = scanner.nextLine();

        System.out.print("Фамилия на мениджъра: ");
        String managerLastName = scanner.nextLine();

        System.out.print("Телефонен номер на мениджъра: ");
        String managerPhoneNumber = scanner.nextLine();

        scanner.close();

        System.out.println("\nИнформация за фирмата:");
        System.out.printf("Име на фирмата: %s%n", companyName);
        System.out.printf("Адрес: %s%n", address);
        System.out.printf("Телефонен номер: %s%n", phoneNumber);
        System.out.printf("Факс номер: %s%n", faxNumber);
        System.out.printf("Уеб сайт: %s%n", website);

        System.out.println("\nИнформация за мениджъра на фирмата:");
        System.out.printf("Име на мениджъра: %s %s%n", managerFirstName, managerLastName);
        System.out.printf("Телефонен номер на мениджъра: %s%n", managerPhoneNumber);
    }
}
