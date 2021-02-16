package AirlineReservationProject;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BoardingPassTest {
    BoardingPass boardingPass;


    @BeforeEach
    void setUp() {
        boardingPass = new BoardingPass(1, FlightSection.FIRSTCLASS, "Gold",
                "Tracy", "Abu Dhabi");

    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void test() {
        assertEquals(1, boardingPass.getSeatNumber());
        assertEquals(FlightSection.FIRSTCLASS, boardingPass.getFlightSection());
        assertEquals("Gold", boardingPass.getFirstName());
        assertEquals("Tracy", boardingPass.getLastName());
        assertEquals("Abu Dhabi", boardingPass.getDestination());
    }


    @Test
    void setFlightSection() {
        boardingPass.setFlightSection(FlightSection.FIRSTCLASS);
        assertEquals(FlightSection.FIRSTCLASS, boardingPass.getFlightSection());
    }

    @Test
    void setSeatNumber() {
        boardingPass.setSeatNumber(2);
        assertEquals( 2,boardingPass.getSeatNumber());
    }


    @Test
    void setFirstName() {
        boardingPass.setFirstName("Princess");
        assertEquals("Princess", boardingPass.getFirstName());

    }

    @Test
    void setLastName() {
        boardingPass.setLastName("Bubblegum");
        assertEquals("Bubblegum", boardingPass.getLastName());
    }


    @Test
    void setDestination() {
        boardingPass.setDestination("Abu Dhabi");
        assertEquals(boardingPass.getDestination(), "Abu Dhabi");
    }
}