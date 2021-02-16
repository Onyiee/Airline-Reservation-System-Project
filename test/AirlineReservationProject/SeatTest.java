package AirlineReservationProject;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SeatTest {
    Seat seat;
    Passenger passenger;

    @BeforeEach
    void setUp() {
        seat = new Seat(FlightSection.FIRSTCLASS, 2);
        passenger = new Passenger();
    }

    @AfterEach
    void tearDown() {
    }


    @Test
    void setAssigned() {
        seat.setAssigned(false);
        assertFalse(seat.isAssigned());
    }


    @Test
    void setFlightSection() {
        seat.setFlightSection(FlightSection.FIRSTCLASS);
        assertEquals(seat.getFlightSection(),FlightSection.FIRSTCLASS);
    }

    @Test
    void setPassenger() {
        seat.setPassenger(passenger);
        assertEquals(seat.getPassenger(),passenger);
    }


    @Test
    void setSeatNumber() {
        seat.setSeatNumber(3);
        assertEquals(seat.getSeatNumber(),3);
    }

    @Test
    void testThatSeatIsAssigned(){
        seat.setAssigned(true);
        assertTrue(seat.isAssigned());
    }

    @Test
    void testToGetSeatAssigned(){
        seat.setAssigned(true);
        assertEquals(seat.isAssigned(),true);
    }


}