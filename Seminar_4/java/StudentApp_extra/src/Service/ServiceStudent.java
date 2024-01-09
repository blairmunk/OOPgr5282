package Service;

import java.util.ArrayList;
import java.util.List;

import Domen.PersonComparator;
import Domen.Student;

public class ServiceStudent implements iPersonService{
    private int count;
    private List<Student> students;

    public ServiceStudent(){
        this.students = new ArrayList<>();
    }

    public void sortBySecondName(){
        PersonComparator <Student> personCompar = new PersonComparator<>();
        this.students.sort(personCompar);
    }

    @Override
    public List<Student> getAll() {
        return students;
    }

    @Override
    public void create(String name, int age) {
        students.add(new Student(name, age));
    }
    
}
