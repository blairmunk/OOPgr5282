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

    @Override
    public String toString() {
        return "StudentSteam " + this.idSteam;
    }

    /** Итератор для перечисления групп */
    @Override
    public Iterator<StudentGroup> iterator() {
        return new GroupIterator(steam);
    }
    
}
