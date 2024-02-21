
public class Person {
    private String name;
    private int age;

    // Конструктор
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Гетъри и сетъри
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    // Метод за представяне на лицето
    public void introduce() {
        System.out.println("Здравей, аз съм " + name + " и съм на " + age + " години.");
    }
}