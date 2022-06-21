package com.banking.services;

import java.util.Scanner;
import com.banking.services.otp.*;

public class Transactions {
	
	private double bankBalance = 1000.0;
	Scanner scan = new Scanner(System.in);
	
	public void deposit() {
		double amount;
		System.out.println("Enter the amount you wish to deposit:");
		amount = scan.nextInt();
		if(amount>=0) {
			bankBalance += amount;
			System.out.println("Amount Rs." +amount +" deposited successfully!\n"+"Bank balance updated to Rs." +bankBalance);
		}
		else {
			System.out.println("Please enter valid amount");
		}
	}
	
	public void withdrawal() {
		double amount;
		System.out.println("Enter the amount you wish to withdraw:");
		amount = scan.nextInt();
		if(amount>=0) {
			if(bankBalance-amount>=0) {
				bankBalance -= amount;
				System.out.println("Amount Rs." +amount +" withdrawn successfully!\n"+"Bank balance updated to Rs." +bankBalance);
			}
			else
				System.out.println("Insufficient bank balance!");
		}
		else {
			System.out.println("Invalid amount!");
		}
	}
	
	public void transfer() {
		double amount;
		int bankAccountNo;
		System.out.println("Enter the account number to which you want to make the transfer:");
		bankAccountNo = scan.nextInt();
		System.out.println("Enter the amount to transfer :");
		amount = scan.nextFloat();
		if(amount>=0) {
			if(bankBalance-amount>=0) {
				bankBalance -= amount;
				System.out.println("Amount Rs." +amount +" transfered successfully! to account number " +bankAccountNo);
				System.out.println("Bank balance updated to Rs." +bankBalance);
			}
			else
				System.out.println("Insufficient bank balance!");
		}
		else {
			System.out.println("Invalid amount!");
		}
	}
	
	public void otpVerification() {
		int systemOtp;
		boolean state = false;
		OTPGenerator otpGen = new OTPGenerator();
		systemOtp = otpGen.otpGenerator();
		System.out.println("Enter the OTP sent to your registered number:");
		System.out.println(systemOtp);
		int otp = scan.nextInt();
		for(int i=0; i<3&&state==false; i++) {
			if (otp==systemOtp) {
				System.out.println("OTP verified successfully!");
				state = true;
				transfer();
			}
			else {
				System.out.println("Incorrect otp!\n" +(2-i) +" attempts left");
				otp = scan.nextInt();
			}
		}
		if (state==false)
			System.out.println("OTP generated was" +systemOtp +"\nOTP verification was unsuccessful");
	}
	
}
