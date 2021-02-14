package AirlineReservationProject;

import java.util.Scanner;

public class main {
    static Scanner scanner = new Scanner(System.in);
    static int sentinel = 1;
    static Airline airline = new Airline();
    static boolean firstClassFull = false;
    static boolean economyFull = false;

    public static void main(String[] args) {
        while (sentinel != -1) {
            System.out.println("Welcome to Onyi Airlines\n" +
                    "Enter 1 to book a flight in the first class section\n" +
                    "Enter 2 to book a flight in the economy section\n");
            int userInput = scanner.nextInt();
            if (userInput == 1) {
                firstClassBooking();
            } else {
                economyClassBooking();
            }
        }

    }

    private static void firstClassBooking() {
        Passenger passenger = new Passenger();
        scanner.nextLine();
        System.out.println("Enter your firstName: ");
        String firstName = scanner.nextLine();

        System.out.println("Enter your lastName: ");
        String lastName = scanner.nextLine();

        System.out.println("Enter your destination: ");
        String destination = scanner.nextLine();

        passenger.setFirstName(firstName);
        passenger.setLastName(lastName);
        int seatNumber = 0;
        boolean foundSeat = false;
        for (Seat seat : airline.getFirstClassSeats()) {
            if (seat.isAssigned() == false) {
                seat.setAssigned(true);
                seat.setPassenger(passenger);
                seatNumber = seat.getSeatNumber();
                foundSeat = true;
                break;
            }
        }
        if (foundSeat) {
            BoardingPass boardingPass = new BoardingPass(seatNumber, FlightSection.FIRSTCLASS, firstName,
                    lastName, destination);
            System.out.println(boardingPass);
            System.out.println();
        } else {
            firstClassFull = true;
            System.out.println("No seats found in the first class section, would you like a seat in the " +
                    "economy section?" +
                    "if yes, enter 1, if no enter 2: ");
            int choice = scanner.nextInt();

            if (choice == 1) {
                if (economyFull) {

                } else {
                    economyClassBooking();
                }

            } else {
                System.out.println("Alright, Our next flight is in three hours, you can book a first class seat " +
                        "for it");
                sentinel = -1;
            }

        }


    }

    private static void economyClassBooking() {
        Passenger passenger = new Passenger();
        scanner.nextLine();
        System.out.println("Enter your firstName: ");
        String firstName = scanner.nextLine();

        System.out.println("Enter your lastName: ");
        String lastName = scanner.nextLine();

        System.out.println("Enter your destination: ");
        String destination = scanner.nextLine();

        passenger.setFirstName(firstName);
        passenger.setLastName(lastName);
        int seatNumber = 0;
        boolean foundSeat = false;
        for (Seat seat : airline.getEconomyClassSeats()) {
            if (seat.isAssigned() == false) {
                seat.setAssigned(true);
                seat.setPassenger(passenger);
                seatNumber = seat.getSeatNumber();
                foundSeat = true;
                break;
            }
        }
        if (foundSeat) {
            System.out.println("Booked successfully");
            BoardingPass boardingPass = new BoardingPass(seatNumber, FlightSection.ECONOMY, firstName,
                    lastName, destination);
            System.out.println(boardingPass);
            System.out.println();
        } else {
            economyFull = true;
            if (firstClassFull) {
                System.out.println("Economy class seats are full ");
                System.out.println("All seats in first class are also booked\nNext flight leaves in 3 hours");
                sentinel = -1;
                return;
            } else {
                System.out.println("No seats found in the Economy class section, would you like a seat in the " +
                        "first class section?" +
                        "if yes, enter 1, if no enter 2: ");
                int choice = scanner.nextInt();

                if (choice == 1) {
                    firstClassBooking();

                } else {
                    System.out.println("Alright, Our next flight is in three hours, you can book an Economy class" +
                            " seat for it");
                    sentinel = -1;
                }
            }
        }
    }
}
