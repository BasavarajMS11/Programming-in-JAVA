package datapack;

import java.sql.*;


public class Demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			//step 1: Load the driver
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			//step 2: Create the connection object
			Connection con=DriverManager.getConnection(
					"jdbc:oracle:thin:@localhost:1521:xe","system", "Basu#223");
			
			//Step 3: Create the statement object
			Statement stmt=con.createStatement();
			
			//Step 4: Execute Query
			ResultSet rs=stmt.executeQuery("select * from BankAccount");
			
			while(rs.next())
				System.out.println(rs.getInt(1)+" "+rs.getDouble(2));
			
			//Step 5: Close Connection
			con.close();		
		}
		catch(Exception e) {
			System.out.println(e);
		}

	}

}
