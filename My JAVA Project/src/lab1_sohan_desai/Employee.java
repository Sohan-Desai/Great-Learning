package lab1_sohan_desai;

public class Employee {
	private String firstName;
	private String lastName;
	private String department;
	
	public Employee() {
		
	}
	
	public Employee(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}
	
	public String getFirstName() {
		return firstName;
	}
	
	public void setDepartment(String department) {
		this.department = department;
	}
	
}
