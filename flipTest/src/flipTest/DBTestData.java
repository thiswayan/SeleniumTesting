package flipTest;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;

public class DBTestData {
	public static ResultSet data(String ID, String userName, String sourceBank, String destinationBank, String amount) throws ClassNotFoundException, SQLException 
	 { 

	 // Accessing driver from the JAR file
	 Class.forName("com.mysql.jdbc.Driver"); 

	 // Creating a variable for the connection called "con"
	 Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "username", "password");

	 // after localhost:3306 is where you will put the name of the database
	 // jdbc:mysql://localhost:3606/testdb ---> this is a database
	 // root is a database user and password too

	 // our query below
	 PreparedStatement statement = con.prepareStatement("SELECT ID, userName, sourceBank, destinationBank, amount  FROM test_data");

	 // creating variable to execute query
	 ResultSet result = statement.executeQuery(); 

	 // store all the rows data into one variable
	 ArrayList<String> sqlData = new ArrayList<String>(); 

	 while(result.next())
	 {
	   sqlData.add(ID= result.getString("ID"));
	   sqlData.add(userName = result.getString("userName")); 
	   sqlData.add(sourceBank = result.getString("sourceBank")); 
	   sqlData.add(destinationBank = result.getString("destinationBank")); 
	   sqlData.add(amount = result.getString("amount")); 
	   
	   break;
	 } 
	 return result;
	 } 
	
}
