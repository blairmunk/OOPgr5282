import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import Domen.*;

public class App {
    public static void main(String[] args) throws Exception {
        Student student1 = new Student("Ivan", 20);
        Student student2 = new Student("Anna", 19);
        Student student3 = new Student("Igor", 21);
        Student student4 = new Student("Elena", 18);
        Student student5 = new Student("Oleg", 20);
        Student student6 = new Student("Svetlana", 19);

        List<Student> studList1 = new ArrayList<>();
        studList1.add(student2);
        studList1.add(student5);
        studList1.add(student1);
        studList1.add(student6);
        studList1.add(student3);
        studList1.add(student4);


        StudentGroup studentGroup1 = new StudentGroup(studList1, 5282);
        System.out.println(studentGroup1);

        System.out.println("Unsorted group");

        for (Student student : studentGroup1){
            System.out.println(student);
        }
        
        Collections.sort(studentGroup1.getGroup());
        
        System.out.println("\nSorted group");
        
        for (Student student : studentGroup1){
            System.out.println(student);
        }
     }
}
