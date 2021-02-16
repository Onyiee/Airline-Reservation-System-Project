package AirlineReservationProject;

public class BoardingPass {
    private FlightSection flightSection;
    private int seatNumber;
    private String firstName;
    private String lastName;
    private String destination;

    public BoardingPass(int seatNumber, FlightSection flightSection, String firstName, String lastName,
                        String destination){
        this.seatNumber = seatNumber;
        this.flightSection = flightSection;
        this.firstName = firstName;
        this.lastName = lastName;
        this.destination = destination;
    }

    public FlightSection getFlightSection() {
        return flightSection;
    }

    public void setFlightSection(FlightSection flightSection) {
        this.flightSection = flightSection;
    }

    public int getSeatNumber() {
        return seatNumber;
    }

    public void setSeatNumber(int seatNumber) {
        this.seatNumber = seatNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }


    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getLastName() {
        return lastName;
    }


    @Override
    public String toString() {
        String result = "firstName " + firstName + "\n" +
                "lastName " + lastName + "\n" +
                "seatNumber " + seatNumber + "\n" +
                "flightSection " + flightSection + "\n" +
                "destination " + destination;
        return result;
    }
}
