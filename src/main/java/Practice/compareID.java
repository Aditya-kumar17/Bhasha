package Practice;

import java.util.Comparator;

public class compareID implements Comparator<Employee> {


    @Override
    public int compare(Employee e, Employee i){
        return e.getId()-i.getId();
    }

}
