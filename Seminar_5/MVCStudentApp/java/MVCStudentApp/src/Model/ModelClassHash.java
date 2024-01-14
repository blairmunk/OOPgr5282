package Model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

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

    public void deleteStudent(int studentId)
    {
        for (Map.Entry<Integer, Student> entry : studentsMap.entrySet()) {
            if (entry.getValue().getId() == studentId) {
                studentsMap.entrySet().removeIf(yuyu -> yuyu.getValue().getId() == studentId);
                System.out.println("Студент с id " + studentId + " удален из списка.");
                return;
            }
        }
        System.out.println("Студент с id " + studentId + " не найден в списке.");
  
    }


    // public void deleteStudent(int id) {
    //     if (studentsMap.containsValue(id)) {
    //         studentsMap.entrySet().removeIf(entry -> entry.getValue().getId() == id);
    //         System.out.println("Студент с id " + id + " удален из списка.");
    //     } else {
    //         System.out.println("Студент с id " + id + " не найден в списке.");
    //     }
    // }

    // public void deleteStudent(int studentId) {
    //     studentsMap.entrySet().removeIf(entry -> entry.getValue().getId() == studentId);
    // }


    // public void deleteStudent(int id) {
    //     if (studentsMap.containsKey(id)) {
    //         studentsMap.remove(id);
    //         System.out.println("Студент с id " + id + " удален из списка.");
    //     } else {
    //         System.out.println("Студент с id " + id + " не найден в списке.");
    //     }
    // }


}