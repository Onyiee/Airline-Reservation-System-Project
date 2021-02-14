package AirlineReservationProject;



public class Airline {
    private Seat[] firstClassSeats = new Seat[1];
    private Seat[] economySeats = new Seat[1];
    public Airline(){
        for (int counter = 0; counter < firstClassSeats.length; counter++){
            firstClassSeats[counter] = new Seat(FlightSection.FIRSTCLASS, counter+1);
        }
        for (int counter = 0; counter < economySeats.length; counter++){
            economySeats[counter] = new Seat(FlightSection.ECONOMY, counter+1);
        }
    }

    public Seat[] getFirstClassSeats(){
        return firstClassSeats;
    }

    public Seat[] getEconomyClassSeats() {
        return economySeats;
    }
}
