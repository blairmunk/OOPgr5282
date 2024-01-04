package Domen;

/**
  * Класс для преподавателей
  */
public class Teacher extends Person{
    private String academicDegree;

    /**
     * Конструктор преподавателя
     * @param academicDegree — учёная степень
     */
    public Teacher(String name, int age, String academicDegree) {
        super(name, age);
        this.academicDegree = academicDegree;
    }
    
}
