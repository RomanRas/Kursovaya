public class Employee {
    private final String fullName;
    private int branch;
    private int salary;
    private final int EmployeeID;
    public static int counter;

    public Employee(String fullName, int branch, int salary) {
        this.fullName = fullName;
        this.branch = branch;
        this.salary = salary;
        ++counter;
        this.EmployeeID = counter;
    }

    public String getFullName() {
        return fullName;
    }

    public int getBranch() {
        return branch;
    }

    public int getSalary() {
        return salary;
    }

    public int getEmployeeID() {
        return EmployeeID;
    }

    public void setBranch(int branch) {
        this.branch = branch;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}
