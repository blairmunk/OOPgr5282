package Domen;

import java.util.Iterator;
import java.util.List;

import Service.StudentIterator;

/**
  * Класс студенческой группы, список студентов
  */
public class StudentGroup implements Iterable<Student>, Comparable<StudentGroup> {
    private List<Student>  group;
    private int idGroup;
    
    /** Конструктор группы студентов
     * @param group — имя группы
     * @param idGroup ­— идентификатор группы
     */
    public StudentGroup(List<Student> group, int idGroup) {
        this.group = group;
        this.idGroup = idGroup;
    }

    public List<Student> getGroup() {
        return group;
    }

    public void setGroup(List<Student> group) {
        this.group = group;
    }

    public int getIdGroup() {
        return idGroup;
    }

    public void setIdGroup(int idGroup) {
        this.idGroup = idGroup;
    }

    @Override
    public String toString() {
        return "StudentGroup " + this.idGroup + " numberOfStudents " + group.size();
    }

    /** Итератор для перечисления студентов */
    @Override
    public Iterator<Student> iterator() {
        return new StudentIterator(group);
    }

    /** Реализация компаратора по размеру группы, затем по идентификатору группы*/
    @Override
    public int compareTo(StudentGroup arg0) {
        if (this.group.size() > arg0.group.size()) return 1;
        if (this.group.size() < arg0.group.size()) return -1;
        if (this.idGroup > arg0.idGroup) return 1;
        if (this.idGroup < arg0.idGroup) return -1;
        return 0;
    }
    
    
}
