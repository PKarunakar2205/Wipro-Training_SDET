package RailwayReservationSystem;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class CancelTicket {

    Scanner sc = new Scanner(System.in);

    public void cancelTicket(Connection con) {

        try {

        	System.out.print("Enter PNR Number: ");

        	long pnr = sc.nextLong();

        	String query =
        	        "delete from passengers where pnr_no=?";
            PreparedStatement ps =
                    con.prepareStatement(query);

            ps.setLong(1, pnr);

            int rows = ps.executeUpdate();

            if (rows > 0) {
                System.out.println("Ticket Cancelled Successfully");
            } else {
                System.out.println("Passenger ID Not Found");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}