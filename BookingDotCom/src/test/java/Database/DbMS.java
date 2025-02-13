package Database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class DbMS {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		String url = "jdbc:mysql://localhost:3306/sql_hr";

		String username = "root";

		String password = "root";

		String query = "select * from employees where office_id=1;"; 

		Class.forName("com.mysql.cj.jdbc.Driver");

		Connection connection = DriverManager.getConnection(url, username, password);

		Statement statement = connection.createStatement();

		ResultSet resultSet = statement.executeQuery(query);

		List<Employee> employeeList = new ArrayList<>();


		while(resultSet.next()) {

			//System.out.println("EmployeeID : "+resultSet.getString("employee_id"));

			Employee emp = new Employee();

			emp.setEmployeeID(resultSet.getString("employee_id"));
			emp.setFirstName(resultSet.getString("first_name"));
			emp.setLasteName(resultSet.getString("last_name"));
			emp.setJobTitile(resultSet.getString("job_title"));
			emp.setReportsTo(resultSet.getString("reports_to"));
			emp.setSalary(resultSet.getString("salary"));
			emp.setOfficeID(resultSet.getString("office_id"));
			
			employeeList.add(emp);


		}
		
		employeeList.stream().forEach(x -> System.out.println(x));


	}

}
