package RailwayReservationSystem;


import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {

    static String url =
            "jdbc:mysql://localhost:3306/railway_db";

    static String user = "root";

    static String password = "root";

    public static Connection getConnection() {

        Connection con = null;

        try {

            // Load Driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Create Connection
            con = DriverManager.getConnection(
                    url, user, password);

            System.out.println("Database Connected");

        } catch (Exception e) {

            e.printStackTrace();
        }

        return con;
    }
}
