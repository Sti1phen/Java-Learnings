package main.java.org.example.chapter3;//Question 3.12 Petrol.java
//An application that demonstrates the capabilities of class PetrolPurchase

import java.util.Scanner;

public class Petrol
{

	public static void main (String [] args)
	{	
		PetrolPurchase buyer1 = new PetrolPurchase("Ago Palace", "Gasoline", 5, 169.0, 5.0);
		
		//To display initial information about the purchase of the petrol of buyer1
		
		System.out.printf("\nThis is buyer1 reporting from %s. The price per liter of %s was %.2f as at when i bought %d liters this morning with a %.2f percent discount.\n",buyer1.getLocation(), buyer1.getPetrolType(), buyer1.getLiterPrice(), buyer1.getQuantity(), buyer1.getDiscount());
		
		Scanner input = new Scanner (System.in);
		
		//To calculate netPurchaseAmount of a quantity of a  PetrolType bought at a price per liter other than initial situation and a new discount %.
		
		System.out.print("\nEnter the type of petrol you bought: ");
		String petrolType = input.next();
		buyer1.setPetrolType(petrolType);//Put PetrolType local variable to the petrolType instance variable
		
		System.out.printf("\nEnter the price per liter of %s you bought: ", petrolType);
		
		double literPrice = input.nextDouble();
		buyer1.setLiterPrice(literPrice);//put literPrice as new instance variable literPrice value
		
		System.out.printf("\nEnter the quantity of %s you bought in liters: ", petrolType);
		
		int quantity = input.nextInt();
		buyer1.setQuantity(quantity);//put quantity of petrolType bought by buyer1 into instance variable quantity
		
		System.out.printf("\nEnter the percentage discount of %s you bought: ", petrolType);
		
		double discount = input.nextDouble();
		buyer1.setDiscount(discount);
		
		System.out.printf("\nThe net amount of %d liters of %s you bought at %.2f per litre and %.2f percentage discount is: %.2f", buyer1.getQuantity(), buyer1.getPetrolType(), buyer1.getLiterPrice(), buyer1.getDiscount(), buyer1.getPurchaseAmount());
		
		}//end main
		
}//end Class Petrol
		
		
		
		
