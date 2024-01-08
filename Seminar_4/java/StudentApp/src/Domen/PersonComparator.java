package Domen;

import java.util.Comparator;

/*
 * General class for comparing persons
*/
public class PersonComparator<T extends Person> implements Comparator<T> {

    @Override
    public int compare(T arg1, T arg2){
        int result = arg1.getName().compareTo(arg2.getName());
        return result;

    }
    
}
