package Controller.Interfaces;

import java.util.List;

import Model.Domain.Student;

/**
  * Интерфейс предполагает методы вывода списка студентов и вывода сообщений пользователю
  */
public interface iGetView {

    void printAllStudents(List<Student> students);

    String prompt(String msg);
    
}
