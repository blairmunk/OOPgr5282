package Model.Domain;


/**
  * Класс студента
  */
public class Student extends Person{
    private int id;
    private static int generalId; //< Счётчик id, используется для генерации id студентов
    
    /**
     * Конструктор студентов
     * @param id — идент. номер, генерируется автоматически при создании нового студента
     */
    public Student(String name, int age) {
        super(name, age);
        this.id = generalId;
        generalId++;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return super.toString() + " id " + this.id;
    }

    
}
