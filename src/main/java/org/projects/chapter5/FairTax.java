package main.java.org.projects.chapter5;

import java.util.Scanner;

/*
Prompt user to input expenses in the categories given
Input user response

Create an expense class to validate user response

Create a static method to calculate FairTax
Use exclusive method (0.3 * total expense)
 */
public class FairTax {
    public static void main(String[] args) {
        double housing, food, clothing, transportation, education, healthCare, vacations;
        Scanner input = new Scanner(System.in);

        System.out.println("Fair Tax Paid on Expenses\nPlease enter your expenses in the various categories\n");
        System.out.print("Housing: ");
        housing = input.nextDouble();
        System.out.print("Food: ");
        food = input.nextDouble();
        System.out.print("Clothing: ");
        clothing = input.nextDouble();
        System.out.print("Transportation: ");
        transportation = input.nextDouble();
        System.out.print("Education: ");
        education = input.nextDouble();
        System.out.print("Health Care: ");
        healthCare = input.nextDouble();
        System.out.print("Vacations: ");
        vacations = input.nextDouble();
        Expenses expenses1 = new Expenses(food,clothing,education,housing,healthCare,transportation,vacations);
expenses1.setFood(food);
expenses1.setClothing(clothing);
expenses1.setEducation(education);
expenses1.setHealthCare(healthCare);
expenses1.setTransportation(transportation);
expenses1.setHousing(housing);
expenses1.setVacations(vacations);

double totalExpenses = expenses1.getClothing()+ expenses1.getEducation()+expenses1.getFood()+expenses1.getHealthCare()+
        expenses1.getVacations()+expenses1.getHousing()+expenses1.getTransportation();
System.out.printf("Fair tax estimate paid on all expenses is:$ %.2f\n", getFairTax(totalExpenses));

}


    public static double getFairTax(double totalExpenses){
        return 0.23 * totalExpenses;
    }
}