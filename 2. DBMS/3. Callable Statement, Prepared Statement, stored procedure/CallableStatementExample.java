import java.sql.*;

class CallableStatementExample{
	public static void main(String[] args) {
		try{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			Connection connectionObject = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","system","abc123");
			System.out.println("Database Connected");

			CallableStatement statement = connectionObject.prepareCall("{call insertR(?,?)}");
			statement.setInt(1,1011);  
			statement.setString(2,"Navin");  
			statement.execute();
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
