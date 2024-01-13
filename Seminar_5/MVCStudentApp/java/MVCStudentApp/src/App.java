import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import Controller.ControllerClass;
import Controller.Interfaces.iGetModel;
import Controller.Interfaces.iGetView;
import Model.ModelClass;
import Model.ModelClassFile;
import Model.ModelClassHash;
import Model.Domain.Student;
import View.ViewClass;
import View.ViewClassEng;

public class App {
    public static void main(String[] args) throws Exception {
        Student student1 = new Student("Ivan", 20);
        Student student2 = new Student("Vasya", 19);
        Student student3 = new Student("Julia", 23);
        Student student4 = new Student("Anastasia", 24);
        Student student5 = new Student("Alexander", 22);
        Student student6 = new Student("Gleb", 22);
        Student student7 = new Student("Konstantin", 21);
        Student student8 = new Student("Irina", 21);
        Student student9 = new Student("Katerina", 21);
        Student student10 = new Student("Vladimir", 20);

        List<Student> studList1 = new ArrayList<>();
        studList1.add(student1);
        studList1.add(student2);
        studList1.add(student3);
        studList1.add(student4);
        studList1.add(student5);
        studList1.add(student6);
        studList1.add(student7);
        studList1.add(student8);
        studList1.add(student9);
        studList1.add(student10);

        // Creating hashmap of students
        HashMap<Integer, Student> studentMap = new HashMap<>();
        studentMap.put(1, new Student("Иванов", 20));
        studentMap.put(2, new Student("Петров", 19));
        studentMap.put(3, new Student("Сидоров", 22));
        studentMap.put(4, new Student("Алешин", 23));
        studentMap.put(5, new Student("Александров", 23));
        studentMap.put(6, new Student("Егорова", 20));
        studentMap.put(7, new Student("Ползунова", 22));
        studentMap.put(8, new Student("Асташкина", 22));
        studentMap.put(9, new Student("Семенова", 21));
        studentMap.put(10, new Student("Петренко", 21));

        // iGetModel modelFile = new ModelClassFile("StudentDB.csv");
        // modelFile.saveAllStudentsToFile(studList1);

        // iGetModel model = new ModelClass(studList1);

        iGetModel modelHash = new ModelClassHash(studentMap);
        
        iGetView view = new ViewClassEng();

        ControllerClass controller = new ControllerClass(modelHash, view);

        // controller.update();
        controller.run();

    }
}
