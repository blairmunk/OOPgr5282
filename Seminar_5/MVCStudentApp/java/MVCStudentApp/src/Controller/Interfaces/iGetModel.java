package Controller.Interfaces;

import java.util.List;

import Model.Domain.Student;


/**
  * Интерфейс предполагает методы получения списка студентов и удаления студента по id
  */
public interface iGetModel {

    public List<Student> getStudents();

    public void deleteStudent(int id);

}