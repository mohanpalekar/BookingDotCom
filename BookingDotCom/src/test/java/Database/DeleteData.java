package Database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DeleteData {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		String query = "Delete from employees where employee_id=12345602;";

		String url = "jdbc:mysql://localhost:3306/sql_hr";

		String username = "root";

		String password = "root";

		Class.forName("com.mysql.cj.jdbc.Driver");

		Connection connection = DriverManager.getConnection(url, username, password);

		PreparedStatement stmt = connection.prepareStatement(query);

		boolean result = stmt.execute();
		
		System.out.println(result);

		if(result!=true) {

			System.out.println("Data Deleted.");
		}
	}
}
