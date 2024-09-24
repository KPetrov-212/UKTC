public class Main {
    public static void main(String[] args) {
        Person person = new Person("Иван", 25);

        // Извикване на метода за представяне на лицето
        person.introduce();

        // Промяна на данните за лицето
        person.setName("Мария");
        person.setAge(30);

        // Извикване на метода за представяне след промяната
        person.introduce();
    }
}