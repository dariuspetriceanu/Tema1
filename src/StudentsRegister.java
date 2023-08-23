import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class StudentsRegister implements Serializable {
    private List<Student> studentsRegister;

    public StudentsRegister(List<Student> studentsRegister){
        this.studentsRegister = studentsRegister;
    }
    public StudentsRegister() {
        studentsRegister = new ArrayList<>();
    }

    public void addStudent(Student student) {
        studentsRegister.add(student);
    }

    public List<Student> getStudentsRegister() {
        return studentsRegister;
    }

    public void write(){
        try (ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream("transfers.data"));
        ){
            os.writeObject(studentsRegister);
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public void read(){
        try(ObjectInputStream is = new ObjectInputStream(new FileInputStream("transfers.data"))){
            List<Student> readStudents = (List<Student>) is.readObject();
            for (Student student : readStudents) {
                System.out.println(student);
            }
        }catch (IOException | ClassNotFoundException e){
            e.printStackTrace();
        }
    }

    @Override
    public String toString() {
        return "StudentsRegister{" +
                "studentsRegister=" + studentsRegister +
                '}';
    }
}
