public class Student {

    private String name;
    private String number;

    public Student(String name, String number) {
        this.name = name;
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public String getNumber() {
        return number;
    }

    public void setName(String newName) {
        if (newName.length() > 3) {
            this.name = newName;
        } else {
            System.out.println("--Name setter: [" + newName + "] is invalid. It should be longer than 3 characters.--");
        }
    }

    public void setNumber(String newNumber) {
        if (newNumber.length() == 5) {
            this.number = newNumber;
        } else {
            System.out.println("--Number setter: [" + newNumber + "] is invalid. It should be exactly 5 characters.--");
        }
    }

    public static void main(String[] args) {
        Student student = new Student("Ivan", "12345");
        System.out.println("Name: " + student.getName());
        System.out.println("Number: " + student.getNumber());

        student.setName("Dimitar");
        student.setNumber("543210");

        System.out.println("Modified name: " + student.getName());
        System.out.println("Modified number: " + student.getNumber());
    }
}