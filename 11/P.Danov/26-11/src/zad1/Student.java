package zad1;

public class Student {
    private String name;
    private int facultyNumber;
    private int year;
    private double avr_gpa;

    public Student(String name, int facultyNumber, int year, double avr_gpa){
        this.name = name;
        this.facultyNumber = facultyNumber;
        this.year = year;
        this.avr_gpa = avr_gpa;
    }

    public String getName() {return name;}
    public int getFacultyNumber() {return facultyNumber;}
    public int getYear() {return year;}
    public double getAvr_gpa() {return avr_gpa;}

    public void setName(String name) {this.name = name;}
    public void setFacultyNumber(int facultyNumber) {this.facultyNumber = facultyNumber;}
    public void setYear(int year) {this.year = year;}
    public void setAvr_gpa(double avr_gpa) {this.avr_gpa = avr_gpa;}

    @Override
    public String toString() {
        return "Name:" + name + " facultyNumber:" + facultyNumber + " year:" + year + " avr_gpa:" + avr_gpa;
    }
    public void getAge() {
        System.out.println(name + " is " + (2024 - year) + " yearOld");
    }

    public void inputStudentData() {
        java.util.Scanner scanner = new java.util.Scanner(System.in);

        System.out.print("Въведете име: ");
        this.name = scanner.nextLine();

        System.out.print("Въведете факултетен номер: ");
        this.facultyNumber = scanner.nextInt();

        System.out.print("Въведете година на раждане: ");
        this.year = scanner.nextInt();

        System.out.print("Въведете среден успех: ");
        this.avr_gpa = scanner.nextDouble();
    }
}
