public class MovieTicket {
    static class Ticket {
        private String movieName;
        private String seatNumber;
        private double price;

        public Ticket(String movieName) {
            this.movieName = movieName;
            this.seatNumber = "";
            this.price = 0.0;
        }

        public void book(String seat, double price) {
            this.seatNumber = seat;
            this.price = price;
        }

        public void display() {
            System.out.println("Movie: " + movieName);
            System.out.println("Seat: " + seatNumber);
            System.out.println("Price: " + price);
        }
    }

    public static void main(String[] args) {
        Ticket t = new Ticket("Interstellar");
        t.book("B12", 350.0);
        t.display();
    }
}
