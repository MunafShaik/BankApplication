package com;

public class Account {
	private int accountNumber;
	private String name;
	private int balance;

	public int getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	/**
	 * 
	 * @param amount
	 */
	public void deposit(int amount) {
		balance = balance + amount;
	}

//cteate a withdraw method and pass the parameter(amount) 
	public boolean withdraw(int amount) {
		// we have to check the condition that the balance is greaterthan or equals to
		// the amount
		if (balance >= amount) {
			// we have to deduct the amount from the balance and store the result in the
			// balance variable
			balance = balance - amount;
			// if the above condition is true then it returns the balance
			return true;
		} else {
			// if the above condition is false then it returns -1
			return false;
		}
	}
}