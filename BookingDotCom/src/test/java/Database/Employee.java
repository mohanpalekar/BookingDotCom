package Database;

public class Employee {

	private String employeeID;

	private String firstName;

	private String lasteName;

	private String jobTitile;

	private String salary;

	private String reportsTo;

	private String officeID;

	public Employee() {
		super();
	}

	public String getEmployeeID() {
		return employeeID;
	}

	public void setEmployeeID(String employeeID) {
		this.employeeID = employeeID;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLasteName() {
		return lasteName;
	}

	public void setLasteName(String lasteName) {
		this.lasteName = lasteName;
	}

	public String getJobTitile() {
		return jobTitile;
	}

	public void setJobTitile(String jobTitile) {
		this.jobTitile = jobTitile;
	}

	public String getSalary() {
		return salary;
	}

	public void setSalary(String salary) {
		this.salary = salary;
	}

	public String getReportsTo() {
		return reportsTo;
	}

	public void setReportsTo(String reportsTo) {
		this.reportsTo = reportsTo;
	}

	public String getOfficeID() {
		return officeID;
	}

	public void setOfficeID(String officeID) {
		this.officeID = officeID;
	}

	@Override
	public String toString() {
		return "Employee [employeeID=" + employeeID + ", firstName=" + firstName + ", lasteName=" + lasteName
				+ ", jobTitile=" + jobTitile + ", salary=" + salary + ", reportsTo=" + reportsTo + ", officeID="
				+ officeID + "]";
	}


}
