package Domen;

/**
  * Класс студента
  */
public class Student extends Person implements Comparable<Student>{
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

    /** Реализация компаратора сначала по возрасту студентов, затем по номеру id*/
    @Override
    public int compareTo(Student arg0) {
        System.out.println(super.getName() + " - " + arg0.getName());
        if (super.getAge() > arg0.getAge()) return 1;
        if (super.getAge() < arg0.getAge()) return -1;
        if (this.id > arg0.id) return 1;
        if (this.id < arg0.id) return -1;
        return 0;
    }
    
}
