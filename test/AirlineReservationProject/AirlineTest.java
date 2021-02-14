package AirlineReservationProject;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AirlineTest {
    Airline airline;

    @BeforeEach
    void setUp() {
        airline = new Airline();
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void testThatEachSeatObjectIsNotNull(){
        for (Seat seat: airline.getFirstClassSeats()){
            assertNotNull(seat);
        }
        for (Seat seat : airline.getEconomyClassSeats()){
            assertNotNull(seat);
        }
    }

}