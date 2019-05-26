public class Employee
{
    private String name;
    private Integer id;

    /* Initialize an employee through the constructor */
    public Employee(String name, Integer id)
    {
        this.name = name;
        this.id = id;
    }

    /*
    @Override
    public int compareTo(Employee employee)
    {
        System.out.println("In Local compareTo()");
        return this.getId() - employee.getId();
    }
    */

    /* Get employee name*/
    public String getName()
    {
        return name;
    }

    /* Get employee id*/
    public Integer getId() {
        return id;
    }
}
