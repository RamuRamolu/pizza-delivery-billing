package BankApplication;

import java.util.Scanner;

public class Bank {
   
   public static double balance=1000;
   
  
   public double getbalance() {
	   return balance;
   }
   public static void deposit( double depositamount) {
	   if(depositamount>0) {
		   System.out.println("amount deposited successfully");
	   }
	   else {
		   System.out.println("invalid amount you entered");
	   }
   }
   public void withdrawl( double withdrawlamount) {
	   if(withdrawlamount==0&&withdrawlamount<balance) {
		   System.out.println("amount debited successfully");
	   }
	   else if(withdrawlamount==balance){
		   System.out.println("your entered amount is equals to your balance");
		   System.out.println("WARNING:you have to maintain minimum balance");
	   }
	   else {
		   System.out.println("your entered amount is greater than your current balance");
	   }
   }
   public void displayaccountbalance() {
	   System.out.println("your balance amount is :"+balance);
   }
	public static void main(String[] args) {
		System.out.println("Welcome to our bank....");
		System.out.println(" ......");
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your Name : ");
		String name=sc.nextLine();
		System.out.println("Enter your 10 digits account number: ");
		long  pin=sc.nextInt();
		System.out.println("Login Succefully Completed");
		Bank bank=new Bank();
		System.out.println("enter your choice:");
		System.out.println("1 is for deposit");
		System.out.println("2 is for withdrawl");
		System.out.println("3 is for accountbalance");
		int choice=sc.nextInt();
		switch (choice)  {
			case 1: 
				System.out.println("enter the Deposit amount:");
				double depositamount=sc.nextDouble();
				deposit(depositamount);
				
				break;
			case 2:
				System.out.println("enter the withdrawl amount:");
				double withdrawlamount=sc.nextDouble();
				bank.withdrawl(withdrawlamount);
				
				break;
			case 3:
				bank.displayaccountbalance();
				break;
				default:
					System.out.println(" invalid choice..");
					System.out.println("we are closing your banking application now...");
					System.exit(0);
		}
	}

}
