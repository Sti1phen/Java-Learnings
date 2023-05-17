package main.java.org.example.chapter4;
/*Top Calculator the salaries of 3 employee from the hours they worked.
FirstRefinement
Initialize variables
Input the hours worked by each employee, determine if more than 40 and calculate the excess hour with rate
Calculate gross Salary and display
SecondRefinement
Initialize number of employee =1;

While number of employee is less than 4
    Prompt user to input number of working hours
     Input number of working hours
     If number of working hours < 40
        Prompt user for normal hourly rate
        Input normal hourly rate
        Salary = number of working hours * normal rate
        Print Salary
     If number of working hours > 40
        Prompt and hourly rate(normal and overtime) separate by space
        Input normal hourly rate
        Input overtime rate
        Salary = 40 * normal hourly rate + number of working hours - 40 * overtime rate
        Print Salary
    move to the next employee;
 */

import java.util.Scanner;

public class SalaryCalculator {
    public static void main(String[] args) {
        int x =1;
        double Salary;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter Company's hourly rate: ");
        double z = input.nextDouble();
        while (x <= 3)
        {
            System.out.print("Enter employee's number of working hours: ");
            int y = input.nextInt();
            if (y <= 40)
            {
                Salary = (double) y * z;
                System.out.printf(" Employee's salary for this week is: $%.2f.\n\n",Salary);
            }
            if (y > 40)
            {
                Salary = ((40 * z)+ ((double) (y-40)*1.5*z));
                System.out.printf("Employee's salary for this week is: $%.2f.\n\n",Salary);
            }
            x++;
        }


    }
}