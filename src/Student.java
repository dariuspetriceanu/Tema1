import java.io.Serializable;

public class Student implements Serializable {
    private String name;
    private double grade;

    Student(String name, double grade){
        this.name = name;
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", grade=" + grade +
                '}';
    }
}
