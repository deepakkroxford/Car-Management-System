package Employee_PayRole_System;

import java.util.ArrayList;

abstract class Employee {
    private int Employee_id;
    private String name;

    public Employee(int Employee_id, String name) {
        this.Employee_id = Employee_id;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return Employee_id;
    }

    public void setName(String name) {
        this.name = name;

    }

    public void setId(int id) {
        this.Employee_id = id;
    }

    // abstract method we have to create now
    public abstract double calculateSalar();

    @Override
    public String toString() {
        return "Employee[name=" + name + ",id=" + Employee_id + ", salary=" + calculateSalar() + "]";
    }

}

class FulltimeEmployee extends Employee {

    private double monthlySalary;

    public FulltimeEmployee(String name, int id, double monthlySalary) {
        super(id, name);
        this.monthlySalary = monthlySalary;
    }

    @Override
    public double calculateSalar() {
        return monthlySalary;
    }

}

class PartTimeEmployee extends Employee {
    private int hoursWork;
    private double hoursRate;

    public PartTimeEmployee(String name, int hoursWork, int hoursRate, int id) {
        super(id, name);
        this.hoursWork = hoursWork;
        this.hoursRate = hoursRate;
    }

    @Override
    public double calculateSalar() {
        return hoursRate * hoursWork;
    }

}

class PayrollSystem {

    // we created the ArrayList of Employee and the Datatype is Employee
    // it means it store the object of Employee
    private ArrayList<Employee> employeesList;

    public PayrollSystem() {
        employeesList = new ArrayList<>();
    }

    public void addEmployee(Employee employee) {
        employeesList.add(employee);
    }

    public void removeEmployee(int id) {
        Employee employeetoRemove = null;
        for (Employee employee : employeesList) {
            if (employee.getId() == id) {
                employeetoRemove = employee;
                break;
            }
        }
        if (employeetoRemove != null) {
            employeesList.remove(employeetoRemove);
        }
    }

    public void display() {
        for (Employee x : employeesList) {
            System.out.println(x);
            System.out.println();
        }
    }
}

public class Base {
    public static void main(String[] args) {
     PayrollSystem payrollSystem = new PayrollSystem();
     FulltimeEmployee emp1 = new FulltimeEmployee("Deepak", 1, 800000);
     PartTimeEmployee emp2 = new PartTimeEmployee("Aman", 30, 1000, 2);
     payrollSystem.addEmployee(emp1);
     payrollSystem.addEmployee(emp2);
     payrollSystem.display();
     payrollSystem.removeEmployee(2);
     payrollSystem.display();

    }
}
