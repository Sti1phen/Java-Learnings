//Question 3.11 AccountModified.java
//AccountModified class that contains name and balance instance variables and five (5) methods to set and get its name, and balance respectively, and also withdraw from the account
//With a constructor that initializes name and balance variables
//


public class AccountModified
{
	private String name;//instance variable
	private double balance; //instance variable
	
	//Constructor initializes name and balance with parameter name and balance respectively
	public AccountModified(String name, double balance) //Account constructor receives two parameters
	
	{
		this.name = name;
		
		if (balance > 0.0)//validates that balance is greater than 0.0; if not, it's initial value is 0.0
		
		this.balance = balance; //assigns parameter balance to instance variable
		
	}
	
	//method to deposit only a valid amount to balance
	public void deposit(double depositAmount)
	
	{
		if (depositAmount > 0.0) //if the depositAmount is valid
		balance = balance + depositAmount; //add it to balance
		
	}
	
	//method to withdraw an amount from account
	public void withdraw(double withdrawalAmount)
	
	{
		if (withdrawalAmount <= balance)
		
		balance = balance - withdrawalAmount;//subtract amount withdrawn from balance to get new balance
		
		if (withdrawalAmount > balance)
		System.out.println("Withdrawal amount exceeded account balance.\n");
		
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
	
