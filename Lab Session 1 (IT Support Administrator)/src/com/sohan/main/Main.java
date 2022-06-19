package com.sohan.main;
import java.util.Scanner;
import com.sohan.model.*;
import com.sohan.services.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		Employee emp1 = new Employee("Sohan", "Desai");		//log entry as "Sohan Desai"
		CredentialService credentials = new CredentialService();
		String dept = null;
		
			System.out.println("Please enter the department from the following :");
			System.out.println("1. Technical\n" +"2. Admin\n" +"3. Human Resource\n" +"4. Legal");
			int choice = scan.nextInt();
			switch (choice) {
			case 1:
				dept = "Tech";					//assigning department as Tech
				
				//generating email address using firstName, lastName and dept of employee
				credentials.generateEmailAddress(emp1.getFirstName(), emp1.getLastName(), dept);
				
				//generating random password of strength 8
				credentials.generatePassword();
				
				//displaying generated credentials i.e. emailAddress and password
				credentials.showCredentials(emp1.getFirstName());
				break;
			case 2:
				dept = "Admin";					//assigning department as Admin
				
				//generating email address using firstName, lastName and dept of employee
				credentials.generateEmailAddress(emp1.getFirstName(), emp1.getLastName(), dept);
				
				//generating random password of strength 8
				credentials.generatePassword();
				
				//displaying generated credentials i.e. emailAddress and password
				credentials.showCredentials(emp1.getFirstName());
				break;
			case 3:
				dept = "HR";					//assigning department as HR
				
				//generating email address using firstName, lastName and dept of employee
				credentials.generateEmailAddress(emp1.getFirstName(), emp1.getLastName(), dept);
				
				//generating random password of strength 8
				credentials.generatePassword();
				
				//displaying generated credentials i.e. emailAddress and password
				credentials.showCredentials(emp1.getFirstName());
				break;
			case 4:
				dept = "Legal";					//assigning department as Legal
				
				//generating email address using firstName, lastName and dept of employee
				credentials.generateEmailAddress(emp1.getFirstName(), emp1.getLastName(), dept);
				
				//generating random password of strength 8
				credentials.generatePassword();
				
				//displaying generated credentials i.e. emailAddress and password
				credentials.showCredentials(emp1.getFirstName());
				break;
			default:
				System.out.println("Invalid choice!");					//choice not provided
			}
			scan.close();
	}

}
