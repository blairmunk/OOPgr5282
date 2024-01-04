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

public class App {
    public static void main(String[] args) throws Exception {
        // Создаём учителей
        Teacher teacher1 = new Teacher("Alexey", 31, "dotsent");
        Teacher teacher2 = new Teacher("Vasiliy", 28, "dotsent");

        // Сравниваем учителей
        System.out.println(new PersonComparator<Teacher>().compare(teacher1, teacher2));

        // Создаём студентов
        Student student1 = new Student("Michael", 31);
        Student student2 = new Student("Arkadiy", 28);

        // Сравниваем студентов
        System.out.println(new PersonComparator<Student>().compare(student1, student2));

        // Выплачиваем зарплату
        new AccountController().paySalary(teacher1, 50000);

    }
}
