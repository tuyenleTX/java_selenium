package lab_08;

import java.util.ArrayList;
import java.util.List;

/*
Create a class Employee to return employee's salary
There are 2 types of employees: full time and contract
Full time: 50000 and Contract: 40000
Write a method accepts a list of employees and calculate the total salary
For example: company has 3 FTE and 2CT
 */
public class Lab8EmployeeAssignment {
    public static void main(String[] args) {
        List<Employee> employeeList = new ArrayList<>();
        Employee employee1 = new FullTimeEmployee();
        Employee employee2 = new FullTimeEmployee();
        Employee employee3 = new FullTimeEmployee();
        Employee employee4 = new ContractEmployee();
        Employee employee5 = new ContractEmployee();
        employeeList.add(employee1);
        employeeList.add(employee2);
        employeeList.add(employee3);
        employeeList.add(employee4);
        employeeList.add(employee5);
        double totalSalary = 0.0;
        for (Employee e: employeeList
             ) {
            totalSalary = totalSalary + e.getSalary();
        }
        System.out.println("Total salary: " + totalSalary);
    }
}
