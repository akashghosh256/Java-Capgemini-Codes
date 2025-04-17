package employeeManagement;

import java.util.Comparator;

public class SortBy implements Comparator<Employee> {
    @Override
    public int compare(Employee e1, Employee e2) {
        return  e2.getId() - e1.getId();
    }
}
