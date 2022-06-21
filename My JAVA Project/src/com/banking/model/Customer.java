package com.banking.model;

public class Customer {
	
	private String bankAccountNo;
	private String password;
	
	/**
	 * 
	 * @param bankAccountNo
	 * @param password
	 */
	public Customer(String bankAccountNo, String password) {
		super();
		this.bankAccountNo = bankAccountNo;
		this.password = password;
	}
	
	/**
	 * 
	 * @return bankAccountNo
	 */
	public String getBankAccountNo() {
		return bankAccountNo;
	}
	
	/**
	 * 
	 * @param bankAccountNo
	 */
	public void setBankAccountNo(String bankAccountNo) {
		this.bankAccountNo = bankAccountNo;
	}

	/**
	 * 
	 * @return password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * 
	 * @param password
	 */
	public void setPassword(String password) {
		this.password = password;
	}
	
}
