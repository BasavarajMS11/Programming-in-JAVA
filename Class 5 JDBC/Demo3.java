package datapack;

import java.sql.*;
import java.util.Scanner;

public class Demo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter accno to delete");
		int accno=sc.nextInt();
		
		try {
			//step 1: Load the driver
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			//step 2: Create the connection object
			Connection con=DriverManager.getConnection(
					"jdbc:oracle:thin:@localhost:1521:xe","system", "Basu#223");
			
			//Step 3: Create the statement object
			Statement stmt=con.createStatement();
			
			String query= "Select * from BankAccout where accno="+accno;
			
			System.out.println(query);
			
			//Step 4: Execute Query
			ResultSet rs2=stmt.executeQuery(query);
			int count=0;
			
			String query1= "delete from BankAccout where accno="+accno;
			
			if(rs2!=null)
			{
				System.out.println("Record Exist");
				count=stmt.executeUpdate(query1);
			}
			
			con.commit();
			
			if(count>0)
			{
				System.out.println("Record Deleted");
			}
			
			System.out.println("Records......................");
			ResultSet rs3=stmt.executeQuery("select * from BankAccount");
			
			while(rs3.next())
			{
				System.out.println(rs3.getInt(1)+" "+rs3.getDouble(2));
			}
				
			con.close();		
			
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}
