package main.java.org.exercises.chapter3;
//Question 3.13
//Class Car with 3 instance variables, set and get methods and object price display

public class Car {
	private String model;
	private String year;
	private double price;

	public Car(String model, String year, double price) {
		this.model = model;
		this.year = year;
		
		if (price > 0.0)
			this.price = price;
	}
	
	public void setModel(String model) {
		this.model = model;
	}
	
	public String getModel() {
		return model;
	}
	
	public void setYear(String year) {
		this.year = year;
	}
	
	public String getYear() {

		return year;
	}
	
	public void setPrice(double price) {
		if (price > 0.0)
			this.price = price;
	}
	
	public double getPrice() {
		return price;
	}
}//end Class Car
	
		
		
