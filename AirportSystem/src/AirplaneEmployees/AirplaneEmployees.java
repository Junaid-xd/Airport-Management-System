package AirplaneEmployees;

import Employees.Employees;
import Passengers.Passengers;

import java.util.ArrayList;
import java.util.List;

public class AirplaneEmployees extends Employees{

    String designation;
    List<Passengers> passengers;

    public AirplaneEmployees(int employeeID, String employeeName, double employeeSalary, String designation){
        super(employeeID,employeeName,employeeSalary);
        this.designation = designation;
        this.passengers = new ArrayList<>();
    }

    public void employeeDetails(){
        System.out.println("====================== EMPLOYEE DETAILS ====================");
        super.employeeDetails();
        System.out.println("Employee Designation: "+ designation);
        System.out.print("Assigned Passengers ID's: ");
        for(Passengers pes: passengers){
            System.out.print(pes.passengerID+", ");
        }
        System.out.println(" ");
    }

    public void addPassenger(Passengers passenger){
        passengers.add(passenger);
    }


}






