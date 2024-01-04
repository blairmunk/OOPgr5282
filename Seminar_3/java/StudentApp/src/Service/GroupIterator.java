package Service;

import java.util.Iterator;
import java.util.List;

import Domen.StudentGroup;

/** Итератор для перечисления студенческих групп */
public class GroupIterator implements Iterator<StudentGroup>{
    private int count;
    private final List<StudentGroup> list;

    public GroupIterator(List<StudentGroup> list) {
        this.list = list;
        this.count = 0;
    }

    @Override
    public boolean hasNext() {
        return count < list.size();
    }

    @Override
    public StudentGroup next() {
        return this.list.get(count++);
    }
    
    
}
