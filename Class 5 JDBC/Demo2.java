package datapack;
import java.sql.*;
import java.util.Scanner;

public class Demo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter accno and bal");
		int accno=sc.nextInt();
		double bal= sc.nextDouble();
		
		try {
			//step 1: Load the driver
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			//step 2: Create the connection object
			Connection con=DriverManager.getConnection(
					"jdbc:oracle:thin:@localhost:1521:xe","system", "Basu#223");
			
			//Step 3: Create the statement object
			Statement stmt=con.createStatement();
			
			String query="insert into BankAccount values("+accno+","+bal+")";
			
			stmt.executeUpdate(query);
			
			System.out.println("New row inserted");
			con.commit();
			
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
