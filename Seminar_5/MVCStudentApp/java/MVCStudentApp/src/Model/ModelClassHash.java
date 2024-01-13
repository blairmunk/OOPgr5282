package Model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import Controller.Interfaces.iGetModel;
import Model.Domain.Student;

public class ModelClassHash implements iGetModel {

    private HashMap<Integer, Student> studentsMap;

    public ModelClassHash(HashMap<Integer, Student> studentsMap) {
        this.studentsMap = studentsMap;
    }

    public List<Student> getStudents() {
        List<Student> students = new ArrayList<Student>();
        try
        {
            HashMap<Integer, Student> hMap = new HashMap<Integer, Student>(studentsMap);
            
            for (Integer id : hMap.keySet())
            {
                Student student = hMap.get(id);
                students.add(student);
            }
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }

        return students;
    }

}