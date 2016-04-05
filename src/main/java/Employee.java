import java.util.List;

/**
 * Chrissy Soulakian
 * in-class-assignment Project
 * Created on 4/5/2016
 */
public class Employee {
    private String name;
    private int employeeID;
    private String department;
    private int salary;
    private String status;
    private List<Employee> subordinates;

    public Employee(String name, int employeeID, String department, int salary, String status) {
        this.name = name;
        this.employeeID = employeeID;
        this.department = department;
        this.salary = salary;
        this.status = status;
    }

    public void hire(Employee emp) {
        subordinates.add(emp);
    }

    public void fire(Employee emp) {
        subordinates.remove(emp);
    }

    public List<Employee> getSubordinates() {
        return subordinates;
    }

    public String getName() {
        return name;
    }

    public int getEmployeeID() {
        return employeeID;
    }

    public String getDepartment() {
        return department;
    }

    public int getSalary() {
        return salary;
    }

    public String getStatus() {
        return status;
    }
}
