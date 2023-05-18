package main.java.org.projects.chapter3;
//Question 3.13
//CarApplication class that test the capabilities of class Car

import java.util.Scanner;

public class CarApplication {
	public static void main(String [] args) {
		Car car1 = new Car("BMW", "2018", 2000);
		Car car2 = new Car("Mercedes Benz", "2020", 4000);
		
		Scanner input = new Scanner(System.in); 
		
		System.out.print("Calculating the Discount Price of Car 1 and Car 2 with discount of 5 and 7 percent respectively.\n\n");
	
		
		System.out.print("Enter the model, year and the price of the first car separating them with a space: ");
		String model1 = input.next();
		String year1 = input.next();
		double price1 = input.nextDouble();
		
		car1.setYear(year1);
		car1.setModel(model1);
		car1.setPrice(price1);
		
		System.out.printf("The Price of %s %s is: $%.1f.\n", car1.getYear(), car1.getModel(), car1.getPrice());
		
		System.out.print("\n\nEnter the model, year and the price of the second car " +
				"separating your input with a space: ");
		String model2 = input.next();
		String year2 = input.next();
		double price2 = input.nextDouble();
		
		car2.setYear(year2);
		car2.setModel(model2);
		car2.setPrice(price2);
		
		System.out.printf("The Price of %s %s is: $%.1f.\n\n", car2.getYear(), car2.getModel(), car2.getPrice());
		
		double discount1 = 0.05;
		
		double discount2 = 0.07;
		
		double discountPrice1 = car1.getPrice() - (discount1 * car1.getPrice());
		
		double discountPrice2 = car2.getPrice() - (discount2 * car2.getPrice());
		
		System.out.printf("The discounted price of %s %s is: $%.1f.\n", car1.getYear(), car1.getModel(), discountPrice1);
		
		System.out.printf("The discounted price of %s year %s is: $%.1f.\n", car2.getYear(), car2.getModel(), discountPrice2);
		
	}//end main
	
}//end class CarApplication
