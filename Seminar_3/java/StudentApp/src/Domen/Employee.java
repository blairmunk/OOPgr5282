package Domen;

public class Employee extends Person {
    private String specialization;

    public Employee(String name, int age, String specialization) {
        super(name, age);
        this.specialization = specialization;
    }
    
}
