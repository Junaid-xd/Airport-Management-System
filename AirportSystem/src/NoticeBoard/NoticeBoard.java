package NoticeBoard;

public class NoticeBoard {
    public int flightID;
    String flightName;
    String arrivalTime;
    String departureTime;
    String source;
    String destination;

    public void details(){
        System.out.println("================ NOTICE BOARD ===================");
        System.out.println("Flight ID: "+ flightID);
        System.out.println("Flight Name: "+ flightName);
        System.out.println("Arrival time: "+ arrivalTime);
        System.out.println("Departure Time: "+ departureTime);
        System.out.println("Source: "+ source);
        System.out.println("Destination: "+ destination);
    }

    public void flightStatus(){

    }

    public NoticeBoard(int flightID, String flightName, String arrivalTime, String departureTime, String source, String destination){
        this.flightID = flightID;
        this.flightName = flightName;
        this.arrivalTime = arrivalTime;
        this.departureTime = departureTime;
        this.source = source;
        this.destination = destination;
    }
}
