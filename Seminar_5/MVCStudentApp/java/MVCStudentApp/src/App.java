import java.util.ArrayList;
import java.util.List;

import Controller.ControllerClass;
import Controller.Interfaces.iGetModel;
import Controller.Interfaces.iGetView;
import Model.ModelClass;
import Model.ModelClassFile;
import Model.Domain.Student;
import View.ViewClass;
import View.ViewClassEng;

public class App {
    public static void main(String[] args) throws Exception {
        Student student1 = new Student("Ivan", 21);
        Student student2 = new Student("Vasya", 21);
        Student student3 = new Student("Julia", 21);
        Student student4 = new Student("Anastasia", 21);
        Student student5 = new Student("Alexander", 21);
        Student student6 = new Student("Gleb", 21);
        Student student7 = new Student("Konstantin", 21);
        Student student8 = new Student("Irina", 21);
        Student student9 = new Student("Katerina", 21);
        Student student10 = new Student("Vladimir", 21);

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

        iGetModel modelFile = new ModelClassFile("StudentDB.csv");
        // modelFile.saveAllStudentsToFile(studList1);

        // iGetModel model = new ModelClass(studList1);
        iGetView view = new ViewClassEng();

        ControllerClass controller = new ControllerClass(modelFile, view);

        // controller.update();
        controller.run();

    }
}
