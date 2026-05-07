package RailwayReservationSystem;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Random;
import java.util.Scanner;

public class TicketBooking {

    Scanner sc = new Scanner(System.in);

    public long generatePNR() {

        Random random = new Random();

        long pnr =
                1000000000L +
                (long)(random.nextDouble() * 9000000000L);

        return pnr;
    }

    public void bookTicket(Connection con) {

        try {

            long pnr = generatePNR();

            System.out.print("Name: ");
            String name = sc.nextLine();

            System.out.print("Age: ");
            int age = sc.nextInt();
            sc.nextLine();

            System.out.print("Gender: ");
            String gender = sc.nextLine();

            System.out.print("Train Name: ");
            String train = sc.nextLine();

            System.out.print("Source: ");
            String source = sc.nextLine();

            System.out.print("Destination: ");
            String destination = sc.nextLine();

            System.out.print("Berth Preference: ");
            String berth = sc.nextLine();

            String query =
                    "insert into passengers values(?,?,?,?,?,?,?,?)";

            PreparedStatement ps =
                    con.prepareStatement(query);

            ps.setLong(1, pnr);
            ps.setString(2, name);
            ps.setInt(3, age);
            ps.setString(4, gender);
            ps.setString(5, train);
            ps.setString(6, source);
            ps.setString(7, destination);
            ps.setString(8, berth);

            int rows = ps.executeUpdate();

            if (rows > 0) {

                System.out.println(
                        "\nTicket Booked Successfully");

                System.out.println(
                        "Your PNR Number is : " + pnr);

            } else {

                System.out.println("Booking Failed");
            }

        } catch (Exception e) {

            e.printStackTrace();
        }
    }
}