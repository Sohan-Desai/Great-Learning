package com.banking.main;
import com.banking.model.*;
import com.banking.services.*;
import com.banking.services.otp.*;
import java.util.Scanner;

public class Driver {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		Transactions trans = new Transactions();
		OTPGenerator otpGen = new OTPGenerator();
		Customer cust = new Customer("123456", "password");
		String bankAccountNo;
		String password;
		
		System.out.println("Welcome to login page!\n");
		System.out.println("Please enter your bank account number: ");
		bankAccountNo = scan.next();
		System.out.println("Please enter your password: ");
		password = scan.next();
		
		if(bankAccountNo.equals(cust.getBankAccountNo()) && password.equals(cust.getPassword())) {
			System.out.println("\nWelcome to the Indian Bank!\n");
			int option;
			do {
				System.out.println("~---------------------------------~");
				System.out.println(" Select any operation given below: ");
				System.out.println(" 1.Deposit");
				System.out.println(" 2.Withdrawl");
				System.out.println(" 3.Transfer");
				System.out.println(" 0.Logout");
				System.out.println("~-----------------------------------~");
				option = scan.nextInt();
				
				switch(option) {
				case 0:
					System.out.println("\nExited successfully!");
					break;
				case 1:
					//deposit
					trans.deposit();
					break;
				case 2:
					//withdrawl
					trans.withdrawal();
					break;
				case 3:
					//transfer after OTP verification
					trans.otpVerification();
					break;
				default:
					System.out.println("Please enter valid option");
				}
			}while(option!=0);
		}
		else
			System.out.println("Incorrect details");
		scan.close();
	}
}
