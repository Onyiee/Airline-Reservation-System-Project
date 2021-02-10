package numberSevenPointOneNine;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AirlineReservationsSystemTest {
    AirlineReservationsSystem airlineReservationsSystem;
    @BeforeEach
    void setUp() {
        airlineReservationsSystem = new AirlineReservationsSystem();
    }

    @AfterEach
    void tearDown() {
        airlineReservationsSystem = null;
    }

    @Test
    void testThatAllSeatsAreEmptyAtDeclaration(){
    boolean [] test = new boolean[10];
    boolean [] flightSeat = airlineReservationsSystem.getFlightSeats();
    assertArrayEquals(test,flightSeat);

    }

    @Test
    void testThatUnoccupiedSeatsAreFalse(){
        boolean seat1 = airlineReservationsSystem.getFlightSeats()[0];
        assertFalse(seat1);

        boolean seat7 = airlineReservationsSystem.getFlightSeats()[6];
        assertFalse(seat7);
    }

    @Test
    void testThatOccupiedSeatsAreTrue(){
         airlineReservationsSystem.bookFlightSeats(1);
    }

    @Test
    void testToAssignFlightSection(){
        airlineReservationsSystem.assignFlightSection(1);
        FlightSection seat1 = airlineReservationsSystem.getFlightSection();
        assertEquals(FlightSection.FIRSTCLASS,seat1);
    }

    @Test
    void testThatFlightSeatsCanBeAssigned(){
        airlineReservationsSystem.assignFlightSeat();
    }
//
//    @Test
//    void testThatFlightSectionIsFirstClassOrEconomy(){
//        airlineReservationsSystem.confirmFlightSection();
//    }


}