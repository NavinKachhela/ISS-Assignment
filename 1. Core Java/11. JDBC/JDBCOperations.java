import java.sql.*;

class JDBCOperations{
	public static void main(String[] args) {
		try{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			Connection connectionObject = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","system","abc123");
			System.out.println("Database Connected");

			String query1 = "create table employee(employee_id int primary key,employee_name varchar(20))";
			
			String query2= "Insert into employee values(1,'amit')";
			String query3 = "update employee set employee_name = 'sumit' where employee_id = 1";
			String query5 = "select * from employee";
			String query4 = "delete employee where employee_id = 1";
			

			Statement stmt = connectionObject.createStatement();
			
			stmt.executeUpdate(query1);
			System.out.println("Table Created");
			
			stmt.executeUpdate(query2);
			System.out.println("Record Created");

			stmt.executeUpdate(query3);
			System.out.println("Record Updated");

			
			ResultSet rs = stmt.executeQuery(query5);
			while(rs.next()){
				System.out.println("Employee ID = "+ rs.getInt(1) + " Employee Name = " +  rs.getString(2));
			}
			
			stmt.executeUpdate(query4);
			System.out.println("Record Deleted");
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