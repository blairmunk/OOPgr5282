package Service;

import java.util.ArrayList;
import java.util.List;

import Domen.PersonComparator;
import Domen.Student;
import Domen.Teacher;

public class TeacherService implements iPersonService<Teacher> {
    private int count;
    private List<Teacher> teachers;

    public TeacherService(){
        this.teachers = new ArrayList<>();
    }

    public void sortBySecondName(){
        PersonComparator <Teacher> personCompar = new PersonComparator<>();
        this.teachers.sort(personCompar);
    }

    public void printSortedPersons(){
        // TODO: Apply sortBySecondName metod instead of this 2 strings (cast problem)
        PersonComparator <Teacher> personCompar = new PersonComparator<>();
        this.teachers.sort(personCompar);
        // Print teachers line by line
        StringBuilder result = new StringBuilder();
        for (Teacher teacher : this.teachers) {
            result.append(teacher.toString()).append("\n");
        }
        System.out.println(result.toString());
    }

    @Override
    public List<Teacher> getAll() {
        return teachers;
    }

    @Override
    public void create(String name, int age) {
        teachers.add(new Teacher(name, age, "Basic"));
        count++;
    }

    
}