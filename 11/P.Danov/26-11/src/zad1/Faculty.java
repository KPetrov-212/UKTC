package zad1;

import java.util.Scanner;

public class Faculty extends Student{
    static Scanner scanner = new Scanner(System.in);

    private int graduationYear;

    public Faculty(String name, int number, int year, double avr_gpa, int graduationYear) {
        super(name, number, year, avr_gpa);
        this.graduationYear = graduationYear;
    }

    public int getGraduationYear() {return graduationYear;}
    public void setGraduationYear(int graduationYear) {this.graduationYear = graduationYear;}

    public static Faculty toFaculty(Student student, int graduationYear){
        return new Faculty(student.getName(), student.getFacultyNumber(), student.getYear(), student.getAvr_gpa(), graduationYear);
    }

    @Override
    public String toString(){
        return super.toString() + " graduationYear:" + graduationYear;
    }
}
