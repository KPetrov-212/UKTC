package zad1;

import java.util.Scanner;

public class TestStudent {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Student[] students = new Student[2];
        Faculty[] faculties = new Faculty[2];

        for (int i = 0; i < students.length; i++){
            System.out.println("Student " + (i+1) + ":");
            students[i] = new Student("", 0, 0, 0);
            students[i].inputStudentData();
        }

        for (int i = 0; i < faculties.length; i++){
            System.out.println("graduationYear of student " + (i+1) + ":");
            int graduationYear = scanner.nextInt();
            faculties[i] = Faculty.toFaculty(students[i], graduationYear);
        }

        Student searchStudent = students[0];
        boolean found = searchInArray(searchStudent, students);
        System.out.println("Student " + (found ? "found" : "not found"));

        Student bestStudent = findTopStudent(students);
        System.out.println("Highest GPA: " + bestStudent);

    }

    public static boolean searchInArray(Student student, Student[] array) {
        for (Student s : array) {
            if (s.getFacultyNumber() == (student.getFacultyNumber())) {
                return true;
            }
        }
        return false;
    }

    public static Student findTopStudent(Student[] array) {
        Student topStudent = array[0];
        for (Student s : array) {
            if (s.getAvr_gpa() > topStudent.getAvr_gpa()) {
                topStudent = s;
            }
        }
        return topStudent;
    }
}
