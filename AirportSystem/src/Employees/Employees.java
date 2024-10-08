package Employees;

public class Employees {

    public int employeeID;
    String employeeName;
    double employeeSalary;

    public void employeeDetails(){
        System.out.println("Employee ID: "+ employeeID);
        System.out.println("Employee Name: "+ employeeName);
        System.out.println("Employee Salary: "+ employeeSalary);
    }

    public Employees(int employeeID, String employeeName, double employeeSalary){
        this.employeeID = employeeID;
        this.employeeName = employeeName;
        this.employeeSalary = employeeSalary;
    }
}
