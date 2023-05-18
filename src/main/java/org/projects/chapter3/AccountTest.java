package main.java.org.projects.chapter3;
//Question 3.15
////Example 3.2: AccountTest.java
//Creating and manipulating an Account object

import java.util.Scanner;

public class AccountTest {
	public static void main (String [] args) {
		
		Account account1 = new Account("Jane Green", 50.00);
		Account account2 = new Account("John Blue", -7.53);
		
		//To display the initial balance of each object
		
		displayAccount(account1);
		
		displayAccount(account2);
		
		Scanner input = new Scanner (System.in);//create a Scanner object to obtain input from the command window
		
		System.out.print("Enter deposit amount for account1: ");//Prompt for and read name
		double depositAmount = input.nextDouble();//read  a line of text
		
		System.out.printf("\nadding %.2f to account1 balance\n\n", depositAmount);
		account1.deposit(depositAmount);//add to account1's balance
		//display balances
		displayAccount(account1);
			
		displayAccount(account2);	
		
		System.out.print("Enter deposit amount for account2: ");//Prompt
		depositAmount = input.nextDouble();//read  a line of text
		
		System.out.printf("\nadding %.2f to account2 balance\n\n", depositAmount);
		account2.deposit(depositAmount);//add to account1's balance
		//display balances
		displayAccount(account1);
		
		displayAccount(account2);	
			
		}
	
	public static void displayAccount(Account accountToDisplay) {
		
		System.out.printf("%s balance: $%.2f\n", accountToDisplay.getName(), accountToDisplay.getBalance());
	}
	
}
	
//end class AccountTest
	
