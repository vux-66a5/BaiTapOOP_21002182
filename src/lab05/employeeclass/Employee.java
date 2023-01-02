package lab05.employeeclass;

public class Employee {
    private final int id;
    private final String firstName;
    private final String lastName;
    private int salary;

    public Employee(int id, String firstName, String lastName, int salary) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
    }

    public int getID() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getName() {
        return firstName + " " + lastName;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int newSalary) {
        salary = newSalary;
    }

    public int getAnnualSalary() {
        return salary * 12;
    }

    public int raiseSalary(int percent) {
        this.salary = salary + salary * percent / 100;
        return salary;
    }

    @Override
    public String toString() {
        String description = "Employee" +
                "[" +
                "id = " +
                this.id +
                ", " +
                "name = " +
                this.getName() +
                ", " +
                "salary = " +
                this.salary +
                "]";

        return description;

    }
}
