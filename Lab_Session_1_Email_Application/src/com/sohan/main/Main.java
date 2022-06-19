package com.sohan.main;
import java.util.Scanner;
import com.sohan.model.*;
import com.sohan.services.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		Employee emp1 = new Employee("Sohan", "Desai");
		CredentialService credentials = new CredentialService();
		String dept = null;
		
			System.out.println("Please enter the department from the following :");
			System.out.println("1. Technical\n" +"2. Admin\n" +"3. Human Resource\n" +"4. Legal");
			int choice = scan.nextInt();
			switch (choice) {
			case 1:
				dept = "Tech";
				credentials.generateEmailAddress(emp1.getFirstName(), emp1.getLastName(), dept);
				credentials.generatePassword();
				credentials.showCredentials(emp1.getFirstName());
				break;
			case 2:
				dept = "Admin";
				credentials.generateEmailAddress(emp1.getFirstName(), emp1.getLastName(), dept);
				credentials.generatePassword();
				credentials.showCredentials(emp1.getFirstName());
				break;
			case 3:
				dept = "HR";
				credentials.generateEmailAddress(emp1.getFirstName(), emp1.getLastName(), dept);
				credentials.generatePassword();
				credentials.showCredentials(emp1.getFirstName());
				break;
			case 4:
				dept = "Legal";
				credentials.generateEmailAddress(emp1.getFirstName(), emp1.getLastName(), dept);
				credentials.generatePassword();
				credentials.showCredentials(emp1.getFirstName());
				break;
			default:
				System.out.println("Invalid choice!");
			}
			System.out.println("\n\nThank you!");
	}

}
