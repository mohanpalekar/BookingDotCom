package Database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class InsertData {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		String query = "INSERT INTO employees (employee_id, first_name, last_name, job_title, salary, reports_to, office_id)\r\n"
				+ "VALUES (12345602, \"TestName\", \"TestLastName\", \"Accountatnt\",  12344, 37270, 1);";

		String url = "jdbc:mysql://localhost:3306/sql_hr";

		String username = "root";

		String password = "root";

		Class.forName("com.mysql.cj.jdbc.Driver");

		Connection connection = DriverManager.getConnection(url, username, password);

		PreparedStatement stmt = connection.prepareStatement(query);

		boolean result = stmt.execute();
		
		System.out.println(result);

		if(result!=true) {

			System.out.println("Data Inserted.");
		}
	}

}
