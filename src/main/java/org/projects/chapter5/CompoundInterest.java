package main.java.org.projects.chapter5;
/*
Initialize variable
vary interest rate
for each interest rate
    Calculate amount per year for ten year at interest rate
    display year and amount for ten years
    increment rate


 */
public class CompoundInterest {
    public static void main(String[] args) {
        double amount; // amount on deposit at end of each year
        double principal = 1000.0; // initial amount before interest
        double rate; // interest rate


        //Vary interest rate
        for (rate =5; rate <=10; rate++) {
// display headers
            System.out.printf("Rate: %.1f\n%s%25s\n", rate, "Year", "Amount on deposit");
// calculate amount on deposit for each of ten years
            for (int year = 1; year <= 10; ++year) {
                double number = ((100 + rate) / 100);
// calculate new amount for specified year
                amount = principal * Math.pow(number, year);
// display the year and the amount
                System.out.printf("%4d%,20.2f%n", year, amount);
            }
        }
    }
} // end class Interest