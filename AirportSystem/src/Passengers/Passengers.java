package Passengers;

import AirplaneEmployees.AirplaneEmployees;
import AirportEmployees.AirportEmployees;
import Luggage.Luggage;

import java.util.ArrayList;
import java.util.List;

public class Passengers {
    public int passengerID;
    String passengerName;
    int passengerAge;
    int ticketID;
    Luggage luggage;
    List<AirportEmployees> airportEmployees;
    List<AirplaneEmployees> airplaneEmployees;


    public void passengerDetails(){
        System.out.println("============= PASSENGERS ==================");
        System.out.println("Passenger ID: "+ passengerID);
        System.out.println("Passenger Name: "+ passengerName);
        System.out.println("Passenger Age: "+ passengerAge);
        System.out.println("Ticket ID: "+ ticketID);
        System.out.print("Airplane Employees ID's: ");
        for(AirplaneEmployees emp : airplaneEmployees){
            System.out.print(emp.employeeID+", ");
        }
        System.out.println();
        System.out.print("Airport Employees ID's: ");
        for(AirportEmployees emp : airportEmployees){
            System.out.print(emp.employeeID+", ");
        }
        System.out.println();
        luggage.luggageDetails();
    }

    public void checkIn(){

    }

    public void showLuggageDetails(){
        luggage.luggageDetails();
    }

    public Passengers(int luggageID, int passengerID, int flightID, int noOfLuggage, String passengerName, int passengerAge, int ticketID){
        luggage = new Luggage(luggageID, passengerID, flightID, noOfLuggage);
        this.passengerID = passengerID;
        this.passengerName = passengerName;
        this.passengerAge = passengerAge;
        this.ticketID = ticketID;
        this.airportEmployees = new ArrayList<>();
        this.airplaneEmployees = new ArrayList<>();
    }

    public void addAirportEmployees(AirportEmployees airportEmployee){
        airportEmployees.add(airportEmployee);
    }

    public void addAirplaneEmployees(AirplaneEmployees airplaneEmployee){
        airplaneEmployees.add(airplaneEmployee);
    }


}
