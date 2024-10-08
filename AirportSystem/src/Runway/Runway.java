package Runway;

public class Runway {

    int runwayNumber;
    String flightName;
    boolean occupiedStatus;

    public void runwayDetails(){
        System.out.println("=============== RUNWAY ====================");
        System.out.println("Runway Number: "+runwayNumber);
        System.out.println("Flight Name: "+flightName);
        System.out.println("Occupied Status: "+occupiedStatus);
    }

    public boolean isOccupied(){
        return occupiedStatus;
    }

    public Runway(int runwayNumber, String flightName, boolean occupiedStatus){
        this.runwayNumber = runwayNumber;
        this.flightName = flightName;
        this.occupiedStatus = occupiedStatus;
    }



}
