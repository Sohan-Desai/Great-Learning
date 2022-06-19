
package property_rental_management_system;

public class Resident {
	private int socialId;
	private String firstName;
	private String lastName;
	private boolean tenant;
	
	public Resident(int socialId, String firstName, String lastName) {
		this.socialId = socialId;
		this.firstName = firstName;
		this.lastName = lastName;
	}
	
	/**
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}
	
	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName;
	}
}
