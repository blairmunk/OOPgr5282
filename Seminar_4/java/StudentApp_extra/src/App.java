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

import Controller.AccountController;
import Domen.*;
import Service.*;

public class App {
    public static void main(String[] args) throws Exception {
        
        ///////// Task#1. Printing sorted teachers /////

        // Creating teachers
        TeacherService teachers1 = new TeacherService();
        teachers1.create("Vasiliy", 32);
        teachers1.create("Viktor", 31);
        teachers1.create("Anna", 27);

        // Printing list of teachers
        System.out.println(teachers1.getAll());

        // Printing teachers sorted by name
        teachers1.printSortedPersons();

        ///////// Task#2. Average age for group of persons /////
        // Creating persons
        Person person1 = new Student("Oleg", 20);
        Person person2 = new Student("Roman", 22);
        Person person3 = new Student("Oksana", 20);
        Person person4 = new Student("Ekaterina", 21);
        Person person5 = new Teacher("Alexey", 30, "Dotsent");


        // Add persons to list
        List<Person> personList1 = new ArrayList<>();
        personList1.add(person1);
        personList1.add(person2);
        personList1.add(person3);
        personList1.add(person4);
        personList1.add(person5);
        
        // Calculating average age
        double averageAge1 = AccountController.averageAge(personList1);
        
        // Printing results
        System.out.println("Средний возраст этой группы:\n" + averageAge1);




    }


}
