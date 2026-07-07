import java.util.Scanner;

class SeatUnavailableException extends Exception {
    public SeatUnavailableException(String message) {
        super(message);
    }
}

public class MovieSeatReservation {
    public static void reserveSeat(int[] seats, int requestedSeat) throws SeatUnavailableException {
        if (requestedSeat < 0 || requestedSeat >= seats.length) {
            throw new SeatUnavailableException("Seat number is invalid.");
        }
        if (seats[requestedSeat] == 1) {
            throw new SeatUnavailableException("Seat is already reserved.");
        }
        seats[requestedSeat] = 1;
        System.out.println("Seat " + requestedSeat + " reserved successfully.");
    }

    public static void main(String[] args) {
        int[] seats = {0, 1, 0, 0};
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter seat number to reserve: ");
        int seatNumber = sc.nextInt();

        try {
            reserveSeat(seats, seatNumber);
        } catch (SeatUnavailableException e) {
            System.out.println("Reservation failed: " + e.getMessage());
        } finally {
            sc.close();
        }
    }
}
