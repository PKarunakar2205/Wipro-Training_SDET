package RailwayReservationSystem;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class ViewPassengers {

    public void viewPassengers(Connection con) {

        try {

            String query = "select * from passengers";

            Statement st = con.createStatement();

            ResultSet rs = st.executeQuery(query);

            System.out.println("\n===== PASSENGER DETAILS =====");

            while (rs.next()) {

                System.out.println("----------------------------");
                System.out.println("PNR Number : " + rs.getLong(1));
                System.out.println("Name         : " + rs.getString(2));
                System.out.println("Age          : " + rs.getInt(3));
                System.out.println("Gender       : " + rs.getString(4));
                System.out.println("Train Name   : " + rs.getString(5));
                System.out.println("Source       : " + rs.getString(6));
                System.out.println("Destination  : " + rs.getString(7));
                System.out.println("Berth        : " + rs.getString(8));
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}