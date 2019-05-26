import java.util.Comparator;

public class EmployeeSorter implements Comparator<Employee> {
    @Override
    public int compare(Employee empl1, Employee empl2)
    {
        int compId = empl1.getId().compareTo(empl2.getId());
        int compName = empl1.getName().compareTo(empl2.getName());

        if (compId == 0)
            if  (compName == 0)
                return compId;
        return compName;
    }
}
