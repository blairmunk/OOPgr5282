package Domen;

import java.util.Iterator;
import java.util.List;

import Service.GroupIterator;

/**
  * Класс потока студентов, состоит из студенческих групп
  */
public class StudentSteam implements Iterable<StudentGroup>{
    private List<StudentGroup>  steam;
    private int idSteam;
    
    /** Конструктор потока
     * @param steam — имя потока
     * @param idSteam ­— идентификатор потока
     */
    public StudentSteam(List<StudentGroup> steam, int idSteam) {
        this.steam = steam;
        this.idSteam = idSteam;
    }

    public List<StudentGroup> getSteam() {
        return steam;
    }

    public void setSteam(List<StudentGroup> steam) {
        this.steam = steam;
    }

    public int getIdSteam() {
        return idSteam;
    }

    public void setIdSteam(int idSteam) {
        this.idSteam = idSteam;
    }

    /** Выводим данные по потоку (id, кол-во групп) 
     * и список всех студентов потока с указанием номера группы 
     */
    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        result.append("StudentSteam " + this.idSteam + ", numberOfGroups " + steam.size() + ":").append("\n");
        for (StudentGroup studGroup : this.steam) {
            for (Student student : studGroup) {
                result.append(student.toString()).append(" (group " + studGroup.idGroup + ")").append("\n");
            }
        }
        return result.toString();
    }

    /** Итератор для перечисления групп */
    @Override
    public Iterator<StudentGroup> iterator() {
        return new GroupIterator(steam);
    }
    
}
