package main.java.org.projects.chapter5;
/*
Hint: Treat all monetary amounts as integral numbers
of pennies. Then break the result into its dollars and cents portions by using the division and
remainder operations, respectively. Insert a period between the dollars and the cents portions.
 */


public class ModifiedCompoundInterest {
    //Treat all monetary amount as integers of pennies
    public static void main(String[] args) {
        int amount; // amount on deposit at end of each year
        int principal = 100000; // initial amount before interest
        double rate = 0.05; // interest rate
        double power = (1+rate);
// display headers
        System.out.printf("%s%20s%n", "Year", "Amount on deposit");
// calculate amount on deposit for each of ten years
        for (int year = 1; year <= 10; ++year) {
// calculate new amount for specified year
            amount = (int) (principal * Math.pow(power, year));
          // System.out.printf("%d\n", amount);
            int dollar = amount/100;
            int cent = amount % 100;
// display the year and the amount
            System.out.printf("%4d%,15d.%d%n", year, dollar, cent);

        }
    }
}