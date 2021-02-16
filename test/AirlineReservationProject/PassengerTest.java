package AirlineReservationProject;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PassengerTest {
    Passenger passenger;

    @BeforeEach
    void setUp() {
        passenger = new Passenger();
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void setFirstName() {
        passenger.setFirstName("Gold");
        assertEquals(passenger.getFirstName(),"Gold");
    }


    @Test
    void setLastName() {
        passenger.setLastName("Tracy");
        assertEquals(passenger.getLastName(),"Tracy");
    }
}