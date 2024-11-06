public class Person {

    private String name;
    private String egn;

    public Person() {
        this.setName("");
        this.setEgn("");
    }

    public Person(String n, String e) {
        this.setName(n);
        this.setEgn(e);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEgn() {
        return egn;
    }

    public void setEgn(String egn) {
        this.egn = egn;
    }

    public void sayMyName() {
        System.out.println("My name is " + getName());
    }

    public static void sayHi() {
        System.out.println("Hi");
    }
}