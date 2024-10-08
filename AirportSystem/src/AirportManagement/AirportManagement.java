package AirportManagement;

import Flight.Flight;
import NoticeBoard.NoticeBoard;
import Runway.Runway;
import TicketCounter.TicketCounter;

import java.util.ArrayList;
import java.util.List;

public class AirportManagement {
    String airportName;
    String cityName;
    String area;


    List<TicketCounter> ticketCounter;
    List<Flight> flight;
    List<NoticeBoard> noticeBoard;



    public boolean open(){
        return false;
    }


    public void addTicketCounter(int ticketID, String source, String destination, double price, int flightID, int passengerID){
        TicketCounter newTicketCounter = new TicketCounter(ticketID, source, destination, price, flightID, passengerID);
        ticketCounter.add(newTicketCounter);
    }

    public void showTicketCounterDetails(int ticketID){
        for(TicketCounter tc: ticketCounter){
            if(tc.ticketID == ticketID){
                tc.ticketDetails();
            }
        }
    }

    public void showNoticeBoardDetails(int flightId){
        for(NoticeBoard nb: noticeBoard){
            if(nb.flightID == flightId){
                nb.details();
            }
        }
    }

    public void addFlight(int flightID, String flightName, int capacity, String startingTime, String reachingTime, String source, String destination, double price, Runway runway){
        Flight newFlight = new Flight(flightID,flightName,capacity,startingTime,reachingTime,source,destination,price,runway);
        flight.add(newFlight);

        NoticeBoard newNoticeBoard = new NoticeBoard(flightID, flightName, reachingTime, startingTime, source, destination);
        noticeBoard.add(newNoticeBoard);
    }

    public void showFlightDetails(int flightId){
        for(Flight fl: flight){
            if(fl.flightID == flightId){
                fl.flightDetails();
            }
        }
    }




    public AirportManagement(String airportName, String cityName, String area){
        this.airportName = airportName;
        this.cityName = cityName;
        this.area = area;

        this.ticketCounter = new ArrayList<>();
        this.flight = new ArrayList<>();
        this.noticeBoard = new ArrayList<>();
    }


}
