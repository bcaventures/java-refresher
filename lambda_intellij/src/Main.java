import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        Employee beltus = new Employee("Ambe Beltus ", 4);
        Employee bridget = new Employee("Ngwa Bridget ", 3);
        Employee brina = new Employee("Brina Ambe", 1);
        Employee briana = new Employee("Briana Ambe", 2);

        ArrayList<Employee> employees = new ArrayList<Employee>();
        employees.add(beltus);
        employees.add(bridget);
        employees.add(brina);
        employees.add(briana);

        for (Employee emp : employees)
            System.out.println(emp.getName());

        //Collections.sort(employees, (emp1, emp2) -> emp1.getName().compareTo(emp2.getName()));

        //Collections.sort(employees);
        //Collections.sort(employees, new EmployeeSorter());
        Collections.sort(employees, (empl1, empl2) -> {int idComp = empl1.getId().compareTo(empl2.getId());
                                                        int nameComp = empl1.getName().compareTo(empl2.getName());
                                                        return (idComp == 0) ? idComp : idComp;
                                                        }
        );

        for (Employee emp : employees)
            System.out.println(emp.getName());
    }
}