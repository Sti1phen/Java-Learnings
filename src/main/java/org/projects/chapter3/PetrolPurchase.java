package main.java.org.projects.chapter3;
//Question 3.12
//A class that represent information about petrol purchase containing 5 instance variables, set and get methods for each variable and a method to calculate net purchase amount

public class PetrolPurchase {

	private String location;//station's location
	private String petrolType;//type of petrol purchased
	private int quantity;//Quantity in liters
	private double literPrice;//Price per liter
	private double discount;//Percentage discount

	//Constructor initializing the five instance variables
	public PetrolPurchase(String location, String petrolType, int quantity,
						  double literPrice, double discount){
		this.location = location;
		
		this.petrolType = petrolType;
		
		if (quantity > 0)
			this.quantity = quantity;
		
		if (literPrice > 0.0)
			this.literPrice = literPrice;
		
		if (discount > 0.0)
			this.discount = discount;
		
	}
	
	
	public void setLocation(String location) {
		this.location = location;//set parameter location to instance variable location
	
	}
	
	public String getLocation() {
		return location;
	}
	
	public void setPetrolType(String petrolType) {
		this.petrolType = petrolType;//set parameter petrolType to instance variable petrolType
	
	}
	
	public String getPetrolType() {
		return petrolType;
		
	}
	
	public void setLiterPrice(double litrePrice) {
		literPrice = litrePrice;//set parameter litrePrice to instance variable literPrice
	
	}
	
	public double getLiterPrice() {
		return literPrice;
		
	}
	
	public void setQuantity(int quantity) {
		this.quantity = quantity;//set parameter quantity to instance variable quantity
	
	}
	
	public int getQuantity() {
		return quantity;
		
	}
	
	public void setDiscount(double discount) {
		this.discount = discount;//set parameter %discount to instance variable %discount
	
	}
	
	public double getDiscount() {
		return discount;
		
	}
	
	public double getPurchaseAmount() {
		double amountInLiters = quantity;

		double netPurchaseAmount = ((quantity * literPrice) - (discount * quantity * literPrice / 100));

		return netPurchaseAmount;
	
	}
	
}//end of class
