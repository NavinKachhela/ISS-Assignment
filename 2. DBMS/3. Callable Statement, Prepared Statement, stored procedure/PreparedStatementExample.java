import java.sql.*;

class PreparedStatementExample{
	public static void main(String[] args) {
		try{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			Connection connectionObject = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","system","abc123");
			System.out.println("Database Connected");

			PreparedStatement statement=connectionObject.prepareStatement("insert into users values(?,?)");  
 			
			statement.setInt(1,1012);  
			statement.setString(2,"Ajay");  
			int noOfRecords=statement.executeUpdate();  
			System.out.println(noOfRecords+" records inserted");  
			System.out.println("Success");
			connectionObject.close();
			System.out.println("Database Disconnected");
		}
		catch(SQLException SQLExceptionObject){
			System.out.println("SQL issue " + SQLExceptionObject);
		}
		catch(ClassNotFoundException ClassNotFoundExceptionObject){
			System.out.println("ClassNotFoundException issue " + ClassNotFoundExceptionObject);
		}
	}
}
