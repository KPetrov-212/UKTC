public class Teacher extends Person {

    private Course course;

    public Teacher(String name, String egn, Course course) {
        super(name, egn);
        this.setCourse(course);
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public Course getCourse() {
        return course;
    }

    public void sayCourse() {
        System.out.println("I teach: " + getCourse().getCourse());
    }
}