package RailwayReservationSystem;

import java.sql.*;

public class Jdbc_conn {

	public static void main(String[] args)
			throws ClassNotFoundException, SQLException {

		String url = "jdbc:mysql://localhost:3306/railway_db";
		String user = "root";
		String password = "root";

		
		Class.forName("com.mysql.cj.jdbc.Driver");

		Connection con =
				DriverManager.getConnection(url, user, password);

		System.out.println("Connection Created");

		Statement stmt = con.createStatement();

		ResultSet rs =
				stmt.executeQuery("select * from passengers");

		System.out.println(
				"ID\tName\tAge\tGender\tTrain\tSource\tDestination\tBerth");

		while (rs.next()) {

			int id = rs.getInt("passenger_id");
			String name = rs.getString("name");
			int age = rs.getInt("age");
			String gender = rs.getString("gender");
			String train = rs.getString("train_name");
			String source = rs.getString("source_place");
			String destination =
					rs.getString("destination_place");
			String berth =
					rs.getString("berth_preference");

			System.out.println(
					id + "\t" +
					name + "\t" +
					age + "\t" +
					gender + "\t" +
					train + "\t" +
					source + "\t" +
					destination + "\t" +
					berth);
		}

		
		rs.close();
		stmt.close();
		con.close();
	}
}