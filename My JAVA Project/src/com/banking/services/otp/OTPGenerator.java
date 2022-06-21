package com.banking.services.otp;
import java.util.Scanner;
import com.banking.services.*;
public class OTPGenerator {
	Scanner scan = new Scanner(System.in);
	
	public int otpGenerator() {
		int randomPin = (int) (Math.random()*9000)+1000;
		return randomPin;
	}
	
}
