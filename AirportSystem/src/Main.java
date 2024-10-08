import AirplaneEmployees.AirplaneEmployees;
import AirportEmployees.AirportEmployees;
import AirportManagement.AirportManagement;
import Passengers.Passengers;
import Runway.Runway;

public class Main {
    public static void main(String[] args) {

        AirportManagement airport = new AirportManagement("Allama Iqbal International Airport", "Lahore","DHA");

        //================= MAKING TICKET COUNTER ===========================

        airport.addTicketCounter(1, "Lahore", "Karachi", 1000,1,1);
        airport.addTicketCounter(2, "Lahore", "Islamabad", 3000,2,2);

        airport.showTicketCounterDetails(2);



        // ========================= ADDING FLIGHT ==========================
        Runway runway1 = new Runway(1,"AirBlue",false);
        airport.addFlight(1, "AirBlue",60,"12:00 am","3:00 am","Lahore", "Karachi", 1000,runway1);
        Runway runway2 = new Runway(2,"PIA",false);
        airport.addFlight(2, "PIA",70,"1:00 pm","4:00 pm","Lahore", "Islamabad", 3000,runway2);

        airport.showFlightDetails(1);
        airport.showFlightDetails(2);




        //=================== VIEWING NOTICE BOARD ============================
        airport.showNoticeBoardDetails(1);




        // ======================= MAKING EMPLOYEES ===========================
        AirportEmployees emp1 = new AirportEmployees(1,"Abid", 80000,"Airport Employee","Aviation");
        AirplaneEmployees emp2 = new AirplaneEmployees(2,"Anwar", 50000,"Airplane Employee");





        //========================= MAKING PASSENGER ===========================
        Passengers pes1 = new Passengers(1,1,1,3,"Junaid",20,1);
        pes1.addAirportEmployees(emp1);
        pes1.addAirplaneEmployees(emp2);
        Passengers pes2 = new Passengers(2,2,2,10,"Ali",20,2);
        pes2.addAirportEmployees(emp1);
        pes2.addAirplaneEmployees(emp2);


        pes1.passengerDetails();
        pes2.passengerDetails();
        



        //========================= ASSIGNING PASSENGERS TO EMPLOYEES ====================
        emp1.addPassenger(pes1);
        emp2.addPassenger(pes2);

        emp1.employeeDetails();
        emp2.employeeDetails();


        //========================= PASSENGER DETAILS ===========================
        pes1.showLuggageDetails();
        pes2.showLuggageDetails();





    }
}