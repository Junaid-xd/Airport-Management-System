package Flight;

import NoticeBoard.NoticeBoard;
import Passengers.Passengers;
import Runway.Runway;

import java.util.ArrayList;
import java.util.List;

public class Flight {
    public int flightID;
    String flightName;
    int capacity;
    String startingTime;
    String reachingTime;
    String source;
    String destination;
    double price;
    NoticeBoard noticeBoard;
    Runway runway;
    List<Passengers> passengers;



    public void addPassengers(Passengers passenger){
        passengers.add(passenger);
    }

    public void flightDetails(){
        System.out.println("================ FLIGHT DETAILS ===================");
        System.out.println("Flight ID: "+ flightID);
        System.out.println("Flight Name: "+ flightName);
        System.out.println("Flight Capacity: "+ capacity);
        System.out.println("Starting Time: "+ startingTime);
        System.out.println("Reaching Time: "+ reachingTime);
        System.out.println("Source: "+ source);
        System.out.println("Destination: "+ destination);
        System.out.println("Price: "+ price);
        noticeBoard.details();
        runway.runwayDetails();
        for(Passengers pes: passengers){
            pes.passengerDetails();
        }
    }

    public Flight(int flightID, String flightName, int capacity, String startingTime, String reachingTime, String source, String destination, double price, Runway runway){
        this.flightID = flightID;
        this.flightName = flightName;
        this.capacity = capacity;
        this.startingTime = startingTime;
        this.reachingTime = reachingTime;
        this.source = source;
        this.destination = destination;
        this.price = price;
        this.noticeBoard = new NoticeBoard(flightID,flightName,reachingTime,startingTime,source,destination);
        this.runway = runway;
        passengers = new ArrayList<>();


    }

}
