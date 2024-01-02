package Domen;

public class Student extends Person implements Comparable<Student>{
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
        return super.toString() + " id " + this.id;
    }

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
