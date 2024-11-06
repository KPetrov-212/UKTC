public class Test {

    public static void main(String[] args) {

//        Person p1 = new Person();
//        Person p2 = new Person("Ivan", "0703121234");
//        p1.setName("Georgi");
//        System.out.println(p2.getName());
//        Person.sayHi();
//        p2.sayMyName();
//        p1.sayMyName();
//        Student s = new Student("Petar", "0711090987", "121221789");
//        System.out.println(s.getName());
//        s.sayMyName();

        Course course = new Course("Matematika");
        Teacher t = new Teacher("Daskalin", "1234567890", course);
        t.sayMyName();
        t.sayCourse();



    }

}
