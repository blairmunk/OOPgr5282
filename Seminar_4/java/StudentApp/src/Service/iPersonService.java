package Service;

import java.util.List;

/**
 * General interface for person methods
 *
 */
    
public interface iPersonService<T> {
    public List<T> getAll();

    public void create(String name, int age);
        
}
