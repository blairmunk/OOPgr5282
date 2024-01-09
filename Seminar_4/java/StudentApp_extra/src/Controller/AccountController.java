package Controller;
import java.util.List;
import Domen.Teacher;
import Domen.Person;


public class AccountController {
    /**
     * * Metod for paying salary
     * @param <T> type of person (teacher)
     * @param person person
     * @param salary how much
     */
    public <T extends Teacher> void paySalary(T person, int salary){
        System.out.println(person.getName() + " получил зарплату " + salary +  " рублей");
    }

    /**
     * Metod for calculating persons' average age
     * @param <T> type of person: student, Employee, teacher
     * @param persons list of persons
     * @return average age of persons
     */
    public static <T> double averageAge(List<T> persons) {
        int totalAge = 0;
        for (T person : persons) {
            totalAge += ((Person) person).getAge();
        }
        return (float) totalAge / persons.size();
    }
        
}
