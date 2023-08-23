import java.io.*;
import java.util.ArrayList;
import java.util.List;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // EX 1
        Student s1 =  new Student("Petriceanu Darius-Gabriel", 10);
        Student s2 =  new Student("Anghel Teodora Maria", 9.45);
        Student s3 =  new Student("Toma Maria Cosmina", 10);
        Student s4 =  new Student("Macu Madalina", 9.30);
        Student s5 =  new Student("Petriceanu Lara", 10);

        List<Student> studentsRegister = new ArrayList<>();
        studentsRegister.add(s1);
        studentsRegister.add(s2);
        studentsRegister.add(s3);
        studentsRegister.add(s4);
        studentsRegister.add(s5);

        StudentsRegister studReg =  new StudentsRegister(studentsRegister);
        studReg.write();
        studReg.read();


        // EX 2
        PrinterQueue printerQueue = new PrinterQueue();
        Thread consumerThread = new Thread(new Consumer(printerQueue));
        Thread producerThread1 = new Thread(new Producer(printerQueue));
        Thread producerThread2 = new Thread(new Producer(printerQueue));
        Thread producerThread3 = new Thread(new Producer(printerQueue));

        consumerThread.start();
        producerThread1.start();
        producerThread2.start();
        producerThread3.start();
    }
}