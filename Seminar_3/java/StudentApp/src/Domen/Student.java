package Domen;

public class Student extends Person {
    private int id;
    private static int generalId;
    
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
        return super.toString() + "\n id " + this.id;
    }
    
}
