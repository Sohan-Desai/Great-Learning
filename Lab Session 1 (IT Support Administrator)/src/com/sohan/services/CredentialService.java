package com.sohan.services;
import java.util.Random;

public class CredentialService{
	private String emailAddress;
	private String password;
	Random random = new Random();
	
	/*generating password of strength 8, the password will contain 
	 * uppercase and lowercase letters along with digits and special characters
	 * in random order
	 */
	public void generatePassword() {

		String upper = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String lower = "abcdefghijklmnopqrstuvwxyz";
		String num = "0123456789";
		String specialChars = "<><>?/{[}]+-_=)(@#$%^&*!'";
		
		//combining above strings
		String combination =upper+lower+num+specialChars;
		char[] password1 = new char[8];
		
		/*a random element from String combination gets assigned 
		 * at each index in password1 char[] array
		 */
		for(int i=0; i<password1.length; i++) {
			password1[i]=combination.charAt(random.nextInt(combination.length()));
		}
		
		//char array casted into String
		password = new String(password1);
	}
	
	/*generating email address using firstName, lastName and dept of employee.
	 * emailAddress should be in lowercase. Here abc is name of the company
	 */
	public void generateEmailAddress(String firstName, String lastName, String dept) {
		emailAddress = firstName.toLowerCase()+lastName.toLowerCase()+"@"+dept.toLowerCase()+".abc.com";
	}
	
	//displaying generated credentials i.e. emailAddress and password
	public void showCredentials(String firstName) {
		System.out.println("Dear " +firstName +" your generated credentials are as follows :");
		System.out.print("Email -->\t" +emailAddress +"\nPassword -->\t" +password);
	}
}
