package AirportEmployees;

import Employees.Employees;
import Passengers.Passengers;

import java.util.ArrayList;
import java.util.List;

public class AirportEmployees extends Employees {
    String designation;
    String department;
    List<Passengers> passengers;


    public AirportEmployees(int employeeID, String employeeName, double employeeSalary, String designation, String department){
        super(employeeID,employeeName,employeeSalary);
        this.designation = designation;
        this.department = department;
        this.passengers = new ArrayList<>();
    }

    public void employeeDetails(){
        System.out.println("====================== EMPLOYEE DETAILS ====================");
        super.employeeDetails();
        System.out.println("Employee Designation: "+ designation);
        System.out.println("Employee Department: "+ department);
        System.out.print("Assigned Passengers ID's: ");
        for(Passengers pes: passengers){
            System.out.print(pes.passengerID+", ");
        }
        System.out.println();
    }

    public void addPassenger(Passengers passenger){
        passengers.add(passenger);
    }
}
