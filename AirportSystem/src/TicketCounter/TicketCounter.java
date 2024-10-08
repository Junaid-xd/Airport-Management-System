package TicketCounter;

public class TicketCounter {
    public int ticketID;
    int passengerID;
    String source;
    String destination;
    double price;
    int flightID;


    public void ticketDetails(){
        System.out.println("==========================================");
        System.out.println("Ticket ID: "+ ticketID);
        System.out.println("Passenger ID: "+ passengerID);
        System.out.println("Source: "+ source);
        System.out.println("Destination: "+ destination);
        System.out.println("Price: "+ price);
        System.out.println("Flight ID: "+ flightID);
    }

    public void bookTicket(){

    }

    public TicketCounter(int ticketID, String source, String destination, double price, int flightID, int passengerID){
        this.ticketID = ticketID;
        this.source = source;
        this.destination = destination;
        this.price = price;
        this.flightID = flightID;
        this.passengerID = passengerID;
    }


}
