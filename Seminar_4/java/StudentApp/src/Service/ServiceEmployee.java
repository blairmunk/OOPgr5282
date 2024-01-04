package Service;

import java.util.ArrayList;
import java.util.List;

import Domen.Employee;
import Domen.PersonComparator;
import Domen.Student;

public class ServiceEmployee implements iPersonService<Employee> {
    private int count;
    private List<Employee> employees;

    public ServiceEmployee(){
        this.employees = new ArrayList<>();
    }

    public void sortBySecondName(){
        PersonComparator <Employee> personCompar = new PersonComparator<>();
        this.employees.sort(personCompar);
    }

    @Override
    public List<Employee> getAll() {
        return employees;
    }

    @Override
    public void create(String name, int age) {
        employees.add(new Employee(name, age, "Basic"));
        count++;
    }
    
}
