package lab_08;

public class Employee {
    private double salary;
    private String type;

    public Employee() {

    }

    public double getSalary() {
        return salary;
    }

    public String getType() {
        return type;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "salary=" + salary +
                ", type='" + type + '\'' +
                '}';
    }
}
