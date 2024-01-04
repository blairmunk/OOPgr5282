package Domen;

/**
  * Класс для сотрудников, имеет дополнительное поле "специализация"
  */
public class Employee extends Person {
    private String specialization;

    /**
     * Конструктор сотрудника
     * @param specialization — специализация
     */
    public Employee(String name, int age, String specialization) {
        super(name, age);
        this.specialization = specialization;
    }
    
}
