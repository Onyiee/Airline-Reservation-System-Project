package AirlineReservationProject;

public class Seat {
    private boolean isAssigned;
    private FlightSection flightSection;
    private Passenger passenger;
    private int seatNumber;

    public Seat(FlightSection flightSection, int seatNumber){
        this.flightSection = flightSection;
        this.seatNumber = seatNumber;
    }

    public boolean isAssigned() {
        return isAssigned;
    }

    public void setAssigned(boolean assigned) {
        isAssigned = assigned;
    }


    public void setFlightSection(FlightSection flightSection) {
        this.flightSection = flightSection;
    }

    public FlightSection getFlightSection() {
        return flightSection;
    }

    public void setPassenger(Passenger passenger) {
        this.passenger = passenger;
    }

    public Passenger getPassenger() {
        return passenger;
    }


    public void setSeatNumber(int seatNumber) {
        this.seatNumber = seatNumber;
    }

    public int getSeatNumber() {
        return seatNumber;
    }
}
