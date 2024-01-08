package Controller;
import java.util.List;
import Domen.Teacher;
import Domen.Person;


public class AccountController {
    public <T extends Teacher> void paySalary(T person, int salary){
        System.out.println(person.getName() + " получил зарплату " + salary +  " рублей");
    }

    public static <T> double averageAge(List<T> persons) {
        int totalAge = 0;
        for (T person : persons) {
            totalAge += ((Person) person).getAge();
        }
        return (float) totalAge / persons.size();
    }
        
}
