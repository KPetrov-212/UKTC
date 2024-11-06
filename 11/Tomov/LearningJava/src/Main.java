class Person{
    String name;
    int age;

    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }
}

class Worker extends Person{
    String job;

    public Worker(String name, int age, String job) {
        super(name, age);
        this.job = job;
    }
}


public class Main {
    public static void main(String[] args) {
        Worker[] workers = new Worker[2];

        // Initialize each Worker object in the array
        workers[0] = new Worker("Alice", 30, "Engineer");
        workers[1] = new Worker("Bob", 25, "Designer");

        // Access and print out information for each worker
        for (Worker worker : workers) {
            System.out.println("Name: " + worker.name);
            System.out.println("Age: " + worker.age);
            System.out.println("Job: " + worker.job);
            System.out.println();
        }
    }
}
