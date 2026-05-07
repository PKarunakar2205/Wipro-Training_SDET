package RailwayReservationSystem;

import java.sql.Connection;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Connection con = DBConnection.getConnection();

        TicketBooking tb = new TicketBooking();
        ViewPassengers vp = new ViewPassengers();
        CancelTicket ct = new CancelTicket();

        while (true) {

            System.out.println("\n===== RAILWAY RESERVATION SYSTEM =====");
            System.out.println("1. Book Ticket");
            System.out.println("2. View Passengers");
            System.out.println("3. Cancel Ticket");
            System.out.println("4. Exit");

            System.out.print("Enter Choice: ");

            int choice = sc.nextInt();

            switch (choice) {

                case 1:
                    tb.bookTicket(con);
                    break;

                case 2:
                    vp.viewPassengers(con);
                    break;

                case 3:
                    ct.cancelTicket(con);
                    break;

                case 4:
                    System.out.println("Thank You...");
                    System.exit(0);

                default:
                    System.out.println("Invalid Choice");
            }
        }
    }
}