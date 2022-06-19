package com.sohan.services;
import java.util.Random;

public class CredentialService{
	private String emailAddress;
	private String password;
	Random random = new Random();
	
	public void generatePassword() {
		String upper = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String lower = "abcdefghijklmnopqrstuvwxyz";
		String num = "0123456789";
		String specialChars = "<><>?/{[}]+-_=)(@#$%^&*!'";
		
		String combination =upper+lower+num+specialChars;
		char[] password1 = new char[8];
		for(int i=0; i<password1.length; i++) {
			password1[i]=combination.charAt(random.nextInt(combination.length()));
		}
		password = new String(password1);
	}
	
	public void generateEmailAddress(String firstName, String lastName, String dept) {
		emailAddress = firstName.toLowerCase()+lastName.toLowerCase()+"@"+dept.toLowerCase()+".abc.com";
	}
	
	public void showCredentials(String firstName) {
		System.out.println("Dear " +firstName +" your generated credentials are as follows :");
		System.out.print("Email -->\t" +emailAddress +"\nPassword -->\t" +password);
	}
}
