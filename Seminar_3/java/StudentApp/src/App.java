/**
 * Название: StudentApp
 * @version: 1.1
 * Назначение: Представить модель организации учебных групп в учебном заведении,
 * потренироваться в использовании встроенных интерфейсов java.
 */

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import Domen.*;

public class App {
    public static void main(String[] args) throws Exception {
        // Создаём студентов
        Student student1 = new Student("Ivan", 20);
        Student student2 = new Student("Anna", 19);
        Student student3 = new Student("Igor", 21);
        Student student4 = new Student("Elena", 18);
        Student student5 = new Student("Oleg", 20);
        Student student6 = new Student("Svetlana", 19);
        Student student7 = new Student("Alexander", 20);
        Student student8 = new Student("Vladimir", 19);
        Student student9 = new Student("Olga", 20);
        Student student10 = new Student("Oksana", 19);
        Student student11 = new Student("Vyacheslav", 19);
        Student student12 = new Student("Roman", 21);
        Student student13 = new Student("Ekaterina", 20);
        Student student14 = new Student("Alexey", 20);
        Student student15 = new Student("Dmitriy", 21);
        Student student16 = new Student("Alevtina", 21);
        Student student17 = new Student("Konstantin", 19);

        // Заполняем первый список студентами
        List<Student> studList1 = new ArrayList<>();
        studList1.add(student2);
        studList1.add(student5);
        studList1.add(student1);
        studList1.add(student6);
        studList1.add(student3);
        studList1.add(student4);

        // Заполняем второй список студентами
        List<Student> studList2 = new ArrayList<>();
        studList2.add(student7);
        studList2.add(student8);
        studList2.add(student10);

        // Заполняем третий список студентами
        List<Student> studList3 = new ArrayList<>();
        studList3.add(student11);
        studList3.add(student9);
        studList3.add(student12);
        studList3.add(student13);
        studList3.add(student14);

        // Заполняем четвёртый список студентами
        List<Student> studList4 = new ArrayList<>();
        studList4.add(student15);
        studList4.add(student16);
        studList4.add(student17);

        // Распределяем списки студентов по группам
        StudentGroup studentGroup1 = new StudentGroup(studList1, 5282);
        StudentGroup studentGroup2 = new StudentGroup(studList2, 5283);
        StudentGroup studentGroup3 = new StudentGroup(studList3, 5284);
        StudentGroup studentGroup4 = new StudentGroup(studList4, 5285);

        // Создаём первый список из групп
        List<StudentGroup> groupList1 = new ArrayList<>();
        groupList1.add(studentGroup1);
        groupList1.add(studentGroup2); 
        groupList1.add(studentGroup3);
        groupList1.add(studentGroup4); 
        
        // Распеределяем списки групп по потокам
        StudentSteam studentSteam1 = new StudentSteam(groupList1, 2023);
        

//////////////////// Вывод на консоль по заданиям №1, №2 и №3 (без звёздочки),
//////////////////// и №1 (со звёздочкой) //// 

        // Print unsorted steam
        System.out.println("Unsorted steam");
        for (StudentGroup studGroup : studentSteam1){
            System.out.println("Группа " + studGroup.getIdGroup() + ":");
            for (Student student : studGroup){
                System.out.println(student);
            }
            System.out.println();
        }
        
        // Sorting steam by size of groups and then by idGroup using comparator
        Collections.sort(studentSteam1.getSteam());
        
        // Print sorted steam
        System.out.println("Sorted steam");
        for (StudentGroup studGroup : studentSteam1){
            System.out.println("Группа " + studGroup.getIdGroup() + ":");
            for (Student student : studGroup){
                System.out.println(student);
            }
            System.out.println();
        }

//////////////////// Вывод на консоль по заданию №2 со звёздочкой //////////

        // Работа реализации ToString для вывода списка студентов:
        System.out.println(studentGroup1);
        
        // Работа реализации ToString для вывода списка студентов с указанием группы для каждого
        System.out.println(studentSteam1);

    }
}
