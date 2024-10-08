package Luggage;

public class Luggage {

    int luggageID;
    int passengerID;
    int flightID;
    int noOfLuggage;

    public Luggage(int luggageID, int passengerID, int flightID, int noOfLuggage){
        this.luggageID = luggageID;
        this.flightID = flightID;
        this.passengerID = passengerID;
        this.noOfLuggage = noOfLuggage;
    }

    public void luggageDetails(){
        System.out.println("=================== LUGGAGE DETAILS =====================");
        System.out.println("Luggage ID: "+ luggageID);
        System.out.println("Passenger ID: "+ passengerID);
        System.out.println("Flight ID: "+ flightID);
        System.out.println("No of Luggage: "+ noOfLuggage);
    }

    public void luggageStatus(){

    }

}
