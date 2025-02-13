package Database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class DbConnect {

	public static void main(String[] args) {

		Connection connection = null;
		try {
			// below two lines are used for connectivity.
			Class.forName("com.mysql.cj.jdbc.Driver");
			connection = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/sql_hr",
					"root", "root");

			// mydb is database
			// mydbuser is name of database
			// mydbuser is password of database

			Statement statement;
			statement = connection.createStatement();
			ResultSet resultSet;
			resultSet = statement.executeQuery(
					"select * from employees where first_name like 'D%'");
			String employee_id;
			String firstName;
			while (resultSet.next()) {
				employee_id = resultSet.getString("employee_id");
				firstName = resultSet.getString("first_name").trim();
				System.out.println("employee_id : " + employee_id
						+ " firstName : " + firstName);
			}
			resultSet.close();
			statement.close();
			connection.close();
		}
		catch (Exception exception) {
			System.out.println(exception);
		}


	}

}
