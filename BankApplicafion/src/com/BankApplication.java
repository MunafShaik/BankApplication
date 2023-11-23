package com;

import java.util.HashMap;
import java.util.Scanner;

public class BankApplication {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		// create a hashmap to store account objects with account number as key
		HashMap<Integer, Account> details = new HashMap<Integer, Account>();
		while (true) {
			System.out.println("1) Create Account  2)Get Details  3)Deposit  4)withdraw  5)exit ");
			int selectedOption = scanner.nextInt();
			switch (selectedOption) {
			case 1:
				Account ac = new Account();
				System.out.println("Enter account number");
				// calling a method called nextInt() and read the input from the console and
				// stores the returen value in the accountNumber variable
				int accountNumber = scanner.nextInt();
				System.out.println("Enter name of the account holder");
				// calling a method called nextInt() and read the input from the console and
				// stores the returen value in the name variable
				String name = scanner.next();
				System.out.println("Enter the Initial Balance");
				// calling a method called nextInt() and read the input from the console and
				// stores the returen value in the balance variable
				int Balance = scanner.nextInt();
				ac.setAccountNumber(accountNumber);
				ac.setName(name);
				ac.setBalance(Balance);
				details.put(accountNumber, ac);
				break;
			case 2:
				System.out.println("Enter account number");
				int accountNumber1 = scanner.nextInt();
				// using the account number get its account object and store in acc variable
				Account acc = details.get(accountNumber1);
				System.out.println("Details are:");
				System.out.println(acc.getAccountNumber());
				System.out.println(acc.getName());
				System.out.println(acc.getBalance());
				break;
			case 3:
				System.out.println("Enter account number to deposit ");
				int accountNumber3 = scanner.nextInt();
				System.out.println("Enter amount to deposit ");
				int depositAmount = scanner.nextInt();
				// using the accountNumber3 get its account object and stored in acc1 variable
				Account acc1 = details.get(accountNumber3);
				// calling the deposit method
				acc1.deposit(depositAmount);
				// prints the balance after deposit of the amount which add to the initial
				// balance
				System.out.println("Balance :" + acc1.getBalance());
				break;
			case 4:
				// print to ask user to give account number
				System.out.println("Enter account number ");
				int accountNumber4 = scanner.nextInt();
				// print to ask user to enter amount
				System.out.println("Enter amount ");
				// the user given amount is stored in the withdrawAmount variable
				int withdrawAmount = scanner.nextInt();
				// using the accountNumber4 get its account object and stored in acc2 variable
				Account acc2 = details.get(accountNumber4);
				// using the acc2 object call the withdraw method with input withdrawAmount and
				// stored the return value of the method in returnAmount variable
				boolean withdrawSuccess = acc2.withdraw(withdrawAmount);
				if (withdrawSuccess) {
					System.out.println("remainingBalance:" + acc2.getBalance());
				} else {
					System.out.println("Insufficient Balance");
				}
				break;
			case 5:
				System.out.println("thankyou ");
			}
		}
	}
}
