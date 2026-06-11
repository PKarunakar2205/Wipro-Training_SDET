package Sarthak_clinic;
 
//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.ResultSet;
//import java.sql.SQLException;
//import java.sql.Statement;
import java.sql.*;
//import packages
//load & register driver
// establish connection
//create statements
//execute query
//process result
// close connection
public class Jdbc_conn {
 
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
	
		String url="jdbc:mysql://localhost:3306/mydata1";
		String user="root";
		String password="root";
		Class.forName("com.mysql.cj.jdbc.Driver");
		
				Connection con = DriverManager.getConnection(url, user, password);

				System.out.println("Connection created");

				Statement stmt = con.createStatement();

				ResultSet rs = stmt.executeQuery("select * from emp");

				System.out.println("ID\tName\tSalary");

				while (rs.next()) {

					int id = rs.getInt("emp_id");
					String name = rs.getString("emp_name");
					int salary = rs.getInt("salary");

					System.out.println(id + "\t" + name + "\t" + salary);
				}

				rs.close();
				stmt.close();
				con.close();
			}
		}