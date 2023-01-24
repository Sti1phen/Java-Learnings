package org.example.chapter3;//Example 3.1: Account.java
//Account class that contains a name instance variable and methods to set and get its value
//With a constructor that initializes the name
//


public class Account
{
	private String name;//instance variable
	private double balance; //instance variable
	
	//Constructor initializes name with parameter name
	public Account(String name, double balance) //Account constructor receives two parameters
	{
		this.name = name;
		
		if (balance > 0.0)//validates that balnce is greater than 0.0; if not, it's initial value is 0.0
		
		this.balance = balance; //assigns parameter balance to instance variable
		
	}
	
	//method to deposit only a valid amount to balance
	public void deposit(double depositAmount)
	{
		if (depositAmount > 0.0) //if the depositAmount is valid
		balance = balance + depositAmount; //add it to balance
		
	}
	
	public double getBalance()  //methods returns the account balance
	{
		return balance;
	}
	
	//method to set the name in the object
	public void setName(String name)
	{
		this.name = name; //assigns the value of the parameter name to the class's name instance variable 
		
	}
	
	//method to retrieve the name from the object
	public String getName()
	{
		return name;//return value of name to caller
	}
	
}//end of class
	
