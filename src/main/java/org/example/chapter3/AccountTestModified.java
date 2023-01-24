//Queston 3.11: AccountTestModified.java
//Creating and manipulating an Account object

import java.util.Scanner;

public class AccountTestModified
{
	public static void main (String [] args)
	{	
		
		AccountModified account1 = new AccountModified("Jane Green", 50.00);
		AccountModified account2 = new AccountModified("John Blue", -7.53);
		
		//To display the initial balance of each object
		
		System.out.printf("%s balance: $%.2f\n", account1.getName(),account1.getBalance());
		
		System.out.printf("%s balance: $%.2f\n", account2.getName(),account2.getBalance());
		
		Scanner input = new Scanner (System.in);//create a Scanner object to obtain input from the command window
		
		//Deposit in account 1 only
		System.out.print("Enter deposit amount for account1: ");//Prompt for and read name
		double depositAmount = input.nextDouble();//read depositAmount by user
		
		System.out.printf("\nadding %.2f to account1 balance\n\n", depositAmount);
		account1.deposit(depositAmount);//add to account1's balance
		//display balances
		System.out.printf("%s balance: $%.2f\n", account1.getName(), account1.getBalance());	
		System.out.printf("%s balance: $%.2f\n", account2.getName(), account2.getBalance());	
		
		//Deposit in account 2 only
		System.out.print("Enter deposit amount for account2: ");//Prompt
		depositAmount = input.nextDouble();//read  a line of text
		
		System.out.printf("\nadding %.2f to account2 balance\n\n", depositAmount);
		account2.deposit(depositAmount);//add to account1's balance
		//display balances
		System.out.printf("%s balance: $%.2f\n", account1.getName(), account1.getBalance());	
		System.out.printf("%s balance: $%.2f\n", account2.getName(), account2.getBalance());	
		
		//withdrawal from account 1 only
		System.out.print("Enter withdrawal amount from account1: ");
		double withdrawalAmount = input.nextDouble(); //read input by user
		System.out.printf("\nsubtracting %.2f from account1 balance\n\n", withdrawalAmount);
		account1.withdraw(withdrawalAmount);
		
		//display balances
		System.out.printf("%s balance: $%.2f\n", account1.getName(), account1.getBalance());
		System.out.printf("%s balance: $%.2f\n", account2.getName(), account2.getBalance());
		
		//withdrawal from account2 only
		System.out.print("Enter withdrawal amount from account2: ");
		withdrawalAmount = input.nextDouble(); //read input by user
		System.out.printf("\nsubtracting %.2f from account2 balance\n\n", withdrawalAmount);
		account2.withdraw(withdrawalAmount);
		
		//display balances
		System.out.printf("%s balance: $%.2f\n", account1.getName(), account1.getBalance());
		System.out.printf("%s balance: $%.2f\n", account2.getName(), account2.getBalance());
		
		}//end main
		
}//end class AccountTestModified
	
